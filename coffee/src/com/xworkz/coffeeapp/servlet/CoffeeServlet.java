package com.xworkz.coffeeapp.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/coffee", loadOnStartup = 1)

public class CoffeeServlet extends HttpServlet {

    public CoffeeServlet()
    {
        System.out.println("Coffee servlet is created...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Created coffee doPost method...");

//        resp.setContentType("text/html");
        String type = req.getParameter("type");
        String price = req.getParameter("price");
        String quantity = req.getParameter("quantity");
        String farmer = req.getParameter("farmer");
        String location = req.getParameter("location");

//        resp.setContentType("text/html");

        req.setAttribute("type" , type);
        req.setAttribute("price", price);
        req.setAttribute("quantity", quantity);
        req.setAttribute("farmer",farmer);
        req.setAttribute("location",location);

        System.out.println("Type "+type);
        System.out.println("Price "+price);
        System.out.println("Quantity "+quantity);
        System.out.println("Farmer "+farmer);
        System.out.println("Location "+location);

        System.out.println("Redirecting to Coffee result file .... ");
       req.getRequestDispatcher("result/CoffeeResult.jsp").forward(req,resp);

    }
}
