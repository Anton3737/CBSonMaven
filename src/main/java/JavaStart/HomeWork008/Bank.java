package JavaStart.HomeWork008;

import java.util.Scanner;

public class Bank {

    static void bankMethod() {
        int resault = 0;
        int tmp = 0;
        int Credit = 700;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            if (resault < Credit) {
                tmp = sc.nextInt();
                resault += tmp;
                System.out.println("Поточна сумма внеску складає " + resault);
                int overPay = (tmp - Credit);
                if (resault <= Credit) {
                }
                System.out.println("Внесено " + i + "й платіж.");
                System.out.println("Переплата становить: " + overPay);
            } else
                break;
        }
    }

    public static void main(String[] args) {
        bankMethod();
    }
}

//Завдання 2
//        Використовуючи IntelliJ IDEA, створіть клас Bank. Уявіть, що ви реалізуєте програму для банку,
//        яка допомагає визначити, погасив клієнт кредит чи ні. Припустимо, щомісячна сума платежу має становити 100 грн.
//        Клієнт має виконати 7 платежів, але може платити рідше великими сумами.
//        Тобто може двома платежами по 300 і 400 грн закрити весь борг.
//
//        Створіть метод, який як аргумент прийматиме суму платежу,
//        введену економістом банку. Метод виводить на екран
//        інформацію про стан кредиту (сума заборгованості, сума переплат, повідомлення про відсутність боргу).
