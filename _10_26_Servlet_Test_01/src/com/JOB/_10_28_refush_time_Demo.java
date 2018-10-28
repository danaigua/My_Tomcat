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
		//ʹ��Ĭ��ʱ�������Ի������һ������  
		Calendar cale = Calendar.getInstance();
		//��Calendar����ת����Date����  
		Date date = cale.getTime();
		//������������ĸ�ʽ  
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//��ʽ�����  
		String nowData = df.format(date);
		PrintWriter out = response.getWriter();
		String title = "�Զ�ˢ��ʱ�䰸��";
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