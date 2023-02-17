package seminars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import java.util.List;
public class sem3 {
    public static void main(String[] args) {
        // Задание №0
        // Даны следующие строки, cравнить их с помощью == и
        // метода equals() класса Object
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5, s6));
        for (int i = 0; i < arrList.size() - 1; i++) {
            for (int j = 1; j < arrList.size(); j++) {
                System.out.printf("%d  %s инквивалентно %d %s : %b\n", i + 1,
                        arrList.get(i), j + 1, arrList.get(j), arrList.get(i).equalsIgnoreCase(arrList.get(j)));
                System.out.printf("%d %s == %d %s : %b\n", i + 1,
                        arrList.get(i), j + 1, arrList.get(j), arrList.get(i) == (arrList.get(j)));
                System.out.println();

            }
        }

        // Заполнить список десятью случайными числами.
        //// Отсортировать список методом sort() и вывести его на
        //// экран.

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100); // случайное число от 0 до 99
            numbers.add(randomNumber);
        }

        System.out.println("Список случайных чисел: " + numbers);
        numbers.sort(null);
        System.out.println("Список случайных чисел: " + numbers);

        // // Заполнить список названиями планет Солнечной
        //// системы в произвольном порядке с повторениями.
        //// Вывести название каждой планеты и количество его
        //// повторений в списке.
        //// Задание состоит из двух блоков
        //// Задание №2.2 (если выполнено первое задание)
        //// Пройти по списку из предыдущего задания и удалить
        //// повторяющиеся элементы.

        ArrayList <String> planeta = new ArrayList<>(Arrays.
                asList("Марс", "Земля", "Марс"));
        Set<String> set =new LinkedHashSet<>(planeta);
        for (String item : set) {
            int count = Collections.frequency(planeta, item);
            System.out.printf("%s - %d\n", item, count);
        }
        for (String item : set) {
            int count = Collections.frequency(planeta, item);
            while (count > 1){
                planeta.remove(item);
                count = Collections.frequency(planeta, item);
            }
        }
        System.out.println(String.join(", ", planeta) );

        // Каталог товаров книжного магазина сохранен в виде двумерного
        // списка List<ArrayList<String>> так, что на 0й позиции каждого
        // внутреннего списка содержится название жанра, а на остальных
        // позициях - названия книг. Напишите метод для заполнения данной
        // структуры.

        List<List<String>> catalog = new ArrayList<>();
        catalog.add(Arrays.asList("проза", "поэзия", "детектив"));
        catalog.add(Arrays.asList("1", "2", "3"));
        System.out.println(catalog);

    }
}

