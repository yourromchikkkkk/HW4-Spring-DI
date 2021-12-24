package com.cursor.spring.annotationmethod;

import org.springframework.stereotype.Component;

@Component
public class PlusService implements Service{

    @Override
    public int serviceAction(int a, int b) {
        return a + b;
    }
}

