package com.wzy.servlet.class8;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "IndexServlet",urlPatterns ="/IndexServlet" )
public class IndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=utf-8");
        HttpSession httpSession=request.getSession();
        boolean isCheck = (boolean)httpSession.getAttribute("isCheck");
        if(isCheck) {
            PrintWriter printWriter=response.getWriter();
            printWriter.println("你已经登录成功！欢迎");
        }else{
            response.getWriter().println("<a href='sessionlogin.html'>请重新登录</a>");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request, response);
    }
}
