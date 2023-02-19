package Lesson_04;

import java.util.*;

public class Ex003 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); deque.addLast(2);
        System.out.println(deque.getFirst()); System.out.println(deque.getLast());
        System.out.println(deque.peekFirst()); System.out.println(deque.peekLast());
        deque.removeLast(); deque.removeLast();
        deque.offerFirst(1); deque.offerLast(2);
        deque.pollFirst(); deque.pollLast();
        System.out.println(deque);
    }
}