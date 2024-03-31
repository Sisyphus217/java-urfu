package lr3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        System.out.println("Добавление в начало:");
        System.out.println("LinkedList: " + AddToFirst(linkedList));
        System.out.println("ArrayDeque: " + AddToFirst(arrayDeque));
        System.out.println("TreeSet: " + AddToFirst(treeSet));

        System.out.println("Добавление в середину:");
        System.out.println("LinkedList: " + AddToMiddle(linkedList));
        System.out.println("ArrayDeque: -");
        System.out.println("TreeSet: -");

        System.out.println("Добавление в конец:");
        System.out.println("LinkedList: " + AddToEnd(linkedList));
        System.out.println("ArrayDeque: " + AddToEnd(arrayDeque));
        System.out.println("TreeSet: -" );


        System.out.println("Удаление в начале:");
        System.out.println("LinkedList: " + removeToFirst(linkedList));
        System.out.println("ArrayDeque: " + removeToFirst(arrayDeque));
        System.out.println("TreeSet: " + removeToFirst(treeSet));

        System.out.println("Удаление в середине:");
        System.out.println("LinkedList:" + removeToMiddle(linkedList));
        System.out.println("ArrayDeque: -");
        System.out.println("TreeSet: -");


        System.out.println("Удаление в конце:");
        System.out.println("LinkedList: " + removeToEnd(linkedList));
        System.out.println("ArrayDeque: " + removeToEnd(arrayDeque));
        System.out.println("TreeSet: -");


        System.out.println("Получение по индексу:");
        System.out.println("LinkedList: " + getByIndex(linkedList));
        System.out.println("ArrayDeque: -");
        System.out.println("TreeSet: -");


    }

    private static long getByIndex(LinkedList<Integer> linkedList) {
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


    private static long removeToFirst(LinkedList<Integer> linkedList) {
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.remove(0);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long removeToMiddle(LinkedList<Integer> linkedList) {
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000 - 2; i++) {
            linkedList.remove((int) (linkedList.size() / 2));
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


    private static long removeToEnd(ArrayDeque<Integer> arrayDeque) {
        for (int i = 0; i < 100000; i++) {
            arrayDeque.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayDeque.pop();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long removeToEnd(LinkedList<Integer> linkedList) {
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.remove(linkedList.size() - 1);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long removeToFirst(ArrayDeque<Integer> arrayDeque) {
        for (int i = 0; i < 100000; i++) {
            arrayDeque.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayDeque.remove();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long removeToFirst(TreeSet<Integer> treeSet) {
        for (int i = 0; i < 100000; i++) {
            treeSet.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            treeSet.removeFirst();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


    private static long AddToFirst(LinkedList<Integer> linkedList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(0, i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    private static long AddToFirst(TreeSet<Integer> treeSet) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            treeSet.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    private static long AddToFirst(ArrayDeque<Integer> arrayDeque) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayDeque.addFirst(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long AddToEnd(ArrayDeque<Integer> arrayDeque) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayDeque.addLast(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long AddToEnd(LinkedList<Integer> linkedList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long AddToEnd(TreeSet< Integer> treeSet) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            treeSet.addLast(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


    private static long AddToMiddle(LinkedList<Integer> linkedList) {
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


}

