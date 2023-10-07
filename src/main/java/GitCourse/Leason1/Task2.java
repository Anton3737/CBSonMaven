package GitCourse.Leason1;

import java.util.Scanner;

public class Task2 {

    String secondName;
    String name;
    String email;
    String yourCourse;

    public Task2(String secondName, String name, String email, String yourCourse) {
        this.secondName = secondName;
        this.name = name;
        this.email = email;
        this.yourCourse = yourCourse;
    }

    @Override
    public String toString() {
        return
                "Прізвище:" + secondName + '\n' +
                        "Ім'я: " + name + '\n' +
                        "E-Mail: " + email + '\n' +
                        "Ваш курс: " + yourCourse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Task2 task2 = new Task2(sc.next(), sc.next(), sc.next(), sc.next());

        System.out.println(task2);

    }
}


//Завдання 2
//        Створіть 3 файли та внесіть зміни (в консолі):
//        - 1й: прізвище, ім'я;
//        - 2й: email;
//        - 3й: назва курсу.
//        Додайте файли до репозиторію.