package com.xwokz.bookingapp.booking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/movie", loadOnStartup = 1)

public class MovieTicketServlet extends HttpServlet {
    public MovieTicketServlet(){
        System.out.println("Created Movie Ticket Servlet..");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userId = req.getParameter("userId");
        String userName = req.getParameter("userName");
        String movieType = req.getParameter("movieType");
        String description = req.getParameter("description");
        String comment = req.getParameter("comment");
        String paymentMode = req.getParameter("paymentMode");


        System.out.println("User Id "+userId);
        System.out.println("User Name "+userName);
        System.out.println("Movie Type "+movieType);
        System.out.println("Description "+description);
        System.out.println("Comment "+comment);
        System.out.println("Payment Mode "+paymentMode);

        resp.setContentType("name");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<pre>");
        writer.println("<h1 style='color:yellow'>Movie ticket Booking Details Saved Successfully....</h1>");
        writer.println("User Id "+userId);
        writer.println("User Name "+userName);
        writer.println("Movie Type "+movieType);
        writer.println("Description "+description);
        writer.println("Comment "+comment);
        writer.println("Payment Mode "+paymentMode);
        writer.println("<h3>");
        writer.println("<a href='MovieTicker.html'>Click here to book ticket again</a>");
        writer.println("</h3>");
        writer.println("</pre>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
