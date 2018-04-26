package by.it.skrypitsa.lesson06;

/**
 * Created by user on 26.04.2018.
 */
public class DogHelper {
    static void printAllNames(Dog[] dogs){
        for (Dog dog : dogs){
            System.out.print(dog.getName()+ " ");
        }
        System.out.println();
    }
     //должен печатать в консоль через пробел имена всех собак
    static double averageAge(Dog[] dogs){
        double sum=0;
        for (Dog dog : dogs) {
           sum=sum+dog.getAge();
        }

        return sum/dogs.length;
        }
     //должен вычислять средний возраст переданных ему собак
}
