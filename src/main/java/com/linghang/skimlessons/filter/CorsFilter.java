package com.linghang.skimlessons.filter;

import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author WSharkCoder
 * @Date 2020/11/27 18:41
 * @Version V1.0
 * @ClassName CorsFilter
 * CORS跨域配置
 */
@Configuration
public class CorsFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) response;
        res.setHeader("Access-Control-Allow-Origin", "*");

        res.setHeader("Access-Control-Allow-Methods",
                "POST, GET, OPTIONS, DELETE, PUT, GET");

        res.setHeader("Access-Control-Max-Age", "3600");

        res.setHeader("Access-Control-Allow-Headers",
                "Accept,Accept-Encoding,Accept-Language,Cache-Control,User-Agent,Connection,Host,Pragma,Upgrade-Insecure-Requests,token");

        res.setHeader("Access-Control-Allow-Credentials", "true");

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
