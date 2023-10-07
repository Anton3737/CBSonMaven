package JavaStart.HomeWork008;

import java.util.Scanner;

public class Calculator {


    public static void calculate(int A, int B, int C) {
        final int five = 5;
        double resA = (double) A / five;
        double resB = (double) B / five;
        double resC = (double) C / five;

        System.out.println(resA + "\n" + resB + "\n" + resC);
    }

    static void calculateCycle() {
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            final int five = 5;
            int input = sc.nextInt();
            System.out.println("Введіть " + i + "ше " + "значення");
            double res = (double) input / five;
            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        System.out.println("введіть 3 цілочислені значення");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше значення");
        int A = sc.nextInt();
        System.out.println("Введіть друге значення");
        int B = sc.nextInt();
        System.out.println("Введіть третє значення");
        int C = sc.nextInt();

        calculate(A, B, C);

        System.out.println("**********************************************\n");

        System.out.println("Виконання методу через цикл");
        System.out.println("введіть 3 цілочислені значення");


        calculateCycle();


    }
}

//
//Завдання 5
//        Використовуючи IntelliJ IDEA, створіть клас Calculator.
//        Створіть метод з ім'ям calculate, який приймає як параметри три
//        цілочислові значення та повертає значення кожного аргументу, поділеного на 5.