package ui;

import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;

/**
 * SwingsProject
 * Usage :
 * Created By Andy on 2020/12/08 01:49:13
 */
public @interface ColorUtils {
     Color PRIMARY_COLOR_1 = new Color(69, 73, 74);
     Color PRIMARY_COLOR_2 = new Color(78,78,78);
     Color PRIMARY_COLOR_3 = new Color(78,78,78);

     Color SECONDARY_COLOR_1 = new Color(78,78,78);
    Color SECONDARY_COLOR_2 = new Color(78,78,78);
    Color SECONDARY_COLOR_3 = new Color(78,78,78);

    Color COLOR_TEXT_BACKGROUND = new Color(43,43,43);
    Color COLOR_TEXT = new Color(187,187,187);

    Font GENERAL_FONT = new Font("Default", Font.PLAIN, 12);
    Font GENERAL_FONT_CH = new Font("Default", Font.PLAIN, 12);

    Border border = new BasicBorders.FieldBorder(PRIMARY_COLOR_1,PRIMARY_COLOR_1,PRIMARY_COLOR_1,PRIMARY_COLOR_1);
}
