package com.lance.common;

//导入必需的 java 库
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.*;

/**
 * Servlet implementation class AdminUserController
 */
@WebServlet("/LoginFilter")
public class LoginFilter implements Filter {
	public void init(FilterConfig config) throws ServletException {
		// 获取初始化参数
		String site = config.getInitParameter("Site");

		// 输出初始化参数
		System.out.println("网站名称: " + site);
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws ServletException, IOException {

		// 输出站点名称
		System.out.println("站点网址：http://www.runoob.com");

		// 把请求传回过滤链
		chain.doFilter(request, response);
	}

	public void destroy() {
		System.out.println("站点网址：http://www.runoob.com");
		/* 在 Filter 实例被 Web 容器从服务移除之前调用 */
	}
}
