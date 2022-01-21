import javax.swing.*;
import java.awt.*;

public class FrontPage extends JFrame {
    FrontPage() {
        this.setTitle("Employee Management System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(840,480);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(255,255,255));
        this.setLayout(null);

        //TEXT PANEL
        JPanel textPanel = new JPanel();
        JLabel textLabel = new JLabel();
        textLabel.setText("EMPLOYEE MANAGEMENT SYSTEM");
        textLabel.setFont(new Font("Calibri", Font.BOLD, 30));
        textPanel.setLayout(null);
        textLabel.setBounds(175,5,840,100);
        textPanel.setBounds(0,0,840,100);
        textPanel.add(textLabel);


        this.add(textPanel);
    }
}
