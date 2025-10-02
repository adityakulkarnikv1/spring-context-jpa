package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class SomeClass {
    
    @Autowired
    private Employee emp;

    
    public void displayEmployee() {
        System.out.println(emp);
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public SomeClass(Employee emp) {
        this.emp = emp;
    }

    public SomeClass() {
    }
}
