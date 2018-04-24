package by.it.skrypitsa.lesson04;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int den = scanner.nextInt();
        int mes = scanner.nextInt();
        int result = 0;
        for (int month = 1; month < mes; month++) {
            switch (month) {
                case 1:
                    result += 31;
                    break;
                case 2:
                    result += 28;
                    break;
                case 3:
                    result += 31;
                    break;
                case 4:
                    result += 30;
                    break;
                case 5:
                    result += 31;
                    break;
                case 6:
                    result += 30;
                    break;
                case 7:
                    result += 31;
                    break;
                case 8:
                    result += 31;
                    break;
                case 9:
                    result += 30;
                    break;
                case 10:
                    result += 31;
                    break;
                case 11:
                    result += 30;
                    break;

            }


        }
        result += den;
        System.out.println(result);
    }

}

