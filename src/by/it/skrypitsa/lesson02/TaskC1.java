package by.it.skrypitsa.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
import java.util.Scanner;
class TaskC1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int result = i + j;
        System.out.println("Sum = " + result);

    }




}
