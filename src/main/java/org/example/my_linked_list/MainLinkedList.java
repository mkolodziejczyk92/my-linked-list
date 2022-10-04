package org.example.my_linked_list;

public class MainLinkedList {
    public static void main(String[] args) {

        MyLinkedList<String> myLinkedList = new MyLinkedList();

        myLinkedList.add("Marcin");
        myLinkedList.add("Zbigniew");
        myLinkedList.add("Ryszard");
        myLinkedList.add("Henryk");
        myLinkedList.add("Janusz");

        System.out.println("--- USING THE METHOD 'SIZE' ---");
        System.out.println(myLinkedList.size());
        System.out.println("");
        System.out.println("--- USING THE METHOD 'PRINT LIST' ---");
        myLinkedList.printList();
        System.out.println("");
        System.out.println("--- USING THE METHOD 'PUT AT' ---");
        myLinkedList.putAt("Ryszard", "Kamil");
        System.out.println("--- USING THE METHOD 'PRINT LIST' AFTER 'PUT AT' ---");
        myLinkedList.printList();
        System.out.println("");
        System.out.println("--- USING THE METHOD 'ADD' ---");
        myLinkedList.add("Damian");
        System.out.println("--- USING THE METHOD 'PRINT LIST' AFTER 'ADD' ---");
        myLinkedList.printList();
        System.out.println("--- USING THE METHOD 'SIZE' AFTER 'ADD' ---");
        System.out.println(myLinkedList.size());
        System.out.println("");
        System.out.println("--- USING THE METHOD 'REMOVE FIRST ---");
        myLinkedList.remove("Kamil");
        System.out.println("--- USING THE METHOD 'PRINT LIST' AFTER 'REMOVE FIRST' ---");
        myLinkedList.printList();
        System.out.println("--- USING THE METHOD 'SIZE' AFTER 'REMOVE FIRST' ---");
        System.out.println(myLinkedList.size());
        System.out.println("");
        myLinkedList.clear();
        System.out.println("--- USING THE METHOD 'PRINT LIST' AFTER 'CLEAR' ---");
        System.out.println("--- USING THE METHOD 'SIZE'  AFTER 'CLEAR' ---");
        System.out.println(myLinkedList.size());

    }
}
