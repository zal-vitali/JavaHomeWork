package Seminar_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, 
что во входной структуре будут повторяющиеся имена с разными телефонами, 
их необходимо считать, как одного человека с разными телефонами. 
Вывод должен быть отсортирован по убыванию числа телефонов.

Пример:
Иванов 1231234
Иванов 3456345
Иванов 5676585
Петров 12345
Петров 82332 */
public class taskS51 {
    public static void main(String[] args) {
   
        Map<String,ArrayList<String>> phn = new HashMap<>();

        addNumber(phn, "Петров", "82332");
        addNumber(phn, "Петров", "12345");

        addNumber(phn, "Иванов", "1231234");
        addNumber(phn, "Иванов", "3456345");
        addNumber(phn, "Иванов", "5676585");

        addNumber(phn, "Пупкин", "322223");

        addNumber(phn, "Сидоров", "789456");
        addNumber(phn, "Сидоров", "777888");
        addNumber(phn, "Сидоров", "999888");
        addNumber(phn, "Сидоров", "999881");

        while(!(phn.isEmpty())){
            String maxKey = "";
            Integer maxVal = 0;
            for(var item : phn.entrySet()){
                Integer size = item.getValue().size();
                if (size > maxVal){
                    maxVal = size;
                    maxKey = item.getKey();
                } 
            }
            System.out.printf("%s: %s \n", maxKey,phn.get(maxKey).toString());
            phn.remove(maxKey);
        }
    } 

    public static void addNumber(Map<String,ArrayList<String>> phn, String name, String number) {
        ArrayList<String> ph = phn.getOrDefault(name, new ArrayList<>());
        ph.add(number);
        phn.put(name,ph);
    }
}
