package com.company.compositepattern;

public class Client {

    public static void main(String args[]){
        EmployeeComponent e1= new Accountant(22,"Vinit",2222222.3);
        EmployeeComponent e2 =  new Accountant(23,"Shubhada",55555.3);
        EmployeeComponent m1 = new BankManager(24,"Om",5555.3);
        EmployeeComponent e4= new Cashier(55,"Chaptu",55555.6);



        m1.add(e1);
        m1.add(e2);
        m1.add(e4);
        m1.print();
    }
}
