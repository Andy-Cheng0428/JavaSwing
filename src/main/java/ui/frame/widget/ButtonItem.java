package ui.frame.widget;

import ui.frame.widget.component.MyButton;
import ui.frame.widget.component.MyLabel;
import ui.frame.widget.component.MyTextField;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.Dimension;

/**
 * SwingsProject
 * Usage :
 * Created By Andy on 2020/12/12 03:17:45
 */
public class ButtonItem extends JPanel {
    private int leftPaddingPercentage = 1;
    private int gapPercentage = 5;
    private int rightPaddingPercentage = 1;
    private SpringLayout springLayout = new SpringLayout();
    private MyLabel label = new MyLabel();
    private MyTextField textField = new MyTextField();
    private MyButton button = new MyButton();

    public ButtonItem(String labelStr, String buttonStr) {
        setLabelStr(labelStr);
        setButtonStr(buttonStr);
    }


    public void setLabelStr(String labelStr) {
        label.setText(labelStr);
    }
    public void setButtonStr(String buttonStr) {
        button.setText(buttonStr);
    }


    @Override
    public void setSize(int width, int height) {
        super.setSize(width, height);
        refreshLayout();
    }

    @Override
    public void setSize(Dimension d) {
        super.setSize(d);
        refreshLayout();
    }

    private void refreshLayout() {
        int width = getSize().width;
        springLayout.putConstraint(SpringLayout.WEST, label, width * leftPaddingPercentage / 100, SpringLayout.WEST, this);
        springLayout.putConstraint(SpringLayout.NORTH, label, 0, SpringLayout.NORTH, this);

        springLayout.putConstraint(SpringLayout.EAST, button, -width * rightPaddingPercentage / 100, SpringLayout.EAST, this);
        springLayout.putConstraint(SpringLayout.NORTH, button, 0, SpringLayout.NORTH, this);


        springLayout.putConstraint(SpringLayout.WEST, textField, width * gapPercentage / 100, SpringLayout.EAST, label);
        springLayout.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, this);
        springLayout.putConstraint(SpringLayout.EAST, textField, -width * gapPercentage / 100, SpringLayout.WEST, button);


    }


    {
        setLayout(springLayout);
        add(label);
        add(textField);
        add(button);
    }
}
