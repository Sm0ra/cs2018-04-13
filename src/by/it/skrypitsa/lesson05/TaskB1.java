package by.it.skrypitsa.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("ONE1");
        arr.add("ONE2");
        arr.add("ONE3");
        arr.add("ONE4");
        arr.add("ONE5");
        System.out.println(arr.size());
        for (String str : arr) {
            System.out.println(str);
        }

    }
}
