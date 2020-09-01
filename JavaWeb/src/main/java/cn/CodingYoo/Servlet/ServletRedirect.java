package cn.CodingYoo.Servlet;
/*
 *  @author:  CodingYoo
 *  date:     9/1/2020  11:11 AM Tue
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Redirect")
public class ServletRedirect extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //提交表单未验证密码，跳转至成功页面
        response.sendRedirect("/Success.jsp");
    }
}
