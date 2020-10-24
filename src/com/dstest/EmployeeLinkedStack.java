package com.dstest;
import java.util.*;

// a stack implementation that utilizes a linked list
// pretty easy because linked list already implements the deque interface
// which already specifies all our stack methods
// i just limited functionality within my implementation
public class EmployeeLinkedStack {
    private LinkedList <Employee> stack;

    public EmployeeLinkedStack() {
        stack = new LinkedList<>();
    }

    public Employee peek(){
        return stack.peek();
    }

    public void push(Employee employee){
        stack.push(employee);
    }

    public Employee pop(){
        return stack.pop();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void print(){
        ListIterator<Employee> iterator = stack.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
