package com.xworkz.myinfo;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/education", loadOnStartup = 1)
public class EducationDetailsServlet extends GenericServlet {
    public EducationDetailsServlet(){
        System.out.println("Education Servlet Created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("Executed EducationDetails ServletMethod.......");

        System.out.println("------EducationDetails------");
        System.out.println("----School Information----");
        String studentName= servletRequest.getParameter("studentName");
        System.out.println("Student Name:"+studentName);

        String schoolName= servletRequest.getParameter("schoolName");
        System.out.println("School Name:"+schoolName);

        String YearOfPassout= servletRequest.getParameter("yearOfPassOut");
        System.out.println("yearOfPassOut:"+YearOfPassout);

        String percentage= servletRequest.getParameter("percentage");
        System.out.println("Percentage:"+percentage);

        System.out.println("----PUC Information----");
        String studentName1= servletRequest.getParameter("studentName1");
        System.out.println("Student Name:"+studentName1);

        String collegeName= servletRequest.getParameter("collegeName1");
        System.out.println("College Name:"+collegeName);

        String YearOfPassout1= servletRequest.getParameter("yearOfPassOut1");
        System.out.println("yearOfPassOut:"+YearOfPassout1);

        String percentage1= servletRequest.getParameter("percentage1");
        System.out.println("Percentage:"+percentage1);

        System.out.println("----Degree Information----");
        String studentName2= servletRequest.getParameter("studentName2");
        System.out.println("Student Name:"+studentName2);

        String collegeName1= servletRequest.getParameter("collegeName2");
        System.out.println("College Name:"+collegeName1);

        String YearOfPassout2= servletRequest.getParameter("yearOfPassOut2");
        System.out.println("YearOfPassout:"+YearOfPassout2);

        String percentage2= servletRequest.getParameter("percentage2");
        System.out.println("Percentage:"+percentage2);

//        String stream=servletRequest.getParameter("stream");
//        System.out.println("Stream:"+stream);


        System.out.println("--------------------------------------------------");

    }
}
