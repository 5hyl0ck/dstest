package com.dstest;
import java.util.*;

/*this is simply an implementation of the logic of the linkedlist data structure*/
public class EmployeeLInkedList {
    private node head;
    private int size = 0;


    public void addToFront(Employee employee){
        node node = new node(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public node removeFromFront(){
        if(isEmpty()) {
            return null;
        }else{
            node removed = head;
            head = removed.getNext();
            head.setNext(head.getNext());
            size--;
            return removed;
        }
    }

    public void printList(){
        node current = head;
        System.out.print("HEAD ->");
        while(current != null){
            System.out.print(current);
            System.out.print("->");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        if(this.head == null){
            return true;
        } else return false;
    }
}
