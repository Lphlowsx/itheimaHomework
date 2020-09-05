package cn.CodingYoo.Servlet;
/*
 *  @author:  CodingYoo
 *  date:     9/5/2020  10:47 AM Sat
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username.equals("admin")){
            System.out.println("登录成功！");
            response.sendRedirect("/Success.jsp");
        }else {
            System.out.println("登录失败！");
            response.sendRedirect("/error.jsp");
        }
    }
}
