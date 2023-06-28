package Seminar_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class taskS61 {
    public static void main(String[] args) {
        List<notebook> notebooksAssortment = new ArrayList<>();
        notebooksAssortment.add(new notebook("Asus", 16, 2000,"Windows","Yellow"));
        notebooksAssortment.add(new notebook("Sony", 16, 2000,"Windows","Black"));
        notebooksAssortment.add(new notebook("Sony", 8, 1000,"Windows","Silver"));
        notebooksAssortment.add(new notebook("Apple", 16, 2000,"IOS","White"));
        notebooksAssortment.add(new notebook("Asus", 16, 2000,"Linux","White"));
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите цифру, соответствующую необходимому критерию:\n1 - Производитель\n2 - ОЗУ\n3 - Объем ЖД hd hdd\n4 - Операционная система\n5 - Цвет");
        int category = sc.nextInt();

        if (category == 1){
            System.out.println("Укажите производителя (Asus, Sony, Apple)");
            String value = sc.next();
            for (notebook notebook : notebooksAssortment) {
                if(notebook.getVendor().equals(value)){
                    System.out.println(notebook);
                }
            }
        }
        else if (category == 2){
            System.out.println("Укажите объем оперативной памяти, ГБ");
            Integer value = sc.nextInt();
            for (notebook notebook : notebooksAssortment) {
                if(notebook.getRamSizeGB() > value){
                    System.out.println(notebook);
                }
            }           
        }
        else if (category == 3){
            System.out.println("Укажите объем жесткого диска, ГБ");
            Integer value = sc.nextInt();
            for (notebook notebook : notebooksAssortment) {
                if(notebook.getHddSizeGB() > value){
                    System.out.println(notebook);
                }
            }          
        }
        else if (category == 4){
            System.out.println("Укажите тип ОС (Windows, IOS, Linux)");
            String value = sc.next();
            for (notebook notebook : notebooksAssortment) {
                if(notebook.getOsType().equals(value)){
                    System.out.println(notebook);
                }
            }           
        }
        else if (category == 5){
            System.out.println("Укажите цвет (Yellow, Black, Silver, White)");
            String value = sc.next();
             for (notebook notebook : notebooksAssortment) {
                 if(notebook.getColor().equals(value)){
                     System.out.println(notebook);
                 }
             }           
        }
        sc.close();
    }
    
}
