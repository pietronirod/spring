package br.com.pietroniro.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("propertiesConfig.xml");
        System.out.println(ctx.getBean("CountriesAndLanguages"));
    }
}
