package com.xworkz.myinfo;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/personal", loadOnStartup = 1)

public class PersonalDetailsServlet extends GenericServlet {
    public  PersonalDetailsServlet(){
        System.out.println("Created Personal Details servlet");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("Executed PersonalDetails ServletMethod............");

        System.out.println("----Personal Details-----");
        String firstName= servletRequest.getParameter("firstName");
        System.out.println("FirstName:"+firstName);

        String LastName= servletRequest.getParameter("lastName");
        System.out.println("LastName:"+LastName);

        String email= servletRequest.getParameter("email");
        System.out.println("Email:"+email);

        String mobNo= servletRequest.getParameter("mobNo");
        System.out.println("Mob No:"+mobNo);

        String age= servletRequest.getParameter("age");
        System.out.println("Age:"+age);

        String address= servletRequest.getParameter("address");
        System.out.println("Address:"+address);

        String gender= servletRequest.getParameter("gender");
        System.out.println("Gender:"+gender);

        String dob= servletRequest.getParameter("dob");
        System.out.println("Date of Birth:"+dob);

        String status= servletRequest.getParameter("status");
        System.out.println("Status:"+status);

        System.out.println("--------------------------------------");
    }
}
