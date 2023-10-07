package JavaStart.HomeWork003;

import java.util.Scanner;

public class Arithmetic_Average {


    public static void average() {

        System.out.println("Введіть 3 цілі значення для виконання операцій із записом в змінну типу Int:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше ціле значення");
        int tmp1 = sc.nextInt();
        System.out.println("Введіть друге ціле значення");
        int tmp2 = sc.nextInt();
        System.out.println("Введіть третє ціле значення");
        int tmp3 = sc.nextInt();

        int resultInt = (tmp1 + tmp2 + tmp3) / 3;
        // Для запису результату середнього значення доцільним використовувати тип даних double або float (із плаваючою точкою) так як ми можемо отримати не ціле число
        // таким чином якщо ми не будемо використовувати представлення результату в double або float ми отримаємо результат цілого числа але без десятків пілся коми.

        System.out.println("Результат з виведенням через Int " + resultInt);

        System.out.println("-----------------------------------------------");

        System.out.println("Введіть 3 цілі значення для виконання операцій із записом в змінну типу double:");

        System.out.println("Введіть перше ціле значення");
        double tmpdb1 = sc.nextInt();
        System.out.println("Введіть перше ціле значення");
        double tmpdb2 = sc.nextInt();
        System.out.println("Введіть перше ціле значення");
        double tmpdb3 = sc.nextInt();

        double resultDouble = (tmpdb1 + tmpdb2 + tmpdb3) / 3;

        // для виконання більш точних математичні операцій доцільніше використовувати змінні типу double

        System.out.println("Результат з виведенням через Double " + resultDouble);
    }

    public static void main(String[] args) {
        average();
    }
}


//Завдання 2
//
//        Використовуючи IntelliJ IDEA, створіть клас Arithmetic Average.
//        Вирахуйте середнє арифметичне трьох цілих значень і виведіть його на екран.
//        З якою проблемою ви зіткнулися? Який тип змінних краще використовуватиме для коректного показу результату?