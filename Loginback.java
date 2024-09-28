import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class FormServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get form data
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        // Simple validation
        if ("user".equals(username) && "pass".equals(password)) {
            // Success case
            response.setContentType("text/html");
            response.getWriter().write("<h2>Login Successful</h2>");
        } else {
            // Failure case
            response.setContentType("text/html");
            response.getWriter().write("<h2>Invalid Username or Password</h2>");
        }
    }
}
