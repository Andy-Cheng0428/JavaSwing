import ui.Theme;
import ui.frame.MainFrame;

import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class MainClass {
    public static void main(String[] args) {
        try {
            MetalLookAndFeel.setCurrentTheme(new Theme());
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");

        } catch (Exception a) {
            System.out.print(a.getLocalizedMessage());
        }
        final MainFrame mainFrame = MainFrame.getInstance();
    }
}