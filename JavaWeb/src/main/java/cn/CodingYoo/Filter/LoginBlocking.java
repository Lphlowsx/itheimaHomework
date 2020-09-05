package cn.CodingYoo.Filter;
/*
 *  @author:  CodingYoo
 *  date:     9/5/2020  10:38 AM Sat
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 */

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "LoginBlocking")
public class LoginBlocking implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {


        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("启动登录拦截...");
    }

}
