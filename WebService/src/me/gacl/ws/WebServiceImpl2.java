package me.gacl.ws;

import javax.jws.WebService;

/**
 * @author gacl SEI�ľ���ʵ��
 */
// ʹ��@WebServiceע���עWebServiceI�ӿڵ�ʵ����WebServiceImpl
@WebService
public class WebServiceImpl2 implements WebServiceI2 {

	@Override
	public String sayHello(String name) {
		System.out.println("WebService sayHello " + name);
		return "sayHello " + name;
	}

	@Override
	public String save(String name, String pwd) {
		System.out.println("WebService save " + name + "�� " + pwd);
		return "save Success";
	}
}