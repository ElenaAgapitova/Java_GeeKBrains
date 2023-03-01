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
        HashMap<String, Integer> map = getMapName(getFirstName(listName));
        TreeMap<String, Integer> sortedMap = new TreeMap<>(new ValueComparator(map)) {};
        sortedMap.putAll(map);
        System.out.println(sortedMap);
    }


    static LinkedList<String> getFirstName(LinkedList<String> list) {
        LinkedList<String> newList = new LinkedList<>();
        for (String name : list) {
            String[] nameArray = name.split(" ");
            newList.add(nameArray[0]);
        }

        return newList;
    }

    static HashMap<String, Integer> getMapName(LinkedList<String> firstNameList) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String name : firstNameList) {
            if (!map.containsKey(name)) {
                map.put(name, 1);
            } else map.put(name, map.get(name) + 1);
        }
        return map;
    }

    static class ValueComparator implements Comparator<String> {
        HashMap<String, Integer> map;

        public ValueComparator( HashMap<String, Integer> map ) {
            this.map = map;
        }

        // Функции сравнения...
        public int compare( String el1, String el2 ) {
            if ( map.get( el1 ) >= map.get( el2 ) ) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}

