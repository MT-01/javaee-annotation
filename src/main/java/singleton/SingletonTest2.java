package singleton;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "singletonTest2", urlPatterns = {"/singletonTest2"})
public class SingletonTest2 extends HttpServlet {
    
    @Inject
    SingletonBean singletonBean;
    
    @Inject
    SingletonLogic singletonLogic;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {
        
        req.setCharacterEncoding("UTF-8");
        singletonBean.setName(req.getParameter("name"));
        singletonLogic.changeName(singletonBean.getName()+ "様");
        
        System.out.println(singletonBean.sayHello());
        
        req.setAttribute("singletonBean", singletonBean);
        req.getRequestDispatcher("singleton/singletonTest2.jsp").forward(req, res);
    }
}
