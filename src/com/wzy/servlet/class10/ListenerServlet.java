package com.wzy.servlet.class10;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ListenerServlet",urlPatterns = "/ListenerServlet")
public class ListenerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HttpSession session = request.getSession();
//        session.setAttribute("username","cdx");
//        response.getWriter().println("session属性创建成功");
//        session.removeAttribute("username");
//        response.getWriter().println("session属性删除成功");
        response.getWriter().println("当前人数为："+OnlineCounter.getOnline());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request, response);
    }
}
