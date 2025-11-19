package com.xwokz.bookingapp.booking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/product", loadOnStartup = 1)
public class ECommerceProductServlet extends HttpServlet {

    public ECommerceProductServlet(){
        System.out.println("Created ECommerce Product servlet");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("productName");
        String brand = req.getParameter("productBrand");
        String price = req.getParameter("price");
        String color = req.getParameter("color");
        String description = req.getParameter("description");
        String comment = req.getParameter("comment");
        String size = req.getParameter("size");

        System.out.println("Name "+name);
        System.out.println("Brand "+brand);
        System.out.println("Price "+price);
        System.out.println("Color "+color);
        System.out.println("Description "+description);
        System.out.println("Comment "+comment);
        System.out.println("Size "+size);

        resp.setContentType("name");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<body>");
            writer.println("<pre>");
            writer.println("<h1 style='color:pink'>Product Details Saved Successfully....</h1>");
            writer.println("Product Name:"+name);
            writer.println("Product Price:"+price);
            writer.println("Brand:"+brand);
            writer.println("Color:"+color);
            writer.println("comment:"+comment);
            writer.println("Description:"+description);
            writer.println("<h3>");
            writer.println("<a href='ECommerceProduct.html'>Click here add another Product</a>");
            writer.println("</h3>");
            writer.println("</pre>");
        writer.println("</body>");
        writer.println("</html>");

    }
}
