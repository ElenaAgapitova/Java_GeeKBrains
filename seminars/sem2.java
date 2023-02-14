package seminars;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.io.BufferedWriter;

public class sem2 {
    public static void main(String[] args) {
        // Дано четное число N (>0) и символы c1 и c2. 
        // Написать метод, который вернет строку длины N, которая 
        // состоит из чередующихся символов c1 и c2, начиная с c1.

        // Напишите метод, который сжимает строку. 
        // Пример: вход aaaabbbcdd

        // Напишите метод, который принимает на вход строку (String) и определяет 
        // является ли строка палиндромом (возвращает boolean значение).

        // Напишите метод, который составит строку, состоящую из 100
        // повторений слова TEST и метод, который запишет эту строку в
        // простой текстовый файл, обработайте исключения.

        System.out.println(takeString(6, "c1", "c2"));
        System.out.println(zip("aaaabbbcdd"));
        System.out.println(palindrom("шалаш"));

        String str = "Тест";
        String fileName = "file2_sem2.txt";
        str = str.repeat(100);
        try(FileWriter fw = new FileWriter("file_sem2.txt", StandardCharsets.UTF_8, false)) {
            fw.write(str);
            whenWrite(fileName);
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }


    }

    static String takeString(int num, String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num/2; i++) {
            if(i % 2 == 0) {
                sb.append(str1);
            } else
                sb.append(str2);
        }
        // return String.join("", sb);
        return sb.toString();
    }

    static String zip(String str) {
        char[] charArray = str.toCharArray();
        int count = 1;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i + 1] != charArray[i]) {
                sb.append(count);
                sb.append(charArray[i]);
                count = 1;
            } else 
                count += 1;
        }
        sb.append(count);
        sb.append(charArray[charArray.length - 1]);
        return sb.toString();
    }
    
    static boolean palindrom(String str) {
        String newString = new StringBuilder(str).reverse().toString();
        if (newString.equals(str)){
            return true;
        }
        return false;
    }

    public static void whenWrite(String fileName) throws IOException {
     String str = "Привет";
     BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, StandardCharsets.UTF_8));
     writer.write(str);
     writer.close();
}
    
}

