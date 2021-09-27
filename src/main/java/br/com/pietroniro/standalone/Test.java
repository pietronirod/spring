package br.com.pietroniro.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ProductList.xml");

        ProductList pl = (ProductList) ctx.getBean("ProductList");
        System.out.println(pl);
    }
}
