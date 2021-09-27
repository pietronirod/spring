package br.com.pietroniro.assignment4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("WSClient.xml");
        WSClient wsClient = (WSClient) ctx.getBean("WSClient");

        System.out.println("url: " + wsClient.getUrl() +
                "\nusername: " + wsClient.getUser() +
                "\npassword: " + wsClient.getPassword());
    }
}
