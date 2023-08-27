import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class GUI {
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    public GUI(){
        openWindow();
    }
    public void openWindow(){
        JFrame windowApp = new JFrame("Rocket Simulation");
        windowApp.setSize(600, 400);
//        windowApp.setLayout(new GridLayout(3, 1));
        windowApp.setVisible(true);
        windowApp.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
    }
}
