package JavaStart.HomeWork004;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp = sc.nextInt();
        if (tmp > 0) {
            System.out.println("Ви ввели число " + tmp + " що є > 0");
            System.out.println(tmp = tmp + 1);
        }
        if (tmp < 0) {
            System.out.println("Ви ввели число " + tmp + " що є < 0");
            System.out.println(tmp = tmp - 2);
        }
        if (tmp == 0) {
            System.err.println("число == 0");
        }
    }
}


//Завдання 5
//
//        Дано ціле число. Якщо воно є позитивним, додайте до нього 1; інакше відніміть із нього 2. Виведіть отримане число