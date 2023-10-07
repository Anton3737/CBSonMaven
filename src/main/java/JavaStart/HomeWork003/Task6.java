package JavaStart.HomeWork003;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше значення ");
        int tmp1 = sc.nextInt();
        System.out.println("Введіть перше значення ");

        int tmp2 = sc.nextInt();

        int res1 = tmp1 + tmp2;
        System.out.println("Результат арифметичної операції + між значенням " + tmp1 + " та значенням " + tmp2 + " складає " + res1);
        int res2 = tmp1 - tmp2;
        System.out.println("Результат арифметичної операції - між значенням " + tmp1 + " та значенням " + tmp2 + " складає " + res2);
        int res3 = tmp1 * tmp2;
        System.out.println("Результат арифметичної операції * між значенням " + tmp1 + " та значенням " + tmp2 + " складає " + res3);
        float res4 = tmp1 / tmp2;
        System.out.println("Результат арифметичної операції / між значенням " + tmp1 + " та значенням " + tmp2 + " складає " + res4);
        double res5 = tmp1 % tmp2;
        System.out.println("Результат арифметичної операції % між значенням " + tmp1 + " та значенням " + tmp2 + " складає " + res5);
    }


}
