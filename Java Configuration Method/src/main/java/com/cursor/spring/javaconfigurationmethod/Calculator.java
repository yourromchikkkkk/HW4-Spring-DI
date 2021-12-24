package com.cursor.spring.javaconfigurationmethod;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Service servicePlus;
    private Service serviceMinus;

    @Autowired
    public Calculator(@Qualifier("plusService") Service servicePlus,
                      @Qualifier("minusService") Service serviceMinus) {
        this.serviceMinus = serviceMinus;
        this.servicePlus = servicePlus;
    }

    public Calculator() {
        this.servicePlus = null;
        this.serviceMinus = null;
    }

    public void setServicePlus(Service servicePlus) {
        this.servicePlus = servicePlus;
    }

    public void setServiceMinus(Service serviceMinus) {
        this.serviceMinus = serviceMinus;
    }

    public int performPlus(int a, int b) {
        return servicePlus.serviceAction(a, b);
    }

    public int performMinus(int a, int b) {
        return serviceMinus.serviceAction(a, b);
    }
}
