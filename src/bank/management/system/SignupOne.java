/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import java.util.*;
import javax.swing.*; 
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
import javax.swing.plaf.metal.MetalBorders;
public class SignupOne extends JFrame implements ActionListener{
    
    // global declareekrege
    long random;
    JTextField  nameTextField,FnameTextField,emailtextfield,addresstextfield,citytextfield
     ,statetextfield,pintextfield;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser datechooser;
    // constructor
    SignupOne(){
        //stlayout null hoga tbhi bordeer bounds tbhi kaam krta hai
        setLayout(null);
        Random ran=new Random();
         random=Math.abs((ran.nextLong()%9000L)+1000L);
        
        JLabel formno=new JLabel("APPLICATION FORM NO."+random);
        formno.setFont(new Font("Osward",Font.BOLD,38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
          JLabel personDetails=new JLabel("Page 1 :Personal Details");
        personDetails.setFont(new Font("Osward",Font.BOLD,22));
        personDetails.setBounds(290, 80, 400, 30);
        add(personDetails);
        
          JLabel name=new JLabel("Name:");
        name.setFont(new Font("Osward",Font.BOLD,20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        //text field create
        nameTextField=new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        
        
        
          JLabel fname=new JLabel("Father'Name:");
        fname.setFont(new Font("Osward",Font.BOLD,20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        //text field create
         FnameTextField=new JTextField();
        FnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        FnameTextField.setBounds(300, 190, 400, 30);
        add(FnameTextField);
        
          JLabel dob=new JLabel("Date  of Birth:");
        dob.setFont(new Font("Osward",Font.BOLD,20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        // date chooser using jar file jcalender
         datechooser=new JDateChooser();
        datechooser.setBounds(300, 240, 400, 30);
        datechooser.setForeground(Color.red);
        datechooser.setBackground(Color.red);
        add(datechooser);
        
          JLabel gender=new JLabel("Gender:");
        gender.setFont(new Font("Osward",Font.BOLD,20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        // radio button for gender
         male=new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
         female=new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        
          JLabel email=new JLabel("Email:");
        email.setFont(new Font("Osward",Font.BOLD,20));
        email.setBounds(100, 340, 200, 30);
        add(email);
        
        //text field create
         emailtextfield=new JTextField();
        emailtextfield.setFont(new Font("Raleway",Font.BOLD,14));
        emailtextfield.setBounds(300, 340, 400, 30);
        add(emailtextfield);
        
          JLabel marital=new JLabel("Marital Status:");
        marital.setFont(new Font("Osward",Font.BOLD,20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        
        // radio button for gender
         married=new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
         unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
                
         other =new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup maritalgrp=new ButtonGroup();
        maritalgrp.add(married);
        maritalgrp.add(unmarried);
        
        maritalgrp.add(other);
        
        
          JLabel address=new JLabel("Address:");
        address.setFont(new Font("Osward",Font.BOLD,20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        //text field create
         addresstextfield=new JTextField();
        addresstextfield.setFont(new Font("Raleway",Font.BOLD,14));
        addresstextfield.setBounds(300, 440, 400, 30);
        add(addresstextfield);
        
        
          JLabel city=new JLabel("City:");
        city.setFont(new Font("Osward",Font.BOLD,20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        //text field create
         citytextfield=new JTextField();
        citytextfield.setFont(new Font("Raleway",Font.BOLD,14));
        citytextfield.setBounds(300, 490, 400, 30);
        add(citytextfield);
        
          JLabel state=new JLabel("State:");
        state.setFont(new Font("Osward",Font.BOLD,20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        //text field create
         statetextfield=new JTextField();
        statetextfield.setFont(new Font("Raleway",Font.BOLD,14));
        statetextfield.setBounds(300, 540, 400, 30);
        add(statetextfield);
        
        
          JLabel pincode=new JLabel("Pincode:");
        pincode.setFont(new Font("Osward",Font.BOLD,20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        //text field create
         pintextfield=new JTextField();
        pintextfield.setFont(new Font("Raleway",Font.BOLD,14));
        pintextfield.setBounds(300, 590, 400, 30);
        add(pintextfield);
        
        // button next
        JButton next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground( Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        // action next button pr lagana hai
        next.addActionListener(this);
        add(next);
        
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
    public void actionPerformed(ActionEvent ae){
        String formno=""+random;// from no ek long no hai to hum typecaste krna hoga string mai cobert krne kai liye
        String name=nameTextField.getText();//settext
        String fname=FnameTextField.getText();
        String dob=((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
    String gender=null;
    if(male.isSelected()){
        gender="Male";
    }
    else if(female.isSelected()){
     gender="female";   
    }
    String email=emailtextfield.getText();
    String marital=null;
    if(married.isSelected()){
        marital="Married";
    }
    else if(married.isSelected()){
        marital="Unmarried";
    }
    else if(married.isSelected()){
        marital="Other";
    }
    String address=addresstextfield.getText();
    String city=citytextfield.getText();
    String state=statetextfield.getText();
    String pin=pintextfield.getText();
    try{
        //name empty hai to joptionpane se hum message dal skte hai
       if(name.equals("")){
           JOptionPane.showMessageDialog(null, "Name is required");
       } 
        if(fname.equals("")){
           JOptionPane.showMessageDialog(null, "Father name is required");
       } 
       if(address.equals("")){
           JOptionPane.showMessageDialog(null, "Address is required");
       } 
       if(city.equals("")){
           JOptionPane.showMessageDialog(null, "City is required");
       } 
       if(state.equals("")){
           JOptionPane.showMessageDialog(null, "State is required");
       } 
       if(pin.equals("")){
           JOptionPane.showMessageDialog(null, "Pincode is required");
       } 
       if(marital.equals("")){
           JOptionPane.showMessageDialog(null, "Marital is required");
       } 
       if(email.equals("")){
           JOptionPane.showMessageDialog(null, "Email is required");
       } 
       if(gender.equals("")){
           JOptionPane.showMessageDialog(null, "Gender is required");
       } 
       
       else{
           // mysql query likhi hai
           Conn c=new Conn();
           // insert into (query )likho accordingg to mysql query ki hisbh se
           String query="Insert into signup value('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
         // now mysql execute krege Conn class se(statement ki help se dml command execute update
           c.s.executeUpdate(query);
       }
       
       
       
       
       
    }
    catch(Exception  e){
        System.err.println(e);  
    }
    }
    
    public static void main(String[] args) {
//        SignupOne signupOne = new SignupOne(); 
//        System.out.println( signupOne);
        new SignupOne();
    }
   
}
