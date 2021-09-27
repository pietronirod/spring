package br.com.pietroniro.assignment2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

    @PostConstruct
    public void initialize() {
        System.out.println("In the initialization");
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("In the end");
    }
}
