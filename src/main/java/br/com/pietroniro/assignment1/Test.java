package br.com.pietroniro.assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ShoppingCart.xml");
        System.out.println(ctx.getBean("ShoppingCart"));
    }
}
