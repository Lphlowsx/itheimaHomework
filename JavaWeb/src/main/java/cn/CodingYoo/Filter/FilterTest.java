package cn.CodingYoo.Filter;
/*
 *  @author:  CodingYoo
 *  date:     8/31/2020  3:42 PM Mon
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 */

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "FilterDemo",urlPatterns = "/*")
public class FilterTest implements Filter {
    public void destroy() {
        //过滤器销毁了(在服务器停止时销毁)
        System.out.println("过滤器销毁了。。。。");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        System.out.println("过滤器起作用了");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
            //初始化，打印监听日志(服务器启动过滤器完成初始化)
        System.out.println("过滤器初始化。。。");
    }

}
