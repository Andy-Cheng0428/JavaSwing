package ui.frame.widget.component;

import ui.ColorUtils;

import javax.swing.DropMode;
import javax.swing.JTextArea;


/**
 * SwingsProject
 * Usage :
 * Created By Andy on 2020/12/08 13:14:50
 */
public class MyTextArea extends JTextArea {


    {
        setBorder(null);
        setBackground(ColorUtils.COLOR_TEXT_BACKGROUND);
        setForeground(ColorUtils.COLOR_TEXT);
        setDropMode(DropMode.USE_SELECTION);
    }
}
