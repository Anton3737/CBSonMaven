package Abramyan;

import java.util.Scanner;

public class InputOutput {

    //        Begin1◦. Дана сторона квадрата a. Найти его периметр P = 4·a.
    static int begin1(int a) {
        int P = 4 * a;
        return P;
    }

    //    Begin2◦. Дана сторона квадрата a. Найти его площадь S = a2.
    static double begin2(int a) {
        double S = Math.pow(a, 2);
        return S;
    }

    //        Begin3◦. Даны стороны прямоугольника a и b. Найти его площадь S = a·b и  периметр P = 2·(a + b).
    static double begin3(int a, int b) {
        double S = a * b;
        return S;
    }

    static double begin3_1(int a, int b) {
        double P = 2 * (a + b);
        return P;
    }

    //        Begin4◦. Дан диаметр окружности d. Найти ее длину L = π·d. В качестве значения π использовать 3.14.
    static double begin4(int a) {
        double L = 3.14 * a;
        return L;
    }

    //        Begin5◦. Дана длина ребра куба a. Найти объем куба V = a3 и площадь его поверхности S = 6·a2.
    static double begin5(int a) {
        double V = Math.pow(a, 3);
        return V;
    }

    static double begin5_1(int a) {
        double S = 6 * Math.pow(a, 2);
        return S;
    }
    //        Begin6◦. Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти его объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).

    static double begin6(int a, int b, int c) {
        double V = a * b * c;
        return V;
    }

    static double begin6_1(int a, int b, int c) {
        double S = 2 * ((a * b) + (b * c) + (c * a));
        return S;
    }

    static double begin7(int a) {
        double L = 2 * (3.14 * a);
        return L;
    }

    static double begin7_1(int a) {
        double S = 3.14 * Math.pow(a, 2);
        return S;
    }

    static double begin8(int a, int b) {
        double avg = (a + b) / 2;
        return avg;
    }

    static double begin9(int a, int b) {
        double avgGeo = Math.sqrt(a * b);
        return avgGeo;
    }

    static void begin10(int a, int b) {
        double sum = a + b;
        double dev = a - b;
        double powA = Math.pow(a, 2);
        double powB = Math.pow(b, 2);

        System.out.println(sum);
        System.out.println(dev);
        System.out.println(powA);
        System.out.println(powB);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int beg1 = sc.nextInt();
        int beg2 = sc.nextInt();
        int beg3 = sc.nextInt();


//        Begin1◦. Дана сторона квадрата a. Найти его периметр P = 4·a.
        System.out.println(begin1(beg1));

//        Begin2◦. Дана сторона квадрата a. Найти его площадь S = a2.
        System.out.println(begin2(beg1));

//        Begin3◦. Даны стороны прямоугольника a и b. Найти его площадь S = a·b и  периметр P = 2·(a + b).
        System.out.println(begin3(beg1, beg2));
        System.out.println(begin3_1(beg1, beg2));

//        Begin4◦. Дан диаметр окружности d. Найти ее длину L = π·d. В качестве значения π использовать 3.14.
        System.out.println(begin4(beg1));

//        Begin5◦. Дана длина ребра куба a. Найти объем куба V = a3 и площадь его поверхности S = 6·a2.
        System.out.println(begin5(beg1));
        System.out.println(begin5_1(beg1));

//        Begin6◦. Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти его объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).
        System.out.println(begin6(beg1, beg2, beg3));
        System.out.println(begin6_1(beg1, beg2, beg3));

//        Begin7◦. Найти длину окружности L и площадь круга S заданного радиуса R L = 2·π·R, S = π·R2. В качестве значения π использовать 3.14.
        System.out.println(begin7(beg1));
        System.out.println(begin7_1(beg1));

//        Begin8◦. Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2.
        System.out.println(begin8(beg1, beg2));

//        Begin9◦. Даны два неотрицательных числа a и b. Найти их среднее геометри- ческое, то есть квадратный корень из их произведения: √a·b.
        System.out.println(begin9(beg1, beg2));

//        Begin10◦. Даны два ненулевых числа. Найти сумму, разность, произведение и частное их квадратов.
        begin10(beg1, beg2);

    }
}
