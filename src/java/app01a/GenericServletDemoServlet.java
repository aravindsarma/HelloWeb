/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package app01a;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Aravind Sarma Yeluripati
 */
@WebServlet(
    name = "GenericServletDemoServlet",
    urlPatterns={"/generic"},
    initParams ={
        @WebInitParam(name="admin",value="Harry Potter"),
        @WebInitParam(name="email",value="admin@example.com")
    }
)
public class GenericServletDemoServlet extends GenericServlet {

    private static final long serialVersionUID = 62500890L;
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        ServletConfig config = getServletConfig();
        String admin = config.getInitParameter("admin");
        String email = config.getInitParameter("email");
                res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        writer.print("<html><head></head><body>"
                +"Admin:"+admin
                +"<br />Email:"+email
                +"</body></html>");
    }
}
