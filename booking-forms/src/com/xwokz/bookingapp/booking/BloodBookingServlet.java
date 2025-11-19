package com.xwokz.bookingapp.booking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/blood", loadOnStartup = 1)

public class BloodBookingServlet extends HttpServlet {

    public  BloodBookingServlet(){
        System.out.println("Blood Booking servlet created.. ");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId = req.getParameter("userId");
        String userName = req.getParameter("userName");
        String bloodType = req.getParameter("bloodType");
        String donationStatus = req.getParameter("donationStatus");
        String description = req.getParameter("description");
        String comment = req.getParameter("comment");


        System.out.println("User Id "+userId);
        System.out.println("User Name "+userName);
        System.out.println("Blood Type "+bloodType);
        System.out.println("Donation Status "+donationStatus);
        System.out.println("Description "+description);
        System.out.println("Comment "+comment);


        resp.setContentType("name");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<pre>");
        writer.println("<h1 style='color:yellow'>Blood Booking Details Saved Successfully....</h1>");
        writer.println("User Id "+userId);
        writer.println("User Name "+userName);
        writer.println("Blood Type "+bloodType);
        writer.println("Donation Status "+donationStatus);
        writer.println("<h3>");
        writer.println("<a href='BloodBooking.html'>Click here to book blood again</a>");
        writer.println("</h3>");
        writer.println("</pre>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
