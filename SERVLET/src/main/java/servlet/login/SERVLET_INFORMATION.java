package servlet.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/INFORMATION_SERVLET")
public class SERVLET_INFORMATION extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        // Get the user information from the request
        String companyName = request.getParameter("companyName");
        String designation = request.getParameter("designation");
        String primarySkill = request.getParameter("primarySkill");

        // Create the HTML output
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>User Information</title>");
        writer.println("<style>");
        writer.println("body { font-family: Arial, sans-serif; background-color:  rgb(243, 217, 244); margin: 0; padding: 0; display: flex; justify-content: center; align-items: center; height: 100vh; }");
        writer.println(".container { background-color: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1); text-align: center; width: 300px; }");
        writer.println("h2 { margin-bottom: 20px; }");
        writer.println("h3 { margin: 5px 0; }");
        writer.println("</style>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<div class='container'>");
        writer.println("<h2>User Information</h2>");
        writer.println("<h3>Company Name: " + companyName + "</h3>");
        writer.println("<h3>Designation: " + designation + "</h3>");
        writer.println("<h3>Primary Skill: " + primarySkill + "</h3>");
        writer.println("</div>");
        writer.println("</body>");
        writer.println("</html>");

        writer.close();
    }
}
