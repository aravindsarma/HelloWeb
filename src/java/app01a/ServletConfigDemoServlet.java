/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package app01a;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
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
    name = "ServletConfigDemoServlet",
    urlPatterns={"/servletConfigDemo"},
    initParams ={
        @WebInitParam(name="admin",value="Harry Potter"),
        @WebInitParam(name="email",value="admin@sakil.com")
    }
)
public class ServletConfigDemoServlet implements Servlet{
    
    private transient ServletConfig servletConfig;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.servletConfig = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

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

    @Override
    public String getServletInfo() {
        return "ServletConfig demo";
    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
