package Seminar_1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
/*Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение */
public class taskS31 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        int size = 20;

        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(100));
        }

        System.out.println(list);
        System.out.println("Минимальное значение: " + minVal(list));
        System.out.println("Максимальное значение: " + maxVal(list));
        System.out.println("Среднее значение: " + averVal(list));
        processList(list);
        System.out.println(list);
    }    

    public static int minVal(List<Integer> list) {
        return Collections.min(list);
    }

    public static int maxVal(List<Integer> list) {
        return Collections.max(list);
    }

    public static double averVal(List<Integer> list) {
        int sum = 0;
        for (Integer val : list) {
            sum+=val;
        }
        return sum/list.size();
    }

    public static void processList(List<Integer> list) {
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()){
            //iter.next();
            if (iter.next() % 2 == 0){
                iter.remove();
                }
        }
    }
}

