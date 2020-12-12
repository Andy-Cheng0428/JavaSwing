package ui.frame.widget.component;

import org.apache.commons.collections4.CollectionUtils;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.util.ArrayList;
import java.util.List;

/**
 * SwingsProject
 * Usage :
 * Created By Andy on 2020/12/12 19:09:39
 */
public class GeneralPanel extends JPanel {

    public static class Builder {
        private List<JComponent> components = new ArrayList<>();
        private int width;
        private int height;

        public Builder add(JComponent jComponent) {
            components.add(jComponent);
            return this;
        }

        public Builder setSize(int width, int height) {
            this.height = height;
            this.width = width;
            return this;
        }

        public GeneralPanel build() {
            final GeneralPanel panel = new GeneralPanel();
            if (CollectionUtils.isEmpty(components)) {
                return panel;
            }
            components.forEach(component->{
                panel.add(component);
            });
            SpringLayout springLayout = new SpringLayout();
            panel.setLayout(springLayout);
            int size = components.size();
            int columnWidth = this.width / size;
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    //首項
                    springLayout.putConstraint(SpringLayout.WEST, components.get(i), 1, SpringLayout.WEST, panel);
                    springLayout.putConstraint(SpringLayout.EAST, components.get(i), columnWidth, SpringLayout.WEST, panel);
                } else {
                    springLayout.putConstraint(SpringLayout.WEST, components.get(i), 1, SpringLayout.EAST, components.get(i - 1));
                    springLayout.putConstraint(SpringLayout.EAST, components.get(i), columnWidth, SpringLayout.EAST, components.get(i - 1));
                }
            }
            return panel;
        }

    }
}
