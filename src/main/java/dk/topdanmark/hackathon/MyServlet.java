package dk.topdanmark.hackathon;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet class
 *
 * Created by npo on 09-06-2015.
 */
@WebServlet("/greeting")
public class MyServlet extends HttpServlet {

    @Inject
    Greeting greeting;

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.getWriter().write("<b>Hello World.</b>");
        res.getWriter().write("<br><br>Please fix me...");
        res.getWriter().write("<br><br>Mr Hack says '"+greeting.sayHello("Mr Hack")+"'");
        res.getWriter().flush();
    }

}
