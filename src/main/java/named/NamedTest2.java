package named;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "namedTest2", urlPatterns = {"/namedTest2"})
public class NamedTest2 extends HttpServlet {

    @Inject
    NamedBean namedBean;
    
    @Inject
    NamedLogic namedLogic;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {
        
        req.setCharacterEncoding("UTF-8");
        namedBean.setName(req.getParameter("name"));
        namedLogic.changeName(namedBean.getName() + "様");
        System.out.println(namedBean.sayHello());
        req.setAttribute("namedBean", namedBean);
        req.getRequestDispatcher("named/namedTest2.jsp").forward(req, res);
    }
}
