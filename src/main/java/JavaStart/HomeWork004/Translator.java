package JavaStart.HomeWork004;

import java.util.Scanner;

public class Translator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String tmp = sc.next();

        switch (tmp) {
            case "Снігопад":
                System.out.println("Snowfall");
                break;
            case "Rain":
                System.out.println("Дош");
                break;
            case "Storm":
                System.out.println("Буря");
                break;
            case "Fog":
                System.out.println("Туман");
                break;
            case "Sunny":
                System.out.println("Сонячно");
                break;
            case "Thunderstorm":
                System.out.println("Гроза");
                break;
            case "Windy":
                System.out.println("Вітряно");
                break;
            case "Cloudy":
                System.out.println("Хмарно");
                break;
            case "Heat":
                System.out.println("Спека");
                break;
            case "Hail":
                System.out.println("Крижаний град");
                break;
            default:
                System.err.println("Введеного Вами слова немає в переліку");

        }
    }
}


//Завдання 8
//
//        Використовуючи IntelliJ IDEA, створіть клас Translator.
//        Напишіть програму «Українсько-англійський перекладач».
//        Програма знає 10 слів про погоду. Потрібно, щоби користувач вводив слово українською мовою,
//        а програма давала йому переклад англійською мовою. Якщо користувач ввів слово, для якого немає перекладу,
//        варто вивести повідомлення, що такого слова немає.
//

