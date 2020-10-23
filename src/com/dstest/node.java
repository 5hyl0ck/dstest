package com.dstest;
import java.util.*;

public class node {
    private Employee employee;
    private node next;

    public node(Employee employee){
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

    public String toString(){
        return employee.toString();
    }

}
