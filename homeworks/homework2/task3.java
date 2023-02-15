package homeworks.homework2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;
import java.util.ArrayList;
public class task3 {
    public static void main(String[] args) {
        /*
        Дана json строка (можно сохранить в файл и читать из файла)
        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4",
        "предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
        Написать метод(ы), который распарсит json и, используя StringBuilder,
        создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
        Пример вывода:
        Студент Иванов получил 5 по предмету Математика.
         */
        String jsonStr = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\n" +
                "\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":" +
                "\"Физика\"}]";
        getString(jsonStr);
    }

    static void getString(String jsonStr) {
        Gson gson = new Gson();
        Map<String, Object> jsonMap = gson.fromJson(jsonStr, new TypeToken<Map<String,String>>(){}.getType());
        List<Map.Entry<String, Object>> pupilsList = new ArrayList<>(jsonMap.entrySet());
        // StringBuilder sb = new StringBuilder();
//        for (Map.Entry<String, Object> entry: pupilsList) {
//            sb.append("Студент ");
//            sb.append(entry.getValue());
//            sb.append(" получил ");
//            sb.append(entry.getValue());
//            sb.append(" по предмету ");
//            sb.append(entry.getValue());
//            sb.append("\n");
        System.out.println(pupilsList.toString());
        }


    }

