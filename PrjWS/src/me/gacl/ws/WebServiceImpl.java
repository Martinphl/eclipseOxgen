package me.gacl.ws;

import javax.jws.WebService;

import me.gacl.listener.Loader;

/**
 * @author gacl SEI的具体实现
 */
// 使用@WebService注解标注WebServiceI接口的实现类WebServiceImpl
@WebService
public class WebServiceImpl implements WebServiceI {

	@Override
	public String sayHello(String name) {
		System.out.println("WebService sayHello " + name);
		return "sayHello " + name;
	}

	@Override
	public String save(String jarPath, String classpath, String methodName, String name, String pwd) {
		System.out.println("WebService save " + name + "， " + pwd);
		Object obj = new Loader().loader(jarPath, classpath, methodName, name, pwd);
		return obj.toString();
	}

}