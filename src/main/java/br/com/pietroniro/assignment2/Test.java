package br.com.pietroniro.assignment2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("TicketReservation.xml");
        ctx.registerShutdownHook();
    }
}
