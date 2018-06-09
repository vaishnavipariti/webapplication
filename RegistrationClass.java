package Coaching;

import java.sql.*;

public class RegistrationClass {
public static void reg(String name, String username,int mob, String email, String pwd)
{   boolean status=false;
    try{      
        Class.forName("org.apache.derby.jdbc.ClientDriver");
    }catch( ClassNotFoundException cnfe){}
   
    try{ 
        Connection con= DriverManager.getConnection("jdbc:derby://localhost:1527/DS","Coaching","manager");   
        PreparedStatement ps = con.prepareStatement("insert into REGISTRATION values(?,?,?,?,?,?)");
       
        ps.setString(1, name);
        ps.setString(2, username);
        ps.setInt(3, mob ); // error ( mob type)
        ps.setString(4, email);
        ps.setString(5, pwd  );
        
        int i= ps.executeUpdate();      
            
       
   } catch( SQLException e){}
  
}
}