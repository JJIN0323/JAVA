package com.ohgiraffers.section04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws DivideNotZeroException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNumber = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNumber = scanner.nextInt();

            System.out.print("연산자를 입력하세요 (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            int result = calculate(firstNumber, secondNumber, operator);
            System.out.println("결과: " + result);

        } catch (InputMismatchException e) {
            System.out.println("잘못된 숫자 입력입니다. 숫자를 입력해주세요.");
        } catch (Exception e) {
            System.out.println("오류가 발생했습니다: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static int calculate(int firstNumber, int secondNumber, char operator) {
        switch (operator) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                if (firstNumber == 0 || secondNumber == 0) {
                    try {
                        throw new MultipleNotZeroException("곱하는 수는 0이 될 수 없습니다");
                    } catch (MultipleNotZeroException e) {
                        throw new RuntimeException(e);
                    }
                }
                return firstNumber * secondNumber;
            case '/':
                if (firstNumber == 0 ||secondNumber == 0) {
                    try {
                        throw new DivideNotZeroException("나눌 수는 0이 될 수 없습니다");
                    } catch (DivideNotZeroException e) {
                        throw new RuntimeException(e);
                    }
                }
                return firstNumber / secondNumber;
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다. +, -, *, / 만 사용할 수 있습니다.");
        }
    }
}