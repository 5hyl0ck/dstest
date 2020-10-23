package com.dstest;

public class EmployeeDoublyLinkedListRunner {
    public static void main(String[] args) {
        Employee janejones = new Employee("Jane", "jones", 1);
        Employee emmanueloni = new Employee("emmanuel", "oni", 2);
        Employee franktonga = new Employee("frank", "Tonga", 3);
        Employee willsmith = new Employee("will", "smith", 4);
        Employee billEnd = new Employee("bill","frankel",45);
        Employee frederico = new Employee("fred","rico",10);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(janejones);
        list.addToFront(emmanueloni);
        list.addToFront(franktonga);
        list.addToFront(willsmith);
        list.addToFront(billEnd);
        list.addToEnd(frederico);
        list.printList();

        System.out.println("size = " + list.getSize() );
        System.out.println("isEmpty = " + list.isEmpty() );
        list.removeFromFront();

        list.printList();
        System.out.println("size = " + list.getSize() );
        list.removeFromFront();
        list.printList();
        System.out.println("size = " + list.getSize() );
    }
}
