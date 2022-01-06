package com.example.demo;

import com.example.demo.service.TestWeb;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by saeedi_m on 28/07/19.
 */
public class Client {

    public static void main(String[] args) throws Exception {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/ws/Hello?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        QName qname = new QName("http://impl.service.demo.example.com/", "TestWebImplService");

        Service service = Service.create(url, qname);

        TestWeb hello = service.getPort(TestWeb.class);

        System.out.println(hello.getHelloWorldAsString("This is ready to use"));

    }
}
