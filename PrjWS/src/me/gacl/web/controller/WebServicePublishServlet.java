package me.gacl.web.controller;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.xml.ws.Endpoint;
import me.gacl.ws.WebServiceImpl2;

/**
 * @author gacl ���ڷ���WebService��Servlet
 */
// ʹ��Servlet3.0�ṩ��@WebServletע�⽫�̳�HttpServlet�����ͨJava���עΪһ��Servlet
// ��value��������Ϊ���ַ���������WebServicePublishServlet�Ͳ��ṩ������ʵ�·��
// loadOnStartup��������WebServicePublishServlet�ĳ�ʼ��ʱ��
// @WebServlet(value="",loadOnStartup=0)
public class WebServicePublishServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.GenericServlet#init()
	 * ��WebServicePublishServlet��ʼ��ʱ����WebService
	 */
	public void init() throws ServletException {
		// WebService�ķ�����ַ
		String address = "http://localhost:8082/WebService";
		// ����WebService��WebServiceImpl����WebServie�ӿڵľ���ʵ����
		Endpoint.publish(address, new WebServiceImpl2());
		System.out.println("ʹ��WebServicePublishServlet����webservice�ɹ�!");
	}
}