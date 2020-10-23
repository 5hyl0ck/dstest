package com.dstest;

public class EmployeeDoublyLinkedList {
    private DoubleNode head;
    private DoubleNode tail;
    private int size = 0;

    public void addToFront(Employee employee){
        DoubleNode node = new DoubleNode(employee);
        node.setNext(head);

        if(isEmpty()){
            tail = node;
        }
        else{
            head.setPrevious(node);
        }
        head = node;
        size++;
    }

    public DoubleNode removeFromFront(){
        if(isEmpty()) {
            return null;
        }else{
            if(head.getNext() == null){
                tail = null;
            }
            DoubleNode removed = head;
            head = removed.getNext();
            head.setNext(head.getNext());
            head.setPrevious(null);


            size--;
            return removed;
        }
    }

    public void addToEnd(Employee employee){
        DoubleNode node = new DoubleNode(employee);
        if (tail == null){
            head = node;
        }
        else{
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public void printList(){
        DoubleNode current = head;
        System.out.print("HEAD ->");
        while(current != null){
            System.out.print(current);
            System.out.print("<->");
            current = current.getNext();
        }
        System.out.println(" <- TAIL <=> null");
    }


    public DoubleNode removeFromEnd(){
        if(isEmpty()){
            return null;
        }
        DoubleNode removed;
        tail.getPrevious().setNext(null);
        removed = tail;
        tail = tail.getPrevious();
        size--;
        removed.setPrevious(null);
        return removed;
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

