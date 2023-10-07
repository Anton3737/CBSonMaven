package JavaStart.HomeWork005;

import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[] args) {

        // Безкінечний цикл для постійної перевірки на введене число
        for (; ; ) {
            System.out.println("Введіть число для перевірки на відповідність числа до 2-ї степені: ");
            Scanner numbers = new Scanner(System.in);
            int inputNumber = numbers.nextInt();

            // (Введене число є більштм за нуль?) логічне або (Введене число  порівнюється побітово з введеним числом -1 (Введене число - 1) дорівнюватиме нулю ?)
            if ((inputNumber > 0) && (inputNumber & (inputNumber - 1)) == 0) {
                System.out.println("Число = " + inputNumber + " являється є супенем 2");
            } else {
                System.err.println("Число = " + inputNumber + " являється НЕ є супенем 2");
            }
        }

//        (n > 0) && ((n & (n - 1)) == 0)
//            Завдання 5
//            Відомо, що в числах, які є ступенем двійки, лише один біт має значення 1.
//            Використовуючи IntelliJ IDEA, створіть клас PowerOfTwo. Напишіть програму,
//            яка перевірятиме, чи є вказане число ступенем двійки, чи ні.
    }
}
