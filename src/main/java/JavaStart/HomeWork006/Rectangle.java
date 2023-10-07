package JavaStart.HomeWork006;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть Висоту");
        int height = sc.nextInt();
        System.out.println("Введіть Ширину");
        int wight = sc.nextInt();

        System.out.println("Прямокутник зі сторонами: " + "Висота - " + height + " та " + "Ширина " + wight + "\n");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < wight ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.print("\n");

    }
}

//Завдання 8
//
//        Використовуючи IntelliJ IDEA, створіть клас Rectangle.
//        Створіть дві цілочислові змінні та задайте їм деякі значення.
//        Застосовуючи техніку вкладених циклів, намалюйте прямокутник із зірочок.
//        Використовуйте значення раніше створених змінних для вказівки висоти та ширини прямокутника.