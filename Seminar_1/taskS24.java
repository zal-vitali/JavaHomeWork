package Seminar_1;
import java.util.Scanner;
import java.io.FileWriter;
/*4) К калькулятору из предыдущего ДЗ добавить логирование.
4+2=6
6-1=5 */

public class taskS24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int number1 = sc.nextInt();

        System.out.printf("Введите второе число: ");
        int number2 = sc.nextInt();

        System.out.printf("Введите арифметическое действие: ");
        String operation = sc.next();

        int result = 0;

        if (operation.equals("+")){
            result = number1+number2;
            System.out.printf("Сумма чисел %s и %s равна %s\n", number1,number2,result);
        }
        else if (operation.equals("-")){
            result = number1-number2;
            System.out.printf("Разность чисел %s и %s равна %s\n", number1,number2,result);
        }
        else if (operation.equals("*")){
            result = number1*number2;
            System.out.printf("Произведение чисел %s и %s равна %s\n", number1,number2,result);
        }
        else if (operation.equals("/")){
            if(number2 != 0){
                result = number1/number2;
                System.out.printf("Частное чисел %s и %s равна %s\n", number1,number2,result);
            }
            else System.out.print("Деление на ноль\n");
        }
        else System.out.print("Неизвестное действие\n");

        sc.close();   
        StringBuilder sb = new StringBuilder();
        
        sb.append(Integer.toString(number1));
        sb.append(operation);
        sb.append(Integer.toString(number2));
        sb.append("=");
        sb.append(Integer.toString(result));
        sb.append("\n");
        logCalc(sb.toString());
        sb.delete(0, sb.length());

    }

    public static void logCalc(String string) {
        try{
        FileWriter writer = new FileWriter("calc.txt",true);
           writer.write(string);
           writer.close();
        }
        catch(Exception e){
            System.out.println("File not found");
        }
   }

}
