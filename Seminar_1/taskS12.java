package Seminar_1;

/*
2) Вывести все простые числа от 1 до 1000 
*/
public class taskS12 {
    public static void main(String[] args) {
        numbers();
    }

    public static void numbers() {
        boolean flag;
        for (int i = 1; i <= 1000; i++) {
            flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }
    }

}
