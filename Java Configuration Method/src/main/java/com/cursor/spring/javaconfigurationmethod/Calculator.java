package com.cursor.spring.javaconfigurationmethod;

import org.springframework.beans.factory.annotation.Autowired;


public class Calculator {
    final private Service servicePlus;
    final private Service serviceMinus;

    @Autowired
    public Calculator(Service servicePlus, Service serviceMinus) {
        this.serviceMinus = serviceMinus;
        this.servicePlus = servicePlus;
    }

    public int performPlus(int a, int b) {
        return servicePlus.serviceAction(a, b);
    }

    public int performMinus(int a, int b) {
        return serviceMinus.serviceAction(a, b);
    }
}
