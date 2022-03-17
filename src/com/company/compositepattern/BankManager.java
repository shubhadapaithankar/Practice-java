package com.company.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class BankManager implements EmployeeComponent {

    private int id;
    private String name;
    private double salary;

    public BankManager(int id,String name ,double salary){
        this.id=id;
        this.salary=salary;
        this.name= name;
    }

    List<EmployeeComponent> employees = new ArrayList<EmployeeComponent>();

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("------------------------");
        System.out.println("ID " +getId());
        System.out.println("Name" +getName());
        System.out.println("Salary" +getSalary());



        for(EmployeeComponent emp : employees) {
            emp.print();
        }
    }

    @Override
    public void add(EmployeeComponent employee) {
        employees.add(employee);

    }

    @Override
    public void remove(EmployeeComponent employee) {
        employees.remove(employee);

    }

    @Override
    public EmployeeComponent getChild(int i) {
        return employees.get(i);
    }
}
