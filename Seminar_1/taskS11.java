package Seminar_1;
import java.util.Scanner;
/* 
1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
n! (произведение чисел от 1 до n)
*/
public class taskS11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int number = sc.nextInt();

        System.out.println(triangle(number));
        System.out.println(factorial(number));

        sc.close();
    }
    public static int factorial(int number) {
        if (number == 1) return 1;   
        else return(number * factorial(number-1));
    }

    public static int triangle(int number) {
        if (number == 1) return 1;   
        else return(number + triangle(number-1));
    }
}