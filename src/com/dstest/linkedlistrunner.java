package com.dstest;
import java.util.*;
public class linkedlistrunner {
    public static void main(String[] args) {
        /*this is a simple class to run the builtin linkedlist class within java and test some of the functions*/
        Employee janejones = new Employee("Jane", "jones", 1);
        Employee emmanueloni = new Employee("emmanuel", "oni", 2);
        Employee franktonga = new Employee("frank", "Tonga", 3);
        Employee willsmith = new Employee("will", "smith", 4);
        Employee billEnd = new Employee("bill","frankel",45);

        LinkedList<Employee> list = new LinkedList<>();

        list.addFirst(janejones);
        list.addFirst(emmanueloni);
        list.addFirst(franktonga);
        list.addFirst(willsmith);

        Iterator iter = list.iterator();
        iterate(iter);
        list.add(billEnd); // add() or addLast() will work here because they basically do the same thing
        iter = list.iterator();
        iterate(iter);
        list.remove();
        iter = list.iterator();
        iterate(iter);

    }

    public static void iterate(Iterator iter){
        System.out.print("HEAD -> ");
        while (iter.hasNext()){
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");
    }
}