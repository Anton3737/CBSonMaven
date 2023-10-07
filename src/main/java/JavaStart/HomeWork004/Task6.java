package JavaStart.HomeWork004;

import java.util.*;

public class Task6 {
    public static void List() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            arrayList.add(sc.nextInt());
        }
        System.out.println("Максимальне значення: " + Collections.max(arrayList));
        System.out.println("Мінімальне значення: " + Collections.min(arrayList));
        System.out.println("Середнє значення 3х < " + arrayList.get(0) + "|" + arrayList.get(1) + "|" + arrayList.get(2) + " > введених чисел: " + (double) ((arrayList.get(0) + arrayList.get(1) + arrayList.get(2))) / 3);
    }

    public static void main(String[] args) {
        List();
    }
}

//Завдання
//Дано три цілих числа. Знайдіть максимальне, мінімальне та середнє.
