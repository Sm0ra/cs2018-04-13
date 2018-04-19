package by.it.skrypitsa.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
import java.util.Scanner;
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int result = i + j;
        System.out.println("DEC:" + i + "+" + j + "=" + result);
        System.out.println("BIN:" + Integer.toBinaryString(i) + "+" + Integer.toBinaryString(j) + "=" + Integer.toBinaryString(result));
        System.out.println("HEX:" + Integer.toHexString(i) + "+" + Integer.toHexString(j) + "=" + Integer.toHexString(result));
        System.out.println("OCT:" + Integer.toOctalString(i) + "+" + Integer.toOctalString(j) + "=" + Integer.toOctalString(result));
    }

}
