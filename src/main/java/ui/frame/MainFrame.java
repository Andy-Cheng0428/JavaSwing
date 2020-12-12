package ui.frame;

import ui.frame.widget.GeneralItem;
import ui.frame.widget.component.GeneralPanel;
import ui.frame.widget.component.MyButton;
import ui.frame.widget.component.MyLabel;
import ui.frame.widget.component.MyTextArea;

import javax.swing.WindowConstants;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * SwingsProject
 * Usage : 主畫面
 * 為Window之子類別，預設Layout為BorderLayout
 * Layout型態共用FlowLayout、BorderLayout、CardLayout、GridLayout、
 * Created By Andy on 2020/12/05 16:34:29
 */
public class MainFrame extends BaseFrame {

    private MainFrame () {
        super();

        setSize(FrameUtils.getFullScreenDimension());
        GeneralItem textItem = new GeneralItem();
        textItem.setSize(FrameUtils.getFullScreenDimension());
        textItem.addComponent(new MyLabel("File"));
        textItem.addComponent(new MyButton("My Test Button"));
        textItem.addComponent(new MyTextArea());
        GeneralPanel panel = new GeneralPanel.Builder().add(new MyLabel("賢福竟剛剛毒發")).add(new MyLabel("File")).add(new MyButton("My Test Button")).add(new MyTextArea()).setSize(getWidth(),  getHeight()).build();
        setContentPane(panel);


        /** WindowConstants.DO_NOTHING_ON_CLOSE 不執行任何動作*/
        /** WindowConstants.HIDE_ON_CLOSE 當關閉視窗時，隱藏視窗*/
        /** WindowConstants.DISPOSE_ON_CLOSE 當關閉視窗時，則移除視窗，並釋放其所占用的資源（預設值）*/
        /** WindowConstants.EXIT_ON_CLOSE 當關閉視窗時，則結束應用程式*/
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //設定關閉操作時，結束應用程式
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setTitle("主程式");
        setVisible(true);
    }



    private static class InstanceHolder  {
        private static final MainFrame instance = new MainFrame();
    }



    public static MainFrame getInstance() {
        return InstanceHolder.instance;
    }

}
