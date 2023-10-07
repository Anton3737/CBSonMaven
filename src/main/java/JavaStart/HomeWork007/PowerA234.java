package JavaStart.HomeWork007;

import java.util.Scanner;

public class PowerA234 {


    static void PowerA234(double A) {

        double B = Math.pow(A, 2);
        System.out.println("Число: " + A + " в степені 2 дорівнює: = " + B);
        double C = Math.pow(A, 3);
        System.out.println("Число: " + A + " в степені 3 дорівнює: = " + C);
        double D = Math.pow(A, 4);
        System.out.println("Число: " + A + " в степені 4 дорівнює: = " + D);

    }


    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("                Іттерація №" + i);
            System.out.println("Введіть число для піднесення до степеню 2/3/4:");
            Scanner sc = new Scanner(System.in);
            double A = sc.nextDouble();

            PowerA234(A);
            System.out.println("***********************************************");
        }
    }
}

//Завдання 6
//        Опишіть метод PowerA234(A, B, C, D), який обчислює другий, третій і четвертий ступінь
//        числа A і повертає ці ступені відповідно до змінних B, C і D (A – вхідний, B, C, D – вихідні параметри; усі параметри є дійсними).
//        За допомогою цієї процедури знайдіть другий, третій і четвертий ступені п'яти зазначених чисел.
