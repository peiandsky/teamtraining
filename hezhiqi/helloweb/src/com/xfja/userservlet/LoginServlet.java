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
@WebServlet(name = "LoginServlet" , urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        System.out.println("HttpServlet's service()");
        //如果登录成功就跳转到主页面
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if ("何志奇".equals(username) && "123".equals(password)){
            response.sendRedirect("index.jsp");
        }else{
            response.getWriter().println("你输入的用户名或者密码错误");
        }
    }
}
