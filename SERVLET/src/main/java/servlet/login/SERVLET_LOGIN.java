package servlet.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginRequest")
public class SERVLET_LOGIN extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        // Get the username and password from the request
        String name = request.getParameter("UserName");
        String password = request.getParameter("UserPassword");

        // Create the HTML output
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Login Successful</title>");
        writer.println("<style>");
        writer.println("body { font-family: Arial, sans-serif; background-color: #ADD8E6; margin: 0; padding: 0; display: flex; justify-content: center; align-items: center; height: 100vh; }");
        writer.println(".container { background-color: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1); width: 300px; text-align: center; }");
        writer.println(".header { position: absolute; top: 10px; right: 20px; }");
        writer.println("h3 { margin: 0; }");
        writer.println("form { margin-top: 20px; }");
        writer.println("label { display: block; margin-bottom: 5px; }");
        writer.println("input[type='text'], input[type='password'] { width: calc(100% - 20px); padding: 10px; margin-bottom: 10px; border: 1px solid #ccc; border-radius: 4px; }");
        writer.println("input[type='submit'] { background-color: #4CAF50; color: white; border: none; padding: 10px; border-radius: 4px; cursor: pointer; width: 100%; }");
        writer.println("input[type='submit']:hover { background-color: #45a049; }");
        writer.println("</style>");
        writer.println("</head>");
        writer.println("<body>");
        
        // Display username and password at the top right
        writer.println("<div class='header'>");
        writer.println("<h3>UserName: " + name + "</h3>");
        writer.println("<h3>Password: " + password + "</h3>");
        writer.println("</div>");

        // Form for company name, designation, and primary skill
        writer.println("<div class='container'>");
        writer.println("<h2>Company Information</h2>");
        writer.println("<form action='INFORMATION_SERVLET' method='POST'>");
        writer.println("<input type='hidden' name='UserName' value='" + name + "'>");
        writer.println("<input type='hidden' name='UserPassword' value='" + password + "'>");
        writer.println("<label for='companyName'>Company Name:</label>");
        writer.println("<input type='text' id='companyName' name='companyName' required>");
        writer.println("<label for='designation'>Designation:</label>");
        writer.println("<input type='text' id='designation' name='designation' required>");
        writer.println("<label for='primarySkill'>Primary Skill:</label>");
        writer.println("<input type='text' id='primarySkill' name='primarySkill' required>");
        writer.println("<input type='submit' value='Submit'>");
        writer.println("</form>");
        writer.println("</div>");
        writer.println("</body>");
        writer.println("</html>");

        writer.close();
    }
}