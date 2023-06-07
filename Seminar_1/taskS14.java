package Seminar_1;

public class taskS14 {
    public static void main(String[] args) {
        String secret = "2? + ?5 = 69";

        String numberString = secret.replace(" ", "");
        numberString = numberString.replace("=", " ");
        numberString = numberString.replace("+", " ");

        boolean flag = true;
        int i = 1;
        int result = 0;
        int target = 0;

        while(flag){

            String numberStringR = numberString.replace("?", Integer.toString(i));        
            String[] arrString = numberStringR.split(" ", 0); 

            result = Integer.parseInt(arrString[0]) + Integer.parseInt(arrString[1]);
            target = Integer.parseInt(arrString[2]);

            if (result < target){}
            else{
                flag = false;
                if (result == target){
                    System.out.printf("Для строки %s решение есть: %s \n", secret,Integer.toString(i));
                }
                else{
                    System.out.printf("Для строки %s решения нет\n", secret);
                }
            } 
            i++;
        } 
    }   
}
