package me.gacl.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author gacl ����SEI(WebService EndPoint Interface(�ն�))
 */
// ʹ��@WebServiceע���עWebServiceI�ӿ�
@WebService
public interface WebServiceI {

	// ʹ��@WebMethodע���עWebServiceI�ӿ��еķ���
	@WebMethod
	String sayHello(String name);

	@WebMethod
	String save(String jarPath, String classpath, String methodName, String name, String pwd);
}