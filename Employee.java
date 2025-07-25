package io;
public class Employee{
    String name;
    int id;
    public Employee(String name,int id){
        this.name = name;
        this.id = id;

    }
    public void sellphone(Customer cm,Smartphone sm){
        if(cm.cash>sm.price){
            System.out.println("sold the smartphone to the customer:" +cm);
        }    
        else{
        emi(sm);

    }

    }
 public void emi(Smartphone sm){
    double emi =(sm.price*1.0)/12.0;
    System.out.println("the 12 month  emi for buying the smartphone will be :"+emi);
 }
} 
