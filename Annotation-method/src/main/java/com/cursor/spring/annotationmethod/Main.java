package com.cursor.spring.annotationmethod;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationcontext.xml"
        );) {
            Calculator calculator = context.getBean("calculator", Calculator.class);
            System.out.println("Input two integers:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a <= b) {
                System.out.println(calculator.performPlus(a , b));
            } else {
                System.out.println(calculator.performMinus(a, b));
            }
        }

    }
}
