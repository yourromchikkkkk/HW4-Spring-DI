package com.cursor.spring.javaconfigurationmethod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        System.out.println("Input two integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Calculator calculator = context.getBean("calculator", Calculator.class);
        if (a <= b) {
            System.out.println(calculator.performPlus(a, b));
        } else {
            System.out.println(calculator.performMinus(a, b));
        }
    }
}
