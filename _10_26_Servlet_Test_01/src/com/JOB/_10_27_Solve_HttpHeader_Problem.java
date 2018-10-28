package com.JOB;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class _10_27_Solve_HttpHeader_Problem
 */
@WebServlet("/_10_27_Solve_HttpHeader_Problem")
public class _10_27_Solve_HttpHeader_Problem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public _10_27_Solve_HttpHeader_Problem() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ѧϰhttp������ͷ��ȡ������
//		HTTP����Ӧ����Ҳ����������ɣ���Ӧ��+��Ӧͷ+��Ӧ�壩�� 
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String docType = "<!DOCTYPE html>\n";
		String title = "HTTP Header ����ʵ�� ";
		out.println(docType+"<html>\n"+"<head>\n"+"<meta charset=\"UTF-8\">\n"+"<title>"+title+"</title>\n"
				+"</head>\n"+"<body bgcolor=\"#f0f0f0\">\n" +
	            "<h1 align=\"center\">" + title + "</h1>\n" +
	            "<table width=\"100%\" border=\"1\" align=\"center\">\n" +
	            "<tr bgcolor=\"#949494\">\n" +
	            "<th>Header ����</th><th>Header ֵ</th>\n"+
	            "</tr>\n");
		Enumeration headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()) {
			String headerName = (String) headerNames.nextElement();
			out.print("<tr><td>"+headerName+"</td>\n");
			String paramValue = request.getHeader(headerName);
			out.println("<td>"+paramValue+"</td></tr>\n");		
		}
		out.println("</table>\n</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
