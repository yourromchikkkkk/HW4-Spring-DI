package com.cursor.spring.xmlmethod;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator;
        try (        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationcontext.xml"
        );) {
            System.out.println("Input two integer values:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a <= b) {
                calculator = context.getBean("calculatorPlus", Calculator.class);
            } else {
                calculator = context.getBean("calculatorMinus", Calculator.class);
            }
            System.out.println(calculator.perform(a, b));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
