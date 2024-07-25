/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login  extends JFrame implements ActionListener{
    
    // globally defined button isko hum bhar bhi use kr skte iske liye globally defined
    JButton login,clear,signup;
    // global ddeclaration textfields
    JTextField cardtestfields;
    JPasswordField pintextfields;
    
    Login(){
        // set title 
        setLayout(null);// null krne pr yeh border layout nhi uthyiga custom layout uthyiga
        setTitle("AUTOMATED TELLER MACHINE");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
         Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
         ImageIcon i3= new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        //text add
         JLabel text = new JLabel("Welcome to ATM");
        text.setBounds(200, 40, 400, 40);
         text.setFont(new Font("Osward",Font.BOLD,38));
         add(text);
         // card no 
         
         JLabel cardno = new JLabel(" CARD-NO");
        cardno.setBounds(120, 150, 150, 30);
         cardno.setFont(new Font("Osward",Font.BOLD,28));
         add(cardno);
          cardtestfields=new JTextField();
         cardtestfields.setBounds(300,150,230,30);
         cardtestfields.setFont(new Font("Arial",Font.BOLD,14));
         add(cardtestfields);
         // pin no
         
         JLabel pinno = new JLabel("Pin number");
        pinno.setBounds(120, 220, 250, 30);
         pinno.setFont(new Font("Osward",Font.BOLD,28));
         add(pinno);
         
           pintextfields=new JPasswordField();
         pintextfields.setBounds(300,220,230,30);
         
         pintextfields.setFont(new Font("Arial",Font.BOLD,14));
         add(pintextfields);
         
         // button add
          login=new JButton("Sign IN");
         login.setBounds(300, 300, 100, 30);
         login.setBackground(Color.black);
         login.setForeground(Color.white);
          login.addActionListener(this);
         add(login);
        
          clear=new JButton("Clear");
         clear.setBounds(430, 300, 100, 30);
         clear.setBackground(Color.black);
         clear.setForeground(Color.white);
          clear.addActionListener(this);
         add(clear);
          signup=new JButton("Signup");
         signup.setBounds(300, 350, 230, 30);
         signup.setBackground(Color.black);
         signup.setForeground(Color.white);
          signup.addActionListener(this);
         add(signup);
         
         
         //
         getContentPane().setBackground(Color.white);
        
       // function use for creating frame
     setSize(800,480);
     // set visible is used for visible a frame 
        setVisible(true);
        // we could change location of this frame 
        setLocation(350,200);
    }public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardtestfields.setText("");
            pintextfields.setText("");
            
        }else if(ae.getSource()==login){
            
        }else if(ae.getSource()==signup){
            setVisible(false);
            new SignupOne().setVisible(true);
    }}
    public static void main(String[] args) {
        new Login();
    }
    
}
