package cn.CodingYoo.Servlet;
/*
 *  @author:  CodingYoo
 *  date:     8/31/2020  10:08 AM Mon
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 */

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletRequestForward extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();
        /*RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/HelloServlet"); //请求转发的路径
        requestDispatcher.forward(req,resp);  //转发*/
        servletContext.getRequestDispatcher("/HelloServlet").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
