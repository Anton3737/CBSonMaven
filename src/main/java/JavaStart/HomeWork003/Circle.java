package JavaStart.HomeWork003;

import java.util.Scanner;


public class Circle {

    public static void circle() {

        final double PI = 3.14;

        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        double S = (PI * (r * r));

        System.out.println("Площа кола з радіусом " + r + " становить " + S);

    }

    public static void main(String[] args) {
        circle();
    }

}


//Завдання 3
//
//        Використовуючи IntelliJ IDEA, створіть клас Circle.
//        Створіть константу під назвою PI (число π «пі»),
//        створіть змінну радіус із назвою – r.
//        Використовуючи формулу πR2,
//        обчисліть площу кола та виведіть результат на екран.