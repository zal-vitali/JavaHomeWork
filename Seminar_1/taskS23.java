package Seminar_1;

import java.io.FileReader;
/*Дана строка (сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, 
создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика. */

public class taskS23 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        try {
            FileReader fileReader = new FileReader("students.txt");
            int c;
            while ((c = fileReader.read()) != -1) {
                sb.append((char) c);
            }
            fileReader.close();
            
            String text = sb.toString();
            text = text.replace("\"", "");
            text = text.replace("},{", "}<>{");
            text = text.replace("{", "");
            text = text.replace("}", "");

            sb.delete(0, sb.length());

            String[] student = text.split("<>", 0);
            for (int i = 0; i < student.length; i++) {
                String[] performance = student[i].split(",");

                sb.append("Студент ");
                sb.append(performance[0].split(":")[1]);
                sb.append(" получил ");
                sb.append(performance[1].split(":")[1]);
                sb.append(" по предмету ");
                sb.append(performance[2].split(":")[1]);
                sb.append("\n");

            }
            System.out.print(sb.toString());
        } catch (Exception e) {
            System.out.println("Not found");
        }

    }

}
