package com.xworkz.basket;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/chia" , loadOnStartup = 1)

public class ChiaSeedServlet extends GenericServlet {

    public ChiaSeedServlet(){
        System.out.println("Created servlet");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service");
    }
}
