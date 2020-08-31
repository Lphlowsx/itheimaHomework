package cn.CodingYoo.Servlet;
/*
 *  @author:  CodingYoo
 *  date:     8/30/2020  2:37 PM Sun
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletContextGet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建ServletContext对象
        ServletContext servletContext = this.getServletContext();
        //ServletContext存储资源
        String s = (String) servletContext.getAttribute("username");
        //ServletContext获得初始化参数
        String url = servletContext.getInitParameter("url");
        //设置编码
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().println("姓名为："+ s);
        resp.getWriter().println("url："+ url);
    }
}
