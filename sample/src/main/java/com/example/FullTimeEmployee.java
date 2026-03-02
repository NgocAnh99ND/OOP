package com.example;

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String id, String name, double monthlySalary) {
        super(id, name);

        if (monthlySalary < 0) {
            throw new IllegalArgumentException("monthlySalary không được âm");
        }

        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
