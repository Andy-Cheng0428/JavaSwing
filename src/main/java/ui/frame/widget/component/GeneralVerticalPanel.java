package ui.frame.widget.component;

import org.apache.commons.collections4.CollectionUtils;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.util.ArrayList;
import java.util.List;

/**
 * JavaSwing
 * Usage : 直向Panel
 * Created By Andy on 2020/12/14 22:19:40
 */
public class GeneralVerticalPanel extends JPanel {


    public static class Builder {
        private List<JComponent> components = new ArrayList<>();
        private int width;
        private int height;

        public GeneralVerticalPanel.Builder add(JComponent jComponent) {
            components.add(jComponent);
            return this;
        }

        public GeneralVerticalPanel.Builder setSize(int width, int height) {
            this.height = height;
            this.width = width;
            return this;
        }

        public GeneralVerticalPanel build() {
            final GeneralVerticalPanel panel = new GeneralVerticalPanel();
            if (CollectionUtils.isEmpty(components)) {
                return panel;
            }
            components.forEach(component->{
                panel.add(component);
            });
            SpringLayout springLayout = new SpringLayout();
            panel.setLayout(springLayout);
            int size = components.size();
            int columnHeight = this.height / size;
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    //首項
                    springLayout.putConstraint(SpringLayout.NORTH, components.get(i), 1, SpringLayout.NORTH, panel);
                    springLayout.putConstraint(SpringLayout.SOUTH, components.get(i), columnHeight, SpringLayout.NORTH, panel);
                } else {
                    springLayout.putConstraint(SpringLayout.NORTH, components.get(i), 1, SpringLayout.SOUTH, components.get(i - 1));
                    springLayout.putConstraint(SpringLayout.SOUTH, components.get(i), columnHeight, SpringLayout.SOUTH, components.get(i - 1));
                }
                springLayout.putConstraint(SpringLayout.WEST, components.get(i), 0, SpringLayout.WEST, panel);
                springLayout.putConstraint(SpringLayout.EAST, components.get(i),0,SpringLayout.EAST, panel);
            }
            return panel;
        }

    }
}
