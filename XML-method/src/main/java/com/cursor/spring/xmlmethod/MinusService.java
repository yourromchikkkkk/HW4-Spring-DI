package com.cursor.spring.xmlmethod;

public class MinusService implements Service {

    @Override
    public int serviceAction(int a, int b) {
        return a - b;
    }
}
