package Coaching;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    
    try (PrintWriter out = response.getWriter()) {
        String n=request.getParameter("uname");
        String p=request.getParameter("psw");
        
        
        if( LoginClass.validate(n,p))
        {   /*RequestDispatcher rd=request.getRequestDispatcher("servlet2");
            rd.forward(request,response);  */
            out.println("helllloooooooooooooooooooo");
        }
        else
        {   out.print("Sorry username or password error");
        /*RequestDispatcher rd=request.getRequestDispatcher("index.html");
        rd.include(request,response);  */
        }
    }  
    }  
}

