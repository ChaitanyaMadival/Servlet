package com.xworkz.coffeeapp.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/cafeteria", loadOnStartup = 1)
public class CafeteriaServlet extends HttpServlet {
    public CafeteriaServlet()
    {
        System.out.println("Created Cafeteria Servlet..");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Running Cafeteria servlet..");

        resp.setContentType("text/html");
        String name = req.getParameter("name");
        String location = req.getParameter("location");
        String type = req.getParameter("type");
        String price = req.getParameter("price");
        String franchise = req.getParameter("franchise");
        String owner = req.getParameter("owner");
        String gst = req.getParameter("gst");

        System.out.println("Setting values..");
        req.setAttribute("name",name);
        req.setAttribute("location",location);
        req.setAttribute("type", type);
        req.setAttribute("price",price);
        req.setAttribute("franchise",franchise);
        req.setAttribute("owner",owner);
        req.setAttribute("gst",gst);

        System.out.println("Name"+name);
        System.out.println("Location"+location);
        System.out.println("Type"+type);
        System.out.println("Price"+price);
        System.out.println("Franchise Name"+franchise);
        System.out.println("Owner Name"+owner);
        System.out.println("GST No"+gst);

        System.out.println("redirecting to cafeteria runner..");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("result/CafeteriaRunner.jsp");
        requestDispatcher.forward(req,resp);

    }
}
