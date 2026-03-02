package com.example;

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int workingHours;

    public PartTimeEmployee(String id, String name, double hourlyRate, int workingHours) {
        super(id, name);
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("hourlyRate không được âm");
        }

        if (workingHours < 0) {
            throw new IllegalArgumentException("workingHours không được âm");
        }

        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * workingHours;
    }
}
