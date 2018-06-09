package Coaching;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    
        String name=request.getParameter("name");
        String username=request.getParameter("username");
        String pwd=request.getParameter("pwd");
        String mob=request.getParameter("mob");
        String email=request.getParameter("email");
        
        RegistrationClass.reg(name, username, mob, email, pwd); //mob incompatible type error
        
    }  
    }  
    

   }

