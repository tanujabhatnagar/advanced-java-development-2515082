package _03_02.before;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> list=new LinkedList<>();
        list.add("first");
        list.add("second");

        System.out.println(list);

        System.out.println(list.getFirst());

        System.out.println(list.getLast());

        System.out.println(list.poll());

        System.out.println(list);

        System.out.println(list.pop());

        System.out.println(list);

        System.out.println(list.poll());

        System.out.println(list.pop());




    }






}
