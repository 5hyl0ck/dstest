package com.dstest;

import java.util.EmptyStackException;

//array based implementation of the queue ADT
public class ArrayQueue {
    private int front;
    private int back;
    private Employee[] queue;

    public ArrayQueue(int size){
        queue = new Employee[size];
    }

    public void enqueue(Employee employee){
        if(isFull()){
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue,0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = employee;
        back++;
    }

    public Employee dequeue(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        Employee removed = queue[front];
        queue[front] = null;
        front++;
        if(isEmpty()){
            front = 0;
            back = 0;
        }
        return removed;

    }

    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return queue[front];
    }

    public boolean isEmpty(){
        return (back - front) == 0;
    }
    public boolean isFull(){
        return back == queue.length;
    }

    public void print(){
        for(Employee element:queue){
            System.out.println(element);
        }
    }
}
