package homeworks.homework5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Phonebook {
    Map<String, LinkedList<Integer>> phonebook = new HashMap<>();

    void add(String name, int phoneNumber) {
        if (phonebook.containsKey(name)) {
            phonebook.get(name).add(phoneNumber);
        } else {
            LinkedList<Integer> phone = new LinkedList<>();
            phone.add(phoneNumber);
            phonebook.put(name, phone);
        }
    }

    void showPhoneNumber(String name) {
        if (phonebook.containsKey(name)) {
            System.out.printf("Контакт в телефонной книге: %s\n", name);
            for (int number : phonebook.get(name)){
                System.out.printf("\t%d\n", number);
            }
        } else System.out.println("Контакта нет в телефонной книге!");
    }

    void showPhonebook(){
        if (phonebook.isEmpty()) System.out.println("Телефонный справочник пуст!");
        for (String name: phonebook.keySet()){
            System.out.printf("Контакт %s:\n", name);
            for(int number: phonebook.get(name)) {
                System.out.printf("\tНомер телефона: %d\n", number);
            }
            System.out.println();
        }
    }
}
