package JavaStart.HomeWork004;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp = sc.nextInt();
        if (tmp > 0) {
            System.out.println("Введене вами число " + tmp + " являється позитивним та до результату якого ми додаємо +1");
            int res = tmp + 1;
            System.out.println("Результатом гілки є " + res);

        } else {
            System.out.println("Введене вами число " + tmp + " являється НЕ позитивним");
            System.out.println(tmp);
        }
    }
}

//    Дано ціле число. Якщо воно є позитивним, додайте до нього 1; інакше не змінюйте його. Виведіть отримане число.