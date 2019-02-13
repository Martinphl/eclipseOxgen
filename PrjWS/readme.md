#利用javax包在tomcat上发布webservice

	版本：
	选用Dynamic Web Module 2.5
	
	方式：
	通过实现ServletContextListener接口和继承HttpServlet两种方式暴露webservice
	
	注意：
	1.在tomcat上发布webservice(下述：ws)时，避免webservice的port与tomcat的port选择冲突，
	servlet的port与tomcat的默认的http/1.1的port是一致的。
	
	2.将实现类WebServiceImpl和WebServiceImpl2两种webservice发布到同一个url上，
	其中，通过listener的contextInitialized函数发布的ws，覆盖了通过servlet的init函数发布的ws
