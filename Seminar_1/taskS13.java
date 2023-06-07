package Seminar_1;
import java.util.Scanner;

//3) Реализовать простой калькулятор

public class taskS13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int number1 = sc.nextInt();

        System.out.printf("Введите второе число: ");
        int number2 = sc.nextInt();

        System.out.printf("Введите арифметическое действие: ");
        String operation = sc.next();

        if (operation.equals("+")){
            System.out.printf("Сумма чисел %s и %s равна %s\n", number1,number2,number1+number2);
        }
        else if (operation.equals("-")){
            System.out.printf("Разность чисел %s и %s равна %s\n", number1,number2,number1-number2);
        }
        else if (operation.equals("*")){
            System.out.printf("Произведение чисел %s и %s равна %s\n", number1,number2,number1*number2);
        }
        else if (operation.equals("/")){
            if(number2 != 0){
                System.out.printf("Частное чисел %s и %s равна %s\n", number1,number2,number1/number2);
            }
            else System.out.print("Деление на ноль\n");
        }
        else System.out.print("Неизвестное действие\n");

        sc.close();        
    }

}
