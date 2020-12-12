package ui.frame.widget.component;

import ui.ColorUtils;
import javax.swing.JButton;


/**
 * SwingsProject
 * Usage :
 * Created By Andy on 2020/12/08 02:54:50
 */
public class MyButton extends JButton {

    public MyButton() {}

    public MyButton(String text) {
        setText(text);
    }

    {
        setBorder(null);
        setFont(ColorUtils.GENERAL_FONT_CH);

        setBackground(ColorUtils.COLOR_TEXT_BACKGROUND);
        setForeground(ColorUtils.COLOR_TEXT);

        setVerticalAlignment(CENTER);
        setHorizontalAlignment(CENTER);
        setHorizontalTextPosition(TRAILING);

    }
}
