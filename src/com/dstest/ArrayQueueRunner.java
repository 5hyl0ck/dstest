package com.dstest;

public class ArrayQueueRunner {
    public static void main(String[] args) {
        ArrayQueue employeeQueue = new ArrayQueue(5);
        Employee janejones = new Employee("Jane", "jones", 1);
        Employee emmanueloni = new Employee("emmanuel", "oni", 2);
        Employee franktonga = new Employee("frank", "Tonga", 3);
        Employee willsmith = new Employee("will", "smith", 4);
        Employee billEnd = new Employee("bill","frankel",45);

        employeeQueue.print();
        System.out.println(employeeQueue.peek());

    }
}
