package com.JOB;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class _10_27_Servlet_CheckBox_Demo
 */
@WebServlet("/_10_27_Servlet_CheckBox_Demo")
public class _10_27_Servlet_CheckBox_Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public _10_27_Servlet_CheckBox_Demo() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ѡ������servlet
		response.setContentType("text/html;charset=UTF-8");
		String docType = "<!DOCTYPE html>\n";
		String title = "��ȡ��ѡ�������";
		PrintWriter out = response.getWriter();
		out.println(docType+"<html>\n"+"<head>\n"+"<meta charset=\"utf-8\">\n"+"<title>"+title+"</title>\n"
				+"</head>\n"+"<body bgcolor=\"#f0f0f0\">\n"+"<h1 align=\"center\">" + title + "</h1>\n" +"<ul>\n" +
                "  <li><b>�˼���ʶ��</b>: "
                + request.getParameter("runoob") + "\n" +
                "  <li><b>Google ��ʶ��</b>: "
                + request.getParameter("google") + "\n" +
                "  <li><b>�Ա���ʶ��</b>: "
                + request.getParameter("taobao") + "\n" +
                "</ul>\n" +
                "</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}