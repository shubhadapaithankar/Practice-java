package com.company.compositepattern;

public interface EmployeeComponent {
//operations
    public  int getId();
    public String getName();
    public double getSalary();
    public void print();

//mandatory methods
    public void add(EmployeeComponent employee);
    public void remove(EmployeeComponent employee);
    public EmployeeComponent getChild(int i);

}
