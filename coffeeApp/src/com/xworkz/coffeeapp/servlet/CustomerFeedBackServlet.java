package com.xworkz.coffeeapp.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/feedback", loadOnStartup = 1)
public class CustomerFeedBackServlet extends HttpServlet {
    public CustomerFeedBackServlet()
    {
        System.out.println("Created Customer FeedBack Servlet..");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running Customer FeedBack Servlet..");

        resp.setContentType("text/html");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String comments = req.getParameter("comments");
        String rating = req.getParameter("rating");

        req.setAttribute("name",name);
        req.setAttribute("email",email);
        req.setAttribute("comments",comments);
        req.setAttribute("rating",rating);

        System.out.println(name);
        System.out.println(email);
        System.out.println(comments);
        System.out.println(rating);

        System.out.println("redirecting to customer feedback result..");
        req.getRequestDispatcher("result/CustomerFeedBackResult.jsp").forward(req, resp);
    }
}
