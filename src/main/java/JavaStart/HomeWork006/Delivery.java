package JavaStart.HomeWork006;

import java.util.Scanner;

public class Delivery {

    public static void Delivery() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть кількість замовників:");
        int factorial = 1;
        int N = sc.nextInt();
        do {
            factorial = factorial * N --;
        } while (N > 0);
        System.out.println("Число маршрутів для 1 авто , складає: " +  factorial);
    }


    public static void main(String[] args) {
        Delivery();
    }
}


//Завдання 4
//
//        Є N клієнтів, яким компанія-виробник має доставити товар.
//        Скільки є можливих маршрутів доставлення товару з урахуванням того, що товар доставлятиме одна машина?
//        Використовуючи IntelliJ IDEA, створіть клас Delivery. Напишіть програму, яка розраховуватиме
//        та виводитиме на екран кількість можливих варіантів доставлення товару. Для розв’язку задачі
//        використовуйте факторіал N!, що розраховується за допомогою циклу do-while.