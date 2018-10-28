package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
	
	
	
	
	
	//Servlet ͨ������ init () �������г�ʼ����
	/**
	 * init ��������Ƴ�ֻ����һ�Ρ����ڵ�һ�δ��� Servlet ʱ�����ã�
	 * �ں���ÿ���û�����ʱ���ٵ��á���ˣ���������һ���Գ�ʼ��
	 */
	@Override
	public void init() throws ServletException {
		// ��ʼ������...
		String message = "hello World";
	}
	
	
	
	
	
	
	
	//Servlet ���� service() �����������ͻ��˵�����
	/**
	 * service() ������ִ��ʵ���������Ҫ������Servlet �������� Web ��������
	 * ���� service() �������������Կͻ��ˣ�������������󣬲��Ѹ�ʽ������Ӧд�ظ��ͻ��ˡ�
	 * ÿ�η��������յ�һ�� Servlet ����ʱ�������������һ���µ��̲߳����÷���
	 * service() ������� HTTP �������ͣ�GET��POST��PUT��DELETE �ȣ��������ʵ���ʱ����� doGet��doPost��doPut��doDelete �ȷ�����
	 * ���ö�service���κβ���
	 */
	//destory ���������ú�servlet �����٣����ǲ�û�����������գ��ٴ�����ʱ����û�����³�ʼ���� 
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.service(req, resp);
	}
	
	
	
	
	//Servlet ͨ������ destroy() ������ֹ�����������������κβ���
	/**
	 * destroy() ����ֻ�ᱻ����һ�Σ��� Servlet �������ڽ���ʱ�����á�
	 * destroy() �������������� Servlet �ر����ݿ����ӡ�ֹͣ��̨�̡߳�
	 * �� Cookie �б�����������д�뵽���̣���ִ���������Ƶ��������
	 */
	@Override
	public void destroy() {
		super.destroy();
	}

	//doGet() �� doPost() ������ÿ�η�����������õķ�����
	
	
	
	
	//GET ����������һ�� URL ���������󣬻���������һ��δָ�� METHOD �� HTML ���������� doGet() ����������
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Servlet ����
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("HelloWorld");
	}

	
	
	
	//POST ����������һ���ر�ָ���� METHOD Ϊ POST �� HTML ���������� doPost() ����������
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}