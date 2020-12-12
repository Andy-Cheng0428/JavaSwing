package ui.frame.widget.component;

import ui.ColorUtils;

import javax.swing.DropMode;
import javax.swing.JTextField;

/**
 * SwingsProject
 * Usage :
 * Created By Andy on 2020/12/08 01:10:27
 */
public class MyTextField extends JTextField {
    public MyTextField() {
        super();
    }


    {
        setBorder(null);
        setForeground(ColorUtils.COLOR_TEXT);
        setBackground(ColorUtils.COLOR_TEXT_BACKGROUND);
        setHorizontalAlignment(LEADING);
        setDropMode(DropMode.USE_SELECTION);
    }
}
