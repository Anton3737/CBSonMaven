package JavaStart.HomeWork002;

import java.util.Scanner;

public class Task4 {


    public static void main(String[] args) {
        System.out.println("Якого кольору трава ?: ");
        Scanner sc = new Scanner(System.in);

        String tmp = sc.next();

        String green = "green";

        if (tmp.equals(green)) {
            System.out.println("Твердження вірне: " + tmp);
            System.out.println("Трава is " + tmp + " колор !");
        } else {
            System.err.println("Невірно " + ", ви ввели значення: " + tmp + " шо не відповідає значенню " + green);

        }
    }
}

//Завдання 4
//
//        Створіть проект. Використовуючи логічний тип даних,
//        створіть програму, в якій буде логічне твердження, наприклад,
//        «трава зелена» і поряд виведіть значення змінної, істинний цей вираз або хибний.