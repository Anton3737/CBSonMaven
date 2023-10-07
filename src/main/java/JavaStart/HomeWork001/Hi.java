package JavaStart.HomeWork001;

public class Hi {

    /*
        Завдання 3
        Створіть проект з класом Hi.java. Використовуючи методи print і println, виведіть до консолі такі фрази у різних методах:
                1.      Ваше ім'я.
                2.      Ваше прізвище.
        Використовуючи два методи, зробіть виведення до рядку.
     */

    public static void namePrint() {
        System.out.print("Антон");
        System.out.print("Бараш");
    }

    public static void namePrintln() {
        System.out.println("Антон");
        System.out.println("Бараш");
    }


    public static void main(String[] args) {
        System.out.println("Вивід через метод print()");

        namePrint();

        System.out.println("\n-------------------");

        System.out.println("Вивід через метод println()");

        namePrintln();

        System.out.println("-------------------");
        System.out.println("використовуючи звичайні конструкції  System.out.print та  System.out.println");

        System.out.println("Антон");
        System.out.println("Бараш");

        System.out.println("-------------------");

        System.out.print("Антон");
        System.out.print("Бараш");


    }


}
