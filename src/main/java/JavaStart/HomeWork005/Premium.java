package JavaStart.HomeWork005;

import java.util.Scanner;

public class Premium {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть Ваш стаж роботи:");
        int yearsOnTheWork = sc.nextInt();
        System.out.println("Введіть Вашу заробітну плату:");
        double salary = sc.nextDouble();

        if (yearsOnTheWork != 0) {
            if (yearsOnTheWork <= 5) {
                System.out.println("Сума Вашої заробітної плати " + salary + " з врахуванням преміальної савки 10% за вислугу років становить:  " + (salary + (salary * 0.10)));
            } else if (yearsOnTheWork > 5 || yearsOnTheWork <= 10) {
                System.out.println("Сума Вашої заробітної плати " + salary + " з врахуванням преміальної савки 15% за вислугу років становить:  " + (salary + (salary * 0.15)));
            } else if (yearsOnTheWork > 10 || yearsOnTheWork <= 15) {
                System.out.println("Сума Вашої заробітної плати " + salary + " з врахуванням преміальної савки 25% за вислугу років становить:  " + (salary + (salary * 0.25)));
            } else if (yearsOnTheWork > 15 || yearsOnTheWork <= 20) {
                System.out.println("Сума Вашої заробітної плати " + salary + " з врахуванням преміальної савки 35% за вислугу років становить:  " + (salary + (salary * 0.35)));
            } else if (yearsOnTheWork > 20 || yearsOnTheWork <= 25) {
                System.out.println("Сума Вашої заробітної плати " + salary + " з врахуванням преміальної савки 45% за вислугу років становить:  " + (salary + (salary * 0.45)));
            } else if (yearsOnTheWork > 25) {
                System.out.println("Сума Вашої заробітної плати " + salary + " з врахуванням преміальної савки 50% за вислугу років становить:  " + (salary + (salary * 0.50)));
            }
        } else {
            System.err.println("Введені вами дані не входять в жоден з параметрів пошуку !!!");
        }
    }
}

//Завдання 4
//        Використовуючи IntelliJ IDEA, створіть клас Premium. Напишіть програму розрахунку нарахування премій працівникам.
//        Премії розраховуються згідно з вислугою років.
//        Якщо вислуга до 5 років,премія становить 10% від заробітної плати.
//        Якщо вислуга від 5 років (включно) до 10 років, то премія становить 15% від заробітної плати.
//        Якщо вислуга від 10 років (включно) до 15 років,премія становить 25% від заробітної плати.
//        Якщо вислуга від 15 років (включно) до 20 років,премія становить 35% від заробітної плати.
//        Якщо вислуга від 20 років (включно) до 25 років,премія становить 45% від заробітної плати.
//        Якщо вислуга від 25 років (включно) та більше,премія складає 50% від заробітної плати.
//        Результати розрахунку виведіть на екран.
