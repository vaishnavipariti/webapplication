
package Coaching;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class LoginClass {
public static boolean validate(String uname, String psw)
{   boolean status=false;
   try{       Class.forName("org.apache.derby.jdbc.ClientDriver");
      }catch( ClassNotFoundException cnfe){}
   try{
       Connection con;
    con = DriverManager.getConnection("jdbc:derby://localhost:1527/coaching","vaishnavi","pariti");
        PreparedStatement ps = con.prepareStatement("select from LOGINTABLE where USERNAME= ? and  PASSWORD= ? ");
        ps.setString(1,uname);  
        ps.setString(2,psw);  
      
        ResultSet rs=ps.executeQuery();  
        
        status =rs.next();  
        
   } catch( SQLException e){}
   return status; 
}
}