package JavaStart.HomeWork007;

import java.util.Scanner;

public class Arithmetics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перший операнд:");
        int operand_1 = scanner.nextInt();
        System.out.println("Ви ввели: " + operand_1);
        System.out.println("Введіть символ операції:");
        String symbol = scanner.next();
        System.out.println("Ви ввели: " + symbol);
        System.out.println("Введіть другий операнд:");
        int operand_2 = scanner.nextInt();
        System.out.println("Ви ввели: " + operand_2);
        System.out.println("***************************************************");


        switch (symbol) {
            case "+":
                add(operand_1, operand_2);
                break;
            case "-":
                sub(operand_1, operand_2);
                break;
            case "*":
                mul(operand_1, operand_2);
                break;
            case "/":
                div(operand_1, operand_2);
                break;
            default:
                System.out.println("Операція відсутня");
        }
    }

    static int add(int operand_1, int operand_2) {
        int res = operand_1 + operand_2;
        System.out.println("Результат операції додавання чисел: " + operand_1 + " та " + operand_2 + " становить= " + res);
        return res;
    }

    static int sub(int operand_1, int operand_2) {
        int res = operand_1 - operand_2;
        System.out.println("Результат операції віднімання чисел: " + operand_1 + " та " + operand_2 + " становить= " + res);
        return res;
    }

    static int mul(int operand_1, int operand_2) {
        int res = operand_1 * operand_2;
        System.out.println("Результат операції множення чисел: " + operand_1 + " та " + operand_2 + " становить= " + res);
        return res;
    }

    static int div(int operand_1, int operand_2) {
        if (operand_2 == 0) {
            System.err.println("Неможливо виконати операцію ділення на 0");
        }
        int res = operand_1 / operand_2;
        System.out.println("Результат операції ділення чисел: " + operand_1 + " та " + operand_2 + " становить= " + res);
        return res;
    }
}

//Завдання 2
//
//        Використовуючи IntelliJ IDEA, створіть клас Arithmetics.
//        Створіть чотири методи для виконання арифметичних операцій з іменами:
//        add – додавання,
//        sub – віднімання,
//        mul – множення,
//        div – ділення.
//        Кожен метод має приймати два цілих аргументи та виводити на екран результат
//        виконання арифметичної операції відповідної імені методу. Метод поділу
//        div має виконувати перевірку спроби поділу на нуль.
//        Потрібно надати користувачеві можливість вводити з клавіатури
//        значення операндів і знак арифметичної операції для виконання обчислень.