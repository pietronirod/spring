package br.com.pietroniro.assignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("University.xml");
        University university = (University) ctx.getBean("University");
        System.out.println(university);
    }
}
