package JavaStart.HomeWork009;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введіть число яке бажаєте додати до масиву " + i + " /з " + array.length);
            array[i] = sc.nextInt();
        }

        System.out.println("Туда ->");
        for (int arraySout : array) {
            System.out.print(arraySout + " ");
        }
        System.out.println();

        System.out.println("<- Сюдя");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}


//Завдання 7
//        Використовуючи IntelliJ IDEA, створіть клас Arrays.
//        Створіть масив розмірністю 10 елементів, виведіть на екран усі елементи масиву у зворотному порядку.