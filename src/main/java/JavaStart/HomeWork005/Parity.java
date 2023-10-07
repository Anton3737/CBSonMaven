package JavaStart.HomeWork005;

import java.util.Scanner;

public class Parity {
    public static void if_elseMethod() {
        Scanner sc = new Scanner(System.in);
        int tmp = sc.nextInt();

        if (tmp % 2 == 0) {
            System.out.println("Введене Вами число " + tmp + " являється Парним");
        } else {
            System.out.println("Введене Вами число " + tmp + " являється НЕпарним");
        }
    }

    public static void ternaryMethod() {
//        условие ? результат 1 : результат 2
        Scanner sc = new Scanner(System.in);
        int tmp = sc.nextInt();
        System.out.println(tmp % 2 == 0 ? "Введене Вами число " + tmp + " являється Парним" : "Введене Вами число " + tmp + " являється НЕпарним");
    }


    public static void main(String[] args) {
        // Через конструкцію if-else
        if_elseMethod();

        // Через конструкцію тернарнрго оператору
        ternaryMethod();
    }
}
