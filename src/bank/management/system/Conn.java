/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            //driver ko register krkege
            // jar mysql coonectoor add krne se iski ki jaruat nhi hai add krne ki ki yeh automatic krta hai sbh
          // Class.forName(com.mysql.cj.jdbc.Driver);
        //2 step connection ko create krna 
        c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","varun1998");
        //craete stateent
        s=c.createStatement();
        }
        catch(Exception e){
            System.err.println("e");
        }
    }
    
}
