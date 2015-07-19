package singleton;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "singletonTest1", urlPatterns = {"/singletonTest1"})
public class SingletonTest1 extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {
        
        req.getRequestDispatcher("singleton/singletonTest1.jsp").forward(req, res);
    }
}
