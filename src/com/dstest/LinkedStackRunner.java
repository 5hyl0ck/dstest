package com.dstest;

public class LinkedStackRunner {
    public static void main(String[] args) {
        EmployeeLinkedStack employeeStack = new EmployeeLinkedStack();
        Employee janejones = new Employee("Jane", "jones", 1);
        Employee emmanueloni = new Employee("emmanuel", "oni", 2);
        Employee franktonga = new Employee("frank", "Tonga", 3);
        Employee willsmith = new Employee("will", "smith", 4);
        Employee billEnd = new Employee("bill","frankel",45);

        employeeStack.push(janejones);
        employeeStack.push(emmanueloni);
        employeeStack.push(franktonga);
        employeeStack.push(willsmith);
        employeeStack.push(billEnd);

        employeeStack.print();
        employeeStack.pop();
        System.out.println(" ");
        employeeStack.print();
        System.out.println(employeeStack.peek());
    }
}
