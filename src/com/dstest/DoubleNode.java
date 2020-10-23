package com.dstest;

/*this is the node that is used by the doubly linked list. I could have written this as
* an overloaded method within the node class but this is way easier :)
* */
public class DoubleNode {
    private Employee employee;
    private DoubleNode next;
    private DoubleNode previous;

    public DoubleNode(Employee employee){
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public String toString(){
        return employee.toString();
    }

    public DoubleNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleNode previous) {
        this.previous = previous;
    }
}

