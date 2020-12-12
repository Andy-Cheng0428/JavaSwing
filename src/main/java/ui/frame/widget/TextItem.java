package ui.frame.widget;

import ui.frame.widget.component.MyLabel;
import ui.frame.widget.component.MyTextField;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.Dimension;


/**
 * SwingsProject
 * Usage : 左標籤 右輸入文字框
 * Created By Andy on 2020/12/06 21:40:53
 */
public class TextItem extends JPanel {
    private int leftPaddingPercentage = 2;
    private int rightPaddingPercentage = 2;
    private int gapPercentage = 5;
    private String labelStr;

    private MyTextField textField = new MyTextField();
    private MyLabel label = new MyLabel();
    private SpringLayout springLayout = new SpringLayout();

    public TextItem(String labelStr) {
        setTitle(labelStr);
    }

    public void setTitle(String title) {
        label.setText(title);
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
        springLayout.putConstraint(SpringLayout.WEST, textField, width * gapPercentage / 100, SpringLayout.EAST, label);
        springLayout.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, this);
        springLayout.putConstraint(SpringLayout.EAST, textField, -width * rightPaddingPercentage / 100, SpringLayout.EAST, this);
    }


    {
        setLayout(springLayout);
        add(label);
        add(textField);
    }
}
