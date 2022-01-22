import javax.swing.*;
import java.awt.*;

//public class FrontPage extends JFrame {
//    FrontPage() {
//        this.setTitle("Employee Management System");
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setSize(840,480);
//        this.setVisible(true);
//        this.setResizable(false);
//        this.getContentPane().setBackground(new Color(255,255,255));
//        this.setLayout(null);
//
//        //TEXT PANEL
//        JPanel textPanel = new JPanel();
//        JLabel textLabel = new JLabel();
//        textLabel.setText("EMPLOYEE MANAGEMENT SYSTEM");
//        textLabel.setFont(new Font("Calibri", Font.BOLD, 30));
//        textPanel.setLayout(null);
//        textLabel.setBounds(175,5,840,100);
//        textPanel.setBounds(0,0,840,100);
//        textPanel.setBackground(Color.GREEN);
//        textPanel.add(textLabel);
//
//        //IMAGE PANEL
//        JPanel imagePanel = new JPanel();
//        imagePanel.setBounds(0,100,420,380);
//        imagePanel.setBackground(Color.BLACK);
//
//        //BUTTON PANEL
//        JButton buttonBox = new JButton();
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.add(buttonBox);
//        buttonPanel.setLayout(null);
//        buttonPanel.setBounds(420,100,420,380);
//        buttonBox.setBounds(100,130,200,75);
//        buttonPanel.setBackground(Color.GRAY);
//
//        this.add(imagePanel);
//        this.add(textPanel);
//        this.add(buttonPanel);
//    }
//}

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

class FrontPage implements ActionListener {
    JFrame f;
    JLabel id, l1;
    JButton b;

    FrontPage() {

        f = new JFrame("Employee Management System");
        f.setBackground(Color.red);
        f.setLayout(null);

        ImageIcon i1 = new ImageIcon("C:\\Users\\vmcri\\IdeaProjects\\EmployeeManagementSystem\\src\\main\\java\\icons\\front.jpg");
        Image i2 = i1.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);

        l1.setBounds(0, 150, 1360, 530);
        f.add(l1);


        b = new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);


        b.setBounds(500, 600, 300, 70);
        b.addActionListener(this);

        id = new JLabel();
        id.setBounds(0, 0, 1360, 750);
        id.setLayout(null);


        JLabel lid = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(80, 30, 1500, 100);
        lid.setFont(new Font("serif", Font.PLAIN, 70));
        lid.setForeground(Color.red);
        id.add(lid);

        id.add(b);
        f.add(id);


        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(1360, 750);
        f.setLocation(200, 100);

        while (true) {
            lid.setVisible(false); // lid =  j label
            try {
                Thread.sleep(500); //1000 = 1 second
            } catch (Exception e) {
            }
            lid.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b) {
            f.setVisible(false);
            new Login();
        }
    }
}