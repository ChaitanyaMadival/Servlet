package com.xworkz.basket;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/basket", loadOnStartup =  1) //or first request

public class BasketServlet extends GenericServlet {

    public BasketServlet(){
        System.out.println("Created Servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("running service ");

    }

}
