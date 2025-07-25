package io;

import java.io.IOException;

import io.Smartphone;
import io.Employee;
import io.Customer;



public class Practice{
    public static void main(String[] args) throws IOException{

    
    Smartphone sm1 =new Smartphone("iphone 12",60000,"blue");
    Smartphone sm2 =new Smartphone("iphone13",75000,"red");
    Smartphone sm3 =new Smartphone("galaxcy flip 3",85000,"black");
    Smartphone sm4 =new Smartphone("galaxcy fold13",150000,"white");
    
    Employee e1 =new Employee("john",1);
    Employee e2 =new Employee("nash",2);
    Employee e3 =new Employee("trevor",3);


    Customer cm1 = new Customer("A",80000);
    Customer cm2 = new Customer("B",90000);
    Customer cm3 = new Customer("C",40000);
    
   // cm1.buy(sm1);
   // e1.sellphone(cm1,sm1);
   

   cm2.buy(sm4);
   e3.sellphone(cm2,sm4);



   cm3.buy(sm2);
   e2.sellphone(cm3,sm2);

}
}
