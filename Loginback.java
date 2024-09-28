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
        String username = request.getParameter("username");
        String password = request.getParameter("password");
         if ("9923017046".equals(username) && "BCA".equals(password)) {
            // Success case - Redirect to the dashboard
            response.sendRedirect("dash.html");
        } else {
            response.sendRedirect("login.html?error=invalid");
        }
    }
}
