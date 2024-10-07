import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Dummy credentials check (replace with your own logic)
        if ("student123".equals(username) && "password123".equals(password)) {
            // Redirect to the next page on successful login
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("nextPage.html"); // Redirect to your desired page
        } else {
            // Redirect back with an error parameter
            response.sendRedirect("login.html?error=true");
        }
    }
}

