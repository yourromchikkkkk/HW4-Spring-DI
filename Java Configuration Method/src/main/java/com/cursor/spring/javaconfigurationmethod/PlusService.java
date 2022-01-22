package com.cursor.spring.javaconfigurationmethod;


public class PlusService implements Service{

    @Override
    public int serviceAction(int a, int b) {
        return a + b;
    }
}
