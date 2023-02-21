package seminars;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Sem4_2 {
    public static void main(String[] args) {
        /*
        Реализовать консольное приложение, которое:
        Принимает от пользователя строку вида
        text~num
        Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
        Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
         */
        program();
    }

    public static void program() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> myLinkedList = new LinkedList<>();
        while (true) {
            String data = scanner.next();
            String[] stringArr = data.split("~");
            if (Objects.equals(stringArr[0], "print")) {
                System.out.println(myLinkedList.remove(Integer.parseInt(stringArr[1])));
            } else {
                myLinkedList.add(Integer.parseInt(stringArr[1]), stringArr[0]);
            }
        }
    }
}

