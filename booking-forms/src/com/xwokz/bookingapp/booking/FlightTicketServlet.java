package com.xwokz.bookingapp.booking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/flight", loadOnStartup = 1)

public class FlightTicketServlet extends HttpServlet {

    public FlightTicketServlet(){
        System.out.println("Created Flight Ticket Booking Servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String passengerName = req.getParameter("passengerName");
        String flightNumber = req.getParameter("flightNumber");
        String passengerType = req.getParameter("passengerType");
        String specialRequests = req.getParameter("specialRequests");
        String status = req.getParameter("status");

        System.out.println("Passenger Name "+passengerName);
        System.out.println("Flight Number "+flightNumber);
        System.out.println("Passenger Type "+passengerType);
        System.out.println("Special Requests "+specialRequests);
        System.out.println("Status "+status);

        resp.setContentType("name");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB\" crossorigin=\"anonymous\">");
        writer.println("</head>");

        writer.println("<body class='bg-light'>");

        writer.println("<div class='container mt-5'>");
        writer.println("<div class='card shadow-lg p-4'>");

        writer.println("<pre>");
        writer.println("<h3 style='color:blue'>Flight Ticket Booking Details Saved Successfully....</h3>");
        writer.println("<ul class='list-group mb-4'>");

        writer.println("Passenger Name "+passengerName);
        writer.println("Flight Number "+flightNumber);
        writer.println("Passenger Type "+passengerType);
        writer.println("Special Requests "+specialRequests);
        writer.println("</ul>");

        writer.println("<div class='text-center'>");
        writer.println("<a href='FlightTicket.html' target='_blank' class='btn btn-danger'>Click here to book add another ticket</a>");
        writer.println(" <link href = \"Style/style.css\" rel=\"stylesheet\">");
        writer.println("</div>");

        writer.println("</div>");
        writer.println("</div>");

        writer.println("</body>");

        writer.println("</html>");
    }
}
