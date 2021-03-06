package com.cursor.spring.xmlmethod;

public class Calculator {
    private Service service;

    public Calculator(Service service) {
        this.service = service;
    }

    public Calculator() {
        this.service = null;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public int perform(int a, int b) {
        return service.serviceAction(a , b);
    }
}
