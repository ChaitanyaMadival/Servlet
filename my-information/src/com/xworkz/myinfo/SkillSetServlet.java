package com.xworkz.myinfo;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/skill", loadOnStartup = 1)

public class SkillSetServlet extends GenericServlet {
    public SkillSetServlet(){
        System.out.println("Created Skill Set Servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("Executed SkillSet ServletMethod.................");

        String name=servletRequest.getParameter("name");
        System.out.println("Name:"+name);

        String email=servletRequest.getParameter("email");
        System.out.println("Email:"+email);

        String primarySkill=servletRequest.getParameter("primarySkill");
        System.out.println("Primary Skill:"+primarySkill);

        String secondarySkill=servletRequest.getParameter("secondarySkill");
        System.out.println("Secondary Skill:"+secondarySkill);

        String dataBase=servletRequest.getParameter("dataBase");
        System.out.println("DataBase:"+dataBase);

        String ides=servletRequest.getParameter("IDE's");
        System.out.println("IDE's:"+ides);

        String uiTechnologies=servletRequest.getParameter("uiTechnologies");
        System.out.println("uiTechnologies:"+uiTechnologies);

        String experience=servletRequest.getParameter("experience");
        System.out.println("Experience:"+experience);

        String frameWorks=servletRequest.getParameter("frameWorks");
        System.out.println("FrameWorks:"+frameWorks);

        String otherSkills=servletRequest.getParameter("otherSkills");
        System.out.println("Other Skills:"+otherSkills);

        System.out.println("-------------------------------");


    }
}
