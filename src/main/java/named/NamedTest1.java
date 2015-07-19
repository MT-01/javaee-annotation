package named;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "namedTest1", urlPatterns = {"/namedTest1"})
public class NamedTest1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {
        
        req.getRequestDispatcher("named/namedTest1.jsp").forward(req, res);
    }
}
