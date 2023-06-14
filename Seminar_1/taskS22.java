package Seminar_1;

import java.util.Random;
import java.util.Arrays;
import java.io.FileWriter;
/*2) Реализуйте алгоритм сортировки пузырьком числового массива, 
результат после каждой итерации запишите в лог-файл. */

public class taskS22 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(1, 100);
        }
        System.out.println(Arrays.toString(array));
        logSort("\n");
        sortArray(array);
        System.out.println(Arrays.toString(array));

    }
    public static void logSort(String string) {
         try{
         FileWriter writer = new FileWriter("bubbleLog.txt",true);
            writer.write(string);
            writer.write("\n");
            writer.close();
         }
         catch(Exception e){
             System.out.println("File not found");
         }
    }

    public static void sortArray(int[] array) {
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            
            for (int j = 0; j < len - i - 1; j++) {
                
                if (array[j] > array[j + 1]) {
                    
                    int tempValue = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempValue;

                    logSort(Arrays.toString(array));
                }
            }
        }
    }
}
