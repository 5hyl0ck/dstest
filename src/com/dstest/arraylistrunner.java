package com.dstest;
import java.util.ArrayList;
import java.util.List;

/*this implementation utilizes the array based list within java */
public class arraylistrunner {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "jones", 1));
        employeeList.add(new Employee("emmanuel", "oni", 2));
        employeeList.add(new Employee("frank", "Tonga", 3));
        employeeList.add(new Employee("will", "smith", 4));
        employeeList.set(1, new Employee("John", "Adams", 4568));
//        employeeList.forEach(employee -> System.out.println(employee));

        Object[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Object employee: employeeArray){
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("will","smith",4)));
        System.out.println(employeeList.indexOf(new Employee("will","smith",4)));

    }
}
