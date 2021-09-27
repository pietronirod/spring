package br.com.pietroniro.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Prescription.xml");

        System.out.println(ctx.getBean("Prescription"));
    }
}
