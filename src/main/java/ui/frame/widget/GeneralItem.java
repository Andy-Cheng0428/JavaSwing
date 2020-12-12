package ui.frame.widget;

import org.apache.commons.collections4.CollectionUtils;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.util.ArrayList;
import java.util.List;

/**
 * SwingsProject
 * Usage :
 * Created By Andy on 2020/12/12 17:16:56
 */
public class GeneralItem extends JPanel {
    private SpringLayout springLayout = new SpringLayout();
    private List<JComponent> components = new ArrayList<>();


    public void addComponent(JComponent jComponent) {
        this.add(jComponent);
        components.add(jComponent);
        refreshLayout();
    }

    private void refreshLayout() {
        int size = components.size();
        if (CollectionUtils.isEmpty(components)) {
            return;
        }
        int a = getPreferredSize().width;
        int columnWidth = getWidth() / size; //各欄欄寬

        for (int i = 0; i < size; i++) {
            if (i == 0) {
                //首項
                springLayout.putConstraint(SpringLayout.WEST, components.get(i), 1, SpringLayout.WEST, this);
                springLayout.putConstraint(SpringLayout.EAST, components.get(i), columnWidth, SpringLayout.WEST, this);
            } else {
                springLayout.putConstraint(SpringLayout.WEST, components.get(i), 1, SpringLayout.EAST, components.get(i - 1));
                springLayout.putConstraint(SpringLayout.EAST, components.get(i), columnWidth, SpringLayout.EAST, components.get(i - 1));
            }
        }

    }

    {
        setLayout(springLayout);
    }
}
