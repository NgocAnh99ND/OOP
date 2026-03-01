package com.example;

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
}
