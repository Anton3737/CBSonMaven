package JavaStart.HomeWork004;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше значення");
        double op1 = sc.nextDouble();
        System.out.println("Введіть символ операції");
        String sign = sc.next();
        System.out.println("Введіть друге значення");
        double operand2 = sc.nextDouble();


        switch (sign) {
            case "+":
                double resAdd = op1 + operand2;
                System.out.println(resAdd);
                break;

            case "-":
                double resSub = op1 - operand2;
                System.out.println(resSub);
                break;

            case "*":
                double resMul = op1 * operand2;
                System.out.println(resMul);
                break;
            case "/":
                if (operand2 == 0) {
                    System.err.println("Хибна операція ,ділити на 0 не можна !!!");
                } else {
                    double resSiv = op1 / operand2;
                    System.out.println(resSiv);
                }
                break;
        }
    }
}


//Завдання 2
//
//        Використовуючи IntelliJ IDEA, створіть клас Calculator.
//
//        Напишіть програму «Консольний калькулятор».
//
//        Створіть дві змінні з іменами operand1 та operand2.
//        Задайте змінним деякі довільні значення. Запропонуйте користувачу ввести знак арифметичної операції.
//        Візьміть значення, введене користувачем, і помістіть його в рядкову змінну sign.
//
//        Для організації вибору алгоритму обчислювального процесу використовуйте перемикач switch.
//        Виведіть на екран результат виконання арифметичної операції.
//
//        У разі використання операції розподілу організуйте перевірку спроби розподілу на нуль. І якщо така є,
//        то скасуйте виконання арифметичної операції та повідомите користувача про помилку.
//
