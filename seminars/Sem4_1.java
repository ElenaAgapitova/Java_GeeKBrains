package seminars;

import java.util.ArrayList;
import java.util.LinkedList;

public class Sem4_1 {
    public static void main(String[] args) {
        /*
        1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
        2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
        */
        ArrayList<Integer> myArrList = new ArrayList<>();
        LinkedList<Integer> myLinkedList = new LinkedList<>();

        long timeStart1 = System.currentTimeMillis();
        fillList(myArrList);
        System.out.println(System.currentTimeMillis() - timeStart1);

        long timeStart2 = System.currentTimeMillis();
        addToFirst(myLinkedList);
        System.out.println(System.currentTimeMillis() - timeStart2);
    }

    public static void fillList(ArrayList<Integer> arrList){
        for (int i = 0; i < 100000; i++) {
            arrList.add(0, i);
        }
    }

    public static void addToFirst(LinkedList<Integer> arrList){
        for (int i = 0; i < 100000; i++) {
            arrList.addFirst(i);
        }
    }
}
