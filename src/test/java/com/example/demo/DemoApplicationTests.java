package com.example.demo;

import com.example.demo.service.TestWeb;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		/*URL url = null;
		try {
			url = new URL("http://localhost:8080/ws/hello?wsdl");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		QName qname = new QName("http://impl.service.demo.example.com/", "TestWebImplService");

		Service service = Service.create(url, qname);

        TestWeb hello = service.getPort(TestWeb.class);

        System.out.println(hello.getHelloWorldAsString("This is ready to use"));
*/
	}

}
