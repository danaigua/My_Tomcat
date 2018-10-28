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
 * Servlet implementation class _10_27_getParameterNames_Study
 */
@WebServlet("/_10_27_getParameterNames_Study")
public class _10_27_getParameterNames_Study extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public _10_27_getParameterNames_Study() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String docType ="<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		PrintWriter out = response.getWriter();
		String title = "菜鸡学getParameterNames";
		out.println(docType+"<html>\n"+"<head>\n"+"<meta charset=\"UTF-8\">\n"+"<title>"+title+"</title>"+
		"</head>"+"<body bgcolor=\"#f0f0f0\">\n" + "<h1 align=\"center\">" + title + "</h1>\n" +
        "<table width=\"100%\" border=\"1\" align=\"center\">\n" +
        "<tr bgcolor=\"#949494\">\n" +
        "<th>参数名称</th><th>参数值</th>\n"+
        "</tr>\n");
		Enumeration paramNames = request.getParameterNames();
		while(paramNames.hasMoreElements()) {
			String paramName = (String) paramNames.nextElement();
			out.print("<tr><td>" + paramName + "</td>\n");
			String[] paramValues = request.getParameterValues(paramName);
			if(paramValues.length==1) {
				String paramValue = paramValues[0];
				if(paramValue.length()==0) {
					out.print("<tr><td>null</td>");
				}else {
					out.print("<tr><td>" + paramValue + "</td>");
				}
			}else {
				out.println("<td><ul>");
				for(String paramValue:paramValues) {
					out.println("<li>" + paramValue);
				}
				 out.println("</ul></td>");
			}
			out.print("</tr>");
		}
		out.println("\n</table>\n</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
