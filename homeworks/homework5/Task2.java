package homeworks.homework5;

import java.util.*;

public class Task2 {
    // Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова,
    // Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина,
    // Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
    //Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
    //Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.

    public static void main(String[] args) {
        LinkedList<String> listName = new LinkedList<>(Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова",
                "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"));

        System.out.println(getMapName(getFirstName(listName)));
        System.out.println(getSortedMap(getMapName(getFirstName(listName))));
    }




    static LinkedList<String> getFirstName(LinkedList<String> list) {
        LinkedList<String> newList = new LinkedList<>();
        for (String name : list) {
            String[] nameArray = name.split(" ");
            newList.add(nameArray[0]);
        }

        return newList;
    }

    static TreeMap<String, Integer> getMapName(LinkedList<String> firstNameList) {
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String name : firstNameList) {
            if (!map.containsKey(name)) {
                map.put(name, 1);
            } else map.put(name, map.get(name) + 1);
        }
        return map;
    }

    static TreeMap<String, Integer> getSortedMap(TreeMap<String, Integer> map) {
        Comparator<String> valueComparator = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                Integer v1 = map.get(a);
                Integer v2 = map.get(b);
                return v2.compareTo(v1);
            }
        };
        TreeMap<String, Integer> sortedMap = new TreeMap<>(valueComparator);
        sortedMap.putAll(map);
        return sortedMap;
    }

}
