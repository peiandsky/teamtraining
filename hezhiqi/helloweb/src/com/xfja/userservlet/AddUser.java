package com.xfja.userservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author：HeZhiQi
 * @Date: 2019/8/18
 * @Description: ${PACKAGE_NAME}
 * @version: 1.0
 */
@WebServlet(name = "AddUser" , urlPatterns = {"/adduser"})
public class AddUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setCharacterEncoding("utf-8");
    response.setContentType("text/html;charset=utf-8");
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    System.out.println("username:"+username);
    System.out.println("password:"+password);
    //注册成功跳转到登录页面
        response.sendRedirect("login.jsp");

    }
}
