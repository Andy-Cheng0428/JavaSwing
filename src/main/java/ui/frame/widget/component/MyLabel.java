package ui.frame.widget.component;

import ui.ColorUtils;
import javax.swing.JLabel;

/**
 * SwingsProject
 * Usage :
 * Created By Andy on 2020/12/08 02:26:05
 */
public class MyLabel extends JLabel {

    public MyLabel() {}

    public MyLabel(String text) {
        setText(text);
    }

    {
        setBorder(null);
        setFont(ColorUtils.GENERAL_FONT_CH);

        setBackground(ColorUtils.COLOR_TEXT_BACKGROUND);
        setForeground(ColorUtils.COLOR_TEXT);

        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
        setVerticalTextPosition(CENTER);

        setHorizontalTextPosition(TRAILING);
        setHorizontalAlignment(LEADING);
    }
}
