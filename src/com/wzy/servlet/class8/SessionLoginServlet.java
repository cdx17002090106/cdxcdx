package com.wzy.servlet.class8;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "SessionLoginServlet",urlPatterns = "/SessionLoginServlet")
public class SessionLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String name = (String) request.getParameter("username");

        String password = (String) request.getParameter("password");
        HttpSession httpSession=request.getSession();
        if(name.equals("cdx")&&password.equals("123456")){
            httpSession.setAttribute("isCheck",true);
            response.sendRedirect("IndexServlet");
        }else{
            response.sendRedirect("sessionlogin.html");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
