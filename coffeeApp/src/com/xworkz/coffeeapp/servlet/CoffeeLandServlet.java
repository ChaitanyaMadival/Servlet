package com.xworkz.coffeeapp.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/land", loadOnStartup = 1)
public class CoffeeLandServlet extends HttpServlet {

    public CoffeeLandServlet()
    {
        System.out.println("Created Coffee land Servlet..");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Coffee Land doPost method is created..");

        resp.setContentType("text/html");
        String size = req.getParameter("size");
        String plant = req.getParameter("plant");
        String yield = req.getParameter("yield");
        String expenditure = req.getParameter("expenditure");
        String profit = req.getParameter("profit");
        String fertilizerQuant = req.getParameter("fertilizerQuant");

//        System.out.println("Size by Acre "+size);
//        System.out.println("Total Plants "+totalPlant);
//        System.out.println("Total Yield "+totalYield);
//        System.out.println("Expenditure "+expenditure);
//        System.out.println("Profit Made "+totalProfit);
//        System.out.println("Fertilizer "+fertilizerQuant);

        req.setAttribute("size", size);
        req.setAttribute("plant",plant);
        req.setAttribute("yield" , yield);
        req.setAttribute("expenditure" , expenditure);
        req.setAttribute("profit",profit);
        req.setAttribute("fertilizerQuant",fertilizerQuant);

        req.getRequestDispatcher("result/CoffeeLandRunner.jsp").forward(req,resp);

    }
}
