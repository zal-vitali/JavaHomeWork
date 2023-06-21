package Seminar_1;

import java.util.Deque;
import java.util.LinkedList;

/*Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке 
и каждый из их узлов содержит одну цифру.
1) Умножьте два числа и верните произведение в виде связанного списка.
2) Сложите два числа и верните сумму в виде связанного списка.
Одно или два числа могут быть отрицательными.

Даны два Deque, цифры в обратном порядке.
[3,2,1,-] - пример Deque
[5,4,3]- пример второго Deque
1) -123 * 345 = -42 435
Ответ всегда - связный список, в обычном порядке
[-,4,2,4,3,5] - пример ответа */
public class taskS41 {
    public static void main(String[] args) {
        Deque<String> dqs = new LinkedList<>();
        dqs.addLast("3");
        dqs.addLast("2");
        // dqs.addLast("-");
        dqs.addLast("1");
        dqs.addLast("-");
        System.out.println(dqs);

        Deque<String> dqs1 = new LinkedList<>();
        dqs1.addLast("5");
        dqs1.addLast("4");
        dqs1.addLast("3");
        System.out.println(dqs1);
        
        int num = dequeToInt(dqs);
        int num1 = dequeToInt(dqs1);

        System.out.println(intToLinkedList(num1 * num));
        System.out.println(intToLinkedList(num1 + num));

    }

    public static int dequeToInt(Deque<String> dqs) {
        int s = 1;
        String val = "";
        while (!dqs.isEmpty()) {

            String currentVal = dqs.removeLast();
            if (currentVal.equals("-")) {
                s *= -1;
            } else {
                val = val + currentVal;
            }
        }

        return Integer.parseInt(val) * s;
    }

    public static LinkedList<String> intToLinkedList(int num) {
        LinkedList<String> ll = new LinkedList<String>();
        boolean s = false;
        if (num < 0){
            num = -num;
            s = true;
        }

        while (!(num == 0)) {
            ll.addFirst(Integer.toString(num % 10));
            num /= 10;
        }

        if (s) ll.addFirst("-");

        return ll;
    }
}
