/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*; 
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{
    
    // global declareekrege
  
    JTextField  pan,aadhar;
    JRadioButton syes,sno,eyes,eno;
    

    JComboBox religion,category,occupation,education,income;
      String formno;
    
    // constructor
    SignupTwo(String formno){
        //stlayout null hoga tbhi bordeer bounds tbhi kaam krta hai
        setLayout(null);
        this.formno=formno;
        setTitle("NEW ACCOUNT APPLICATION FORM PAGE-2");
        
          JLabel additionalDetails=new JLabel("Page 1 :Additional Details");
        additionalDetails.setFont(new Font("Osward",Font.BOLD,22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
          JLabel name=new JLabel("Religion:");
        name.setFont(new Font("Osward",Font.BOLD,20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        // religion jcombo box create
        String valreligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
         religion=new JComboBox(valreligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        //text field create
//        nameTextField=new JTextField();
//        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        nameTextField.setBounds(300, 140, 400, 30);
//        add(nameTextField);
        
  JLabel fname=new JLabel("Category:");
        fname.setFont(new Font("Osward",Font.BOLD,20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        //category box create
        String valcategory[]={"General","OBC","SC","ST"};
         category=new JComboBox(valcategory);
        category.setBackground(Color.WHITE);
        category.setBounds(300, 190, 400, 30);
        
        add(category);
        
        
        //text field create
//         FnameTextField=new JTextField();
//        FnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        FnameTextField.setBounds(300, 190, 400, 30);
//        add(FnameTextField);
        
        // income category box create
        String incomecategory[]={"Null","<1,50000","<2,50,0000","<5,00,000","Upto 10,00,000"};
         income=new JComboBox(incomecategory);
        income.setBackground(Color.WHITE);
        income.setBounds(300, 240, 400, 30);
        
        add(income);
          JLabel dob=new JLabel("INCOME:");
        dob.setFont(new Font("Osward",Font.BOLD,20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        // date chooser using jar file jcalender
//         datechooser=new JDateChooser();
//        datechooser.setBounds(300, 240, 400, 30);
//        datechooser.setForeground(Color.red);
//        datechooser.setBackground(Color.red);
//        add(datechooser);
        
          JLabel gender=new JLabel("EDUCATION:");
        gender.setFont(new Font("Osward",Font.BOLD,20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
      
        
         
          JLabel email=new JLabel("QUALIFICATION:");
        email.setFont(new Font("Osward",Font.BOLD,20));
        email.setBounds(100, 315, 200, 30);
        add(email);
        // income category box create
        String educationValues[]={"Non Graduation ","Graduate","Post-Graduate","Doctrate","Other"};
         education=new JComboBox(educationValues);
        education.setBackground(Color.WHITE);
        education.setBounds(300, 315, 400, 30);
        
        add(education);
        
        //text field create
//         emailtextfield=new JTextField();
//        emailtextfield.setFont(new Font("Raleway",Font.BOLD,14));
//        emailtextfield.setBounds(300, 340, 400, 30);
//        add(emailtextfield);
        
          JLabel marital=new JLabel("OCCUPATIONAL:");
        marital.setFont(new Font("Osward",Font.BOLD,20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
            String occupationValues[]={"Salaried ","Self Employed","Bussiness","Student","Retired","Other"};
         occupation=new JComboBox(occupationValues);
        occupation.setBackground(Color.WHITE);
        occupation.setBounds(300, 390, 400, 30);
        
        add(occupation);
        
        
//        // radio button for gender
//         married=new JRadioButton("Married");
//        married.setBounds(300, 390, 100, 30);
//        married.setBackground(Color.WHITE);
//        add(married);
//         unmarried=new JRadioButton("Unmarried");
//        unmarried.setBounds(450, 390, 100, 30);
//        unmarried.setBackground(Color.WHITE);
//        add(unmarried);
//                
//         other =new JRadioButton("Other");
//        other.setBounds(630, 390, 100, 30);
//        other.setBackground(Color.WHITE);
//        add(other);
        
//        ButtonGroup maritalgrp=new ButtonGroup();
//        maritalgrp.add(married);
//        maritalgrp.add(unmarried);
//        
//        maritalgrp.add(other);
        
        
          JLabel address=new JLabel("Pan number:");
        address.setFont(new Font("Osward",Font.BOLD,20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        //text field create
         pan=new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        
          JLabel aadhars=new JLabel("Aadhar number:");
        aadhars.setFont(new Font("Osward",Font.BOLD,20));
        aadhars.setBounds(100, 490, 200, 30);
        add(aadhars);
        
        //text field create
         aadhar=new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
        
          JLabel state=new JLabel("Senior citizen:");
        state.setFont(new Font("Osward",Font.BOLD,20));
        state.setBounds(100, 540, 200, 30);
        add(state);
       syes=new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
           sno=new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup maritalgrp=new ButtonGroup();
        maritalgrp.add(syes);
        maritalgrp.add(sno);
        
        //radio button need
        
//        //text field create
//         statetextfield=new JTextField();
//        statetextfield.setFont(new Font("Raleway",Font.BOLD,14));
//        statetextfield.setBounds(300, 540, 400, 30);
//        add(statetextfield);
        
        
          JLabel pincode=new JLabel("Existing Account:");
        pincode.setFont(new Font("Osward",Font.BOLD,18));
        pincode.setBounds(100, 590, 200, 30);
     add(pincode);
     eyes=new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
           eno=new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        
        ButtonGroup emaritalgrp=new ButtonGroup();
        emaritalgrp.add(eyes);
        emaritalgrp.add(sno);
        
     
     
     
//        //text field create
//         pintextfield=new JTextField();
//        pintextfield.setFont(new Font("Raleway",Font.BOLD,14));
//        pintextfield.setBounds(300, 590, 400, 30);
//        add(pintextfield);
        
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
      //  String formno=""+random;// from no ek long no hai to hum typecaste krna hoga string mai cobert krne kai liye
        String sreligion=(String) religion.getSelectedItem();//dropdown mai se data le skte hai by getselected item
        String scategory=(String) category.getSelectedItem();
        String sincome=(String) income.getSelectedItem();
             String seducation=(String) education.getSelectedItem();
                  String soccupation=(String) occupation.getSelectedItem();
   
   
   
    String seniorcitizen=null;
    if(syes.isSelected()){
        seniorcitizen="yes";
    }
    else if(sno.isSelected()){
     seniorcitizen="No";   
    }
 // String email=emailtextfield.getText();
    String existingaccount=null;
    if(eyes.isSelected()){
        existingaccount="Yes";
    }
    else if(eno.isSelected()){
        existingaccount="No";
    }
    
    String span=pan.getText();
    String saadhar=aadhar.getText();
    try{
        //name empty hai to joptionpane se hum message dal skte hai
       
       
           // mysql query likhi hai
           Conn c=new Conn();
           // insert into (query )likho accordingg to mysql query ki hisbh se
           String query="Insert into signuptwo value('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
         // now mysql execute krege Conn class se(statement ki help se dml command execute update
           c.s.executeUpdate(query);
           //signUp3 Object
       }
       
       
       
       
       
    
    catch(Exception  e){
        System.err.println(e);  
    }
    }
    
    public static void main(String[] args) {
//        SignupOne signupOne = new SignupOne(); 
//        System.out.println( signupOne);
        new SignupTwo("");
    }
   
}
