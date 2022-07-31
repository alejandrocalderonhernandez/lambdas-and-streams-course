package com.debuggeando_ideas.fundamentals;

import java.util.List;
import java.util.UUID;

public class EmployeeDB implements  DatabaseService<Employee>
{
    @Override
    public Employee getById(Long id) {
        Employee e = new Employee();
        e.setDni(UUID.randomUUID().toString());
        e.setName("Pedro");
        e.setSalary(10000.0);
        return e;
    }

    @Override
    public List<Employee> getAllRecords() {
        return null;
    }
}
