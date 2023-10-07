package JavaStart.HomeWork003;

import java.util.Scanner;

public class Volume {


    public static void volume() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть значення радіусу");
        double r = sc.nextDouble();
        System.out.println("Введіть значення висоти");
        double h = sc.nextDouble();

        final double PI = 3.14;

        double V = PI * ((r * r) * h);

        System.out.println("Об'єму циліндру складає: " + V);

    }

    public static void sqr() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть значення радіусу");
        double r = sc.nextDouble();
        System.out.println("Введіть значення висоти");
        double h = sc.nextDouble();

        final double PI = 3.14;

        double V = PI * ((r * r) * h);

        double S = 2 * ((PI * r) * (h + r));

        System.out.println("Площа поверхні циліндру складає: " + S);
    }


    public static void main(String[] args) {
        volume();
        sqr();
    }
}

//Завдання 4
//
//        Використовуючи IntelliJ IDEA, створіть клас Volume.
//        Напишіть програму розрахунку об'єму – V та площі поверхні -S циліндра. Об'єм V циліндра радіусом – R та висотою – h,
//        вираховується за формулою: V = πR2h.
//        Площа поверхні циліндра вираховується за формулою: S = 2πR2 + 2πR2 = 2πR(R+h).
//        Результати розрахунків виведіть на екран.