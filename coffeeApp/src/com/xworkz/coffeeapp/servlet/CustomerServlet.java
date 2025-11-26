package com.xworkz.coffeeapp.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/customer", loadOnStartup = 1)
public class CustomerServlet extends HttpServlet {
    public CustomerServlet(){
        System.out.println("Created Customer Servlet..");
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        System.out.println("Running Customer Servlet..");

        res.setContentType("text/html");
        String name = req.getParameter("name");
        String phoneNo = req.getParameter("phoneNo");
        String flavour = req.getParameter("flavour");
        String quantity = req.getParameter("quantity");
        String paymentMode = req.getParameter("paymentMode");

        req.setAttribute("name",name);
        req.setAttribute("phoneNo",phoneNo);
        req.setAttribute("flavour",flavour);
        req.setAttribute("quantity",quantity);
        req.setAttribute("paymentMode",paymentMode);

        System.out.println(name);
        System.out.println(phoneNo);
        System.out.println(flavour);
        System.out.println(quantity);
        System.out.println(paymentMode);

        System.out.println("redirecting to Customer result..");
        req.getRequestDispatcher("result/CustomerResult.jsp").forward(req,res);

    }
}
