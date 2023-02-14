package homeworks.homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
 //import com.google.gson.Gson;


public class task1 {
    public static void main(String[] args) {
      /*
       * Дана строка sql-запроса "select * from students where ". Сформируйте часть 
       * WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде 
       * json строки. 
       * Если значение null, то параметр не должен попадать в запрос.
       * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
       */

       String studentInfo = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
       //Gson gson = new Gson();
       //Map<String, Object> studentMap = gson.fromJson(studentInfo, new TypeToken<Map<String, Object>>(){}.getType());
       //List<Map.Entry<String, Object>> studentList = new ArrayList<>(studentMap.entrySet());

        
    }
    

} 
