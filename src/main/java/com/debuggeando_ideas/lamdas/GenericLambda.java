package com.debuggeando_ideas.lamdas;

import com.debuggeando_ideas.fundamentals.Employee;
import com.debuggeando_ideas.fundamentals.Product;

public class GenericLambda {

    public static void main(String[] args) {
        Printer<Employee> printerEmployee = e -> System.out.println(e.toString());
        Printer<Product> printerProduct= p -> System.out.println(p.getPrice());

        printerEmployee.print(new Employee());

    }
}
