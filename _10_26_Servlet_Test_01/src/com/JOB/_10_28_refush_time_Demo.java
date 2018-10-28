package com.JOB;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class _10_28_refush_time_Demo
 */
@WebServlet("/_10_28_refush_time_Demo")
public class _10_28_refush_time_Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public _10_28_refush_time_Demo() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.setIntHeader("Refresh", 1);
		//使用默认时区和语言环境获得一个日历  
		Calendar cale = Calendar.getInstance();
		//将Calendar类型转换成Date类型  
		Date date = cale.getTime();
		//设置日期输出的格式  
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//格式化输出  
		String nowData = df.format(date);
		PrintWriter out = response.getWriter();
		String title = "自动刷新时间案例";
		String docType = " <!DOCTYPE html>";
		out.println(docType+"<html>\n"+"<head>\n"+"<meta charset=\"UTF-8\">\n"+"<title>"+title+"</title>\n"
				+"</head>\n"+"<body>\n"+"<h1>"+nowData+"</h1>\n"+"</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
