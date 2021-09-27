package br.com.pietroniro.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("setConfig.xml");
        System.out.println(ctx.getBean("carDealer"));
    }
}
