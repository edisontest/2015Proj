/**
 * 
 */
package com.proj.test.jsonrpc.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.googlecode.jsonrpc4j.spring.JsonServiceExporter;

/**
 * 
 * @author ctg
 * @date 2016年2月26日
 */
@Controller
@RequestMapping("/testservlet")
public class TestServlet {
	@Autowired
    @Qualifier("/MyService")
	private JsonServiceExporter myService;
	
	@RequestMapping("/test2")
	@ResponseBody
	public void test2(HttpServletRequest request,HttpServletResponse response) {
		if (myService == null) {
			System.out.println("JSONServiceExporter null");
			return;//return
		}
		try {
			myService.handleRequest(request, response);
//			myService.setErrorResolver(AnnotationsErrorResolver.INSTANCE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
