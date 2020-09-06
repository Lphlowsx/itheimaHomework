package cn.codingyoo.filter;
/*
 *  @author:  CodingYoo
 *  date:     9/6/2020  3:16 PM Sun
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 */

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "FilterEncode",urlPatterns = "/*") //使用注解
public class CharacterEncodingFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化...");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        filterChain.doFilter(request, response);
    }

    public void destroy() {
        System.out.println("过滤器销毁...");
    }
}
