package com.dstest;
import java.util.EmptyStackException;

public class EmployeeStack {
//implementation of the array based stack
    private Employee[] stack;
    private int top;
    public final int DEFAULT = 10;

    public EmployeeStack(int size) {
        stack = new Employee[size];
    }

    public EmployeeStack(){
        stack = new Employee[DEFAULT];
        // default size of the array for a constructor
    }

    public void push(Employee employee){
        if(this.top == stack.length){
            Employee[] newArray = new Employee[stack.length * 2];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[this.top++] = employee;
    }

    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Employee employee = stack[--this.top];
        stack[top] = null;
        return employee;
    }

    public boolean isEmpty(){
        return this.top == 0;
    }

    public Employee peek(){
       if(isEmpty()){
           throw new EmptyStackException();
       }

       Employee employee = stack[this.top - 1];
       return employee;
    }

    public int getSize(){
        return this.top;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Empty Stack. Try adding some employees");
        }
        for(Employee element : stack){
            System.out.println(element);
        }
    }
    
}
