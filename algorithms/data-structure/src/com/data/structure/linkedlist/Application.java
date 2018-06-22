package com.data.structure.linkedlist;

public class Application {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        System.out.println(linkedList);

        linkedList.addAtBeginning("Brian");
        System.out.println(linkedList);
        linkedList.addAtBeginning("David");
        System.out.println(linkedList);
        linkedList.addAtBeginning("Smith");
        System.out.println(linkedList);
        linkedList.addAtBeginning("Miller");
        System.out.println(linkedList);

        linkedList.add("Adam");
        System.out.println(linkedList);

        linkedList.addInPosition(1,"Tom");
        System.out.println(linkedList);

        System.out.println(linkedList.size());

        System.out.println(linkedList.get(0));

        linkedList.removeAtBeginning();
        System.out.println(linkedList);

        System.out.println(linkedList.size());

        System.out.println(linkedList.get(3));

        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.remove();
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);


        linkedList.remove(0);
        System.out.println(linkedList);

        System.out.println(linkedList.contain("Tom"));

    }
}
