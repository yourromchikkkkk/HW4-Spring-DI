package com.cursor.spring.annotationmethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private final Service servicePlus;
    private final Service serviceMinus;

    @Autowired
    public Calculator(@Qualifier("plusService") Service servicePlus,
                      @Qualifier("minusService") Service serviceMinus) {
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
