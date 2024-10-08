package com.example.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get the parameters from the login form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Hardcoded username and password for demo purposes (you can replace this with a database check)
        String correctUsername = "admin";
        String correctPassword = "password";

        // Check if the username and password are correct
        if (correctUsername.equals(username) && correctPassword.equals(password)) {
            // Create a session and redirect to a success page
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("dash.html");
        } else {
            // Redirect to login page with an error message
            response.sendRedirect("Home.html?error=true");
        }
    }
}