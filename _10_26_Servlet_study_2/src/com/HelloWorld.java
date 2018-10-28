package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
	
	
	
	
	
	//Servlet 通过调用 init () 方法进行初始化。
	/**
	 * init 方法被设计成只调用一次。它在第一次创建 Servlet 时被调用，
	 * 在后续每次用户请求时不再调用。因此，它是用于一次性初始化
	 */
	@Override
	public void init() throws ServletException {
		// 初始化代码...
		String message = "hello World";
	}
	
	
	
	
	
	
	
	//Servlet 调用 service() 方法来处理客户端的请求。
	/**
	 * service() 方法是执行实际任务的主要方法。Servlet 容器（即 Web 服务器）
	 * 调用 service() 方法来处理来自客户端（浏览器）的请求，并把格式化的响应写回给客户端。
	 * 每次服务器接收到一个 Servlet 请求时，服务器会产生一个新的线程并调用服务。
	 * service() 方法检查 HTTP 请求类型（GET、POST、PUT、DELETE 等），并在适当的时候调用 doGet、doPost、doPut，doDelete 等方法。
	 * 不用对service做任何操作
	 */
	//destory 方法被调用后，servlet 被销毁，但是并没有立即被回收，再次请求时，并没有重新初始化。 
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.service(req, resp);
	}
	
	
	
	
	//Servlet 通过调用 destroy() 方法终止（结束）。不用做任何操作
	/**
	 * destroy() 方法只会被调用一次，在 Servlet 生命周期结束时被调用。
	 * destroy() 方法可以让您的 Servlet 关闭数据库连接、停止后台线程、
	 * 把 Cookie 列表或点击计数器写入到磁盘，并执行其他类似的清理活动。
	 */
	@Override
	public void destroy() {
		super.destroy();
	}

	//doGet() 和 doPost() 方法是每次服务请求中最常用的方法。
	
	
	
	
	//GET 请求来自于一个 URL 的正常请求，或者来自于一个未指定 METHOD 的 HTML 表单，它由 doGet() 方法处理。
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Servlet 代码
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("HelloWorld");
	}

	
	
	
	//POST 请求来自于一个特别指定了 METHOD 为 POST 的 HTML 表单，它由 doPost() 方法处理。
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
