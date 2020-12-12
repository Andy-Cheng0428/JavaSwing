package ui.frame;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * SwingsProject
 * Usage :
 * Created By Andy on 2020/12/05 16:39:39
 */
public class FrameUtils {
    /**
     * 取得全螢幕尺寸
     * @return 全螢幕尺寸
     */
    public static Dimension getFullScreenDimension() {
        return Toolkit.getDefaultToolkit().getScreenSize();
    }
}
