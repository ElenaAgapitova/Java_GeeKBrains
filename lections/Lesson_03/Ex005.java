package Lesson_03;

import java.util.Arrays;
import java.util.List;

public class Ex005 {
    public static void main(String[] args) {
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] data = new StringBuilder[]{day, month, year };
        List<StringBuilder> d = Arrays.asList(data);
        System.out.println(d); // [29, 9, 1990]
        data[1] = new StringBuilder("09");
        System.out.println(d); // [29, 09, 1990]
    }
}