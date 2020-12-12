package ui;

import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;

/**
 * SwingsProject
 * Usage : 自定義主題，繼承DefaultMetalTheme或MetalTheme(需額外撰寫時間)
 * Created By Andy on 2020/12/05 18:13:07
 */
public class Theme extends DefaultMetalTheme {

    /**
     * 第一主要顏色，為有效視窗的邊框或系統文字，如標籤之顏色
     *
     * @return
     */
    @Override
    protected ColorUIResource getPrimary1() {
        return new ColorUIResource(78, 78, 78);
    }

    /**
     * 第二主要顏色，為卷軸的卷軸方塊、進度功能列的已執行進度部分即被選取物件如選單或選單項目等之顏色
     *
     * @return
     */
    @Override
    protected ColorUIResource getPrimary2() {
        return new ColorUIResource(78, 78, 78);
    }

    /**
     * 第三主要顏色，為有效視窗標題列顏色或文字編輯物件中被選取文字的背景顏色
     *
     * @return
     */
    @Override
    protected ColorUIResource getPrimary3() {
        return new ColorUIResource(60, 63, 65);
    }

    /**
     * 第一次要顏色，為3D效果之物件，如按鈕的邊框顏色
     *
     * @return
     */
    @Override
    protected ColorUIResource getSecondary1() {
        return new ColorUIResource(60, 63, 65);
    }

    /**
     * 第二次要顏色，為無效視窗的邊框顏色，按鈕按下時的顏色或非作用中的按鈕（Disable）與文字欄位之邊框顏色
     *
     * @return
     */
    @Override
    protected ColorUIResource getSecondary2() {
        return new ColorUIResource(60, 63, 65);
    }

    /**
     * 第三次要顏色，為無效視窗的標題列顏色或不可編輯（Noneditable）之文字欄位的背景顏色
     *
     * @return
     */
    @Override
    protected ColorUIResource getSecondary3() {
        return new ColorUIResource(60, 63, 65);
    }
}
