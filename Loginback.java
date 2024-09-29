import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Loginback") // Make sure this URL matches the form action
public class FormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve username and password from the form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Simple authentication logic (you can replace this with database authentication)
        if ("9923017046".equals(username) && "BCA".equals(password)) {
            // Successful login - redirect to the dashboard page
            response.sendRedirect("dash.html");
        } else {
            // Failed login - redirect back to the login page with an error message
            response.sendRedirect("login.html?error=invalid");
        }
    }
}
