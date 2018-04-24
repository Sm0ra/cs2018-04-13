package by.it.skrypitsa.lesson04;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/
import java.util.Scanner;
public class TaskC1 {
    public static void main(String[] args) {
        System.out.println("Какую вы хотите зарплату в $$$?");
        Scanner scanner = new Scanner(System.in);
        float zp = scanner.nextFloat();
        if (zp < 300 || zp > 3000)
            System.out.println("Мы вам перезвоним!");
        else {
            String month_name = "";
            float amount = 0;
            for (int month = 0; month <= 14; month++){
                switch (month){
                    case 0:
                    case 13:
                    case 14:
                        month_name = "месяц " + month;
                        amount = 0;
                    break;
                    case 1:
                        month_name = "январь";
                        amount = zp*1.5f;
                        break;
                    case 2:
                        month_name = "февраль";
                        amount = zp*1.5f;
                        break;
                    case 3:
                        month_name = "март";
                        amount = zp*1.5f;
                        break;
                    case 4:
                        month_name = "апрель";
                        amount = zp*1.5f;
                        break;
                    case 5:
                        month_name = "май";
                        amount = zp*1.5f;
                        break;
                    case 6:
                        month_name = "июнь";
                        amount = zp;
                        break;
                    case 7:
                        month_name = "июль";
                        amount = zp;
                        break;
                    case 8:
                        month_name = "август";
                        amount = zp;
                        break;
                    case 9:
                        month_name = "сентябрь";
                        amount = zp*1.5f;
                        break;
                    case 10:
                        month_name = "октябрь";
                        amount = zp*1.5f;
                        break;
                    case 11:
                        month_name = "ноябрь";
                        amount = zp*1.5f;
                        break;
                    case 12:
                        month_name = "декабрь";
                        amount = zp*1.5f;
                        break;
                }
                System.out.println("За " + month_name  + " начислено $"+ amount);
                if (amount == 666.0) {
                    break;
                }
            }

        }

}
}
