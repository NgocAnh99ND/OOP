package com.example;

abstract class Employee {
    protected String id;
    protected String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // KHÔNG được implement
    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int workingHours;

    public PartTimeEmployee(String id, String name, double hourlyRate, int workingHours) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * workingHours;
    }

    public class Main {
        public static void main(String[] args) {
            Employee e1 = new FullTimeEmployee("FT01", "Nguyen Van A", 15000000);
            Employee e2 = new PartTimeEmployee("PT01", "Tran Thi B", 50000, 80);

            System.out.println(e1.calculateSalary());
            System.out.println(e2.calculateSalary());
        }
    }
}
