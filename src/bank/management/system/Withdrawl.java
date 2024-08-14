/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;

/**
 *
 * @author//Varun Pratap Singh
 */



//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Withdrawl extends JFrame implements ActionListener {
    JTextField t1;
    JTextField t2;
    JButton b1;
    JButton b2;
    JButton b3;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    String pin;

    Withdrawl(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 960, 1080);
        this.add(l3);
        this.l1 = new JLabel("MAXIMUM WITHDRAWAL IS RS.10,000");
        this.l1.setForeground(Color.WHITE);
        this.l1.setFont(new Font("System", 1, 16));
        this.l2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        this.l2.setForeground(Color.WHITE);
        this.l2.setFont(new Font("System", 1, 16));
        this.t1 = new JTextField();
        this.t1.setFont(new Font("Raleway", 1, 25));
        this.b1 = new JButton("WITHDRAW");
        this.b2 = new JButton("BACK");
        this.setLayout((LayoutManager)null);
        this.l1.setBounds(190, 350, 400, 20);
        l3.add(this.l1);
        this.l2.setBounds(190, 400, 400, 20);
        l3.add(this.l2);
        this.t1.setBounds(190, 450, 330, 30);
        l3.add(this.t1);
        this.b1.setBounds(390, 588, 150, 35);
        l3.add(this.b1);
        this.b2.setBounds(390, 633, 150, 35);
        l3.add(this.b2);
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        this.setSize(960, 1080);
        this.setLocation(500, 0);
        this.setUndecorated(true);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String amount = this.t1.getText();
            Date date = new Date();
            if (ae.getSource() == this.b1) {
                if (this.t1.getText().equals("")) {
                    JOptionPane.showMessageDialog((Component)null, "Please enter the Amount to you want to Withdraw");
                } else {
                    Conn c1 = new Conn();
                    ResultSet rs = c1.s.executeQuery("select * from bank where pin = '" + this.pin + "'");
                    int balance = 0;

                    while(rs.next()) {
                        if (rs.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(rs.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(rs.getString("amount"));
                        }
                    }

                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog((Component)null, "Insuffient Balance");
                        return;
                    }

                    c1.s.executeUpdate("insert into bank values('" + this.pin + "', '" + date + "', 'Withdrawl', '" + amount + "')");
                    JOptionPane.showMessageDialog((Component)null, "Rs. " + amount + " Debited Successfully");
                    this.setVisible(false);
                    (new Transactions(this.pin)).setVisible(true);
                }
            } else if (ae.getSource() == this.b2) {
                this.setVisible(false);
                (new Transactions(this.pin)).setVisible(true);
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            System.out.println("error: " + var7);
        }

    }

    public static void main(String[] args) {
        (new Withdrawl("")).setVisible(true);
    }
}
