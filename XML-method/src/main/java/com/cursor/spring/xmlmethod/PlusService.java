package com.cursor.spring.xmlmethod;

public class PlusService implements Service {

    @Override
    public int serviceAction(int a, int b) {
        return a + b;
    }
}

