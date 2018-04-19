package by.it.skrypitsa.lesson02;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3,86
Земля   9,81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
class TaskC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double ves_mars = getWeight(i);
        System.out.println(ves_mars);
    }
   static double getWeight(int weight) {
       double mars = 3.86;
       double zemla = 9.81;
       double ves_mars = ((double)weight) * mars / zemla;
       double result = new BigDecimal(ves_mars).setScale(2, RoundingMode.HALF_UP).doubleValue();

       return result;
   }
}

