package Seminar_1;

/*1) Дана строка sql-запроса "select * from students WHERE ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
String input_str = "{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}"
Ввод данных: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow */

public class taskS21 {
    public static void main(String[] args) {
        String input_str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        //String input_str = "{\"name\":\"null\", \"country\":\"null\", \"city\":\"null\", \"age\":\"null\"}";
        
        //Готовый json-парсер не гуглим
        input_str = input_str.replace("\"", "");
        input_str = input_str.replace(" ", "");
        input_str = input_str.replace("{", "");
        input_str = input_str.replace("}", "");
        String[] input_arr_str = input_str.split(",");
        StringBuilder sb = new StringBuilder();
        sb = sb.append("select * from students");
        int count = 0;

        for (int i = 0; i < input_arr_str.length; i++) {

            if (input_arr_str[i].indexOf("null") < 0){
                if (count == 0) {
                    sb.append(" WHERE " + input_arr_str[i].replace(":", "="));
                }
                else{
                    sb.append(input_arr_str[i].replace(":", "="));
                }
                count++;
                sb.append(" AND ");
            }
        }
        
        if (count > 0){
            sb.delete(sb.length()-5,sb.length());
        }
        System.out.println(sb.toString());
    }  

}
