package com.xwokz.bookingapp.booking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/food", loadOnStartup = 1)

public class FoodOrderServlet extends HttpServlet {
    public FoodOrderServlet(){
        System.out.println("Created Food order servlet..");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String orderId = req.getParameter("orderId");
        String customerName = req.getParameter("customerName");
        String email = req.getParameter("email");
        String foodType = req.getParameter("foodType");
        String comment = req.getParameter("comment");
        String deliveryMethod = req.getParameter("deliveryMethod");


        System.out.println("Order Id "+orderId);
        System.out.println("Name "+customerName);
        System.out.println("Blood Type "+email);
        System.out.println("Food Type "+foodType);
        System.out.println("comment "+comment);
        System.out.println("Delivery Method "+deliveryMethod);


        resp.setContentType("name");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<pre>");
        writer.println("<h1 style='color:yellow'>Food Order Details Saved Successfully....</h1>");
        writer.println("Order Id "+orderId);
        writer.println("Name "+customerName);
        writer.println("Email "+email);
        writer.println("Food Type "+foodType);
        writer.println("Comment "+comment);
        writer.println("Delivery method "+deliveryMethod);
        writer.println("<h3>");
        writer.println("<a href='FoodOrder.html'>Click here to order again</a>");
        writer.println("</h3>");
        writer.println("</pre>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
