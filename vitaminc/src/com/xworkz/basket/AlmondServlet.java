package com.xworkz.basket;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/almond" , loadOnStartup = 1)

public class AlmondServlet extends GenericServlet {
    public  AlmondServlet(){
        System.out.println("created servlet");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service");
    }
}
