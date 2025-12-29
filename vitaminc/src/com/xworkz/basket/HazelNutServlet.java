package com.xworkz.basket;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/hazelnut" , loadOnStartup = 1)

public class HazelNutServlet extends GenericServlet {

    public HazelNutServlet(){
        System.out.println("Created service");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service");
    }
}
