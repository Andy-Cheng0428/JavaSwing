package ui.frame.widget.component;

import org.apache.commons.collections4.CollectionUtils;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.util.ArrayList;
import java.util.List;

/**
 * SwingsProject
 * Usage : 橫向Panel
 * Created By Andy on 2020/12/12 19:09:39
 */
public class GeneralHorizontalPanel extends JPanel {

    public static class Builder {
        private List<JComponent> components = new ArrayList<>();
        private int width; //橫向Panel總寬度
        private int height; //橫向Panel總高度
        private int padding = 1;

        public Builder add(JComponent jComponent) {
            components.add(jComponent);
            return this;
        }

        public Builder setSize(int width, int height) {
            this.height = height;
            this.width = width;
            return this;
        }

        public void setPadding(int padding) {
            this.padding = padding;
        }

        public GeneralHorizontalPanel build() {
            final GeneralHorizontalPanel panel = new GeneralHorizontalPanel();
            if (CollectionUtils.isEmpty(components)) {
                return panel;
            }

            SpringLayout springLayout = new SpringLayout();
            panel.setLayout(springLayout);
            int componentCount = components.size();
            int totalColumnWidth = 0;
            int zeroWidthComponentCount = 0;
            for (JComponent component : components) {
                totalColumnWidth = totalColumnWidth + component.getWidth();
                if (component.getWidth() == 0) {
                    zeroWidthComponentCount++;
                }
            }
            int columnWidth = width / componentCount;
            // 計算若子項目中有設定寬度，其總寬度
            for (int i = 0; i < componentCount; i++) {
                JComponent component = components.get(i);
                int componentWidth = component.getWidth(); //組件設定長度
                int columnSettingWidth = totalColumnWidth > width ? componentWidth * width / totalColumnWidth : componentWidth == 0 ? (width-totalColumnWidth)/ zeroWidthComponentCount : componentWidth;
                int componentHeight = component.getHeight();
                /** Horizontal **/
                if (i == 0) {
                    springLayout.putConstraint(SpringLayout.WEST, component, padding, SpringLayout.WEST, panel);
                    springLayout.putConstraint(SpringLayout.EAST, component, columnSettingWidth, SpringLayout.WEST, panel);
                } else {
                    springLayout.putConstraint(SpringLayout.WEST, component, padding, SpringLayout.EAST, components.get(i - 1));
                    springLayout.putConstraint(SpringLayout.EAST, component,columnSettingWidth, SpringLayout.EAST, components.get(i - 1));
                }
                /** Vertical **/
                springLayout.putConstraint(SpringLayout.NORTH, component, 0, SpringLayout.NORTH, panel);
                springLayout.putConstraint(SpringLayout.SOUTH, component, 0, SpringLayout.SOUTH, panel);
                panel.add(components.get(i));
            }
            return panel;
        }

    }
}
