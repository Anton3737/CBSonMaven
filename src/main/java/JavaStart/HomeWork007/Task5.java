package JavaStart.HomeWork007;

import java.util.Scanner;

public class Task5 {

    static double PowerA3(double A) {
        double result_A = Math.pow(A, 3);
        System.out.println("Введене число: " + A + " в степені 3, становить: " + result_A);
        return result_A;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            System.out.println("              Іттерація №" + i);
            System.out.println("Введіть число для піднесення до степеню 3");
            Scanner sc = new Scanner(System.in);
            double A = sc.nextDouble();
            PowerA3(A);
            System.out.println("***********************************************");
        }
    }
}


//Завдання 5
//        Опишіть метод PowerA3(A, B), який обчислює третій ступінь числа A і повертає її до змінної B
//        (A – вхідний, B – вихідний параметр; обидва параметри є дійсними).
//        За допомогою цієї процедури знайдіть третій ступінь п'яти зазначених чисел.
