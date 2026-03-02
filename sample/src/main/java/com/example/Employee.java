package com.example;

abstract class Employee {
    protected String id;
    protected String name;

    public Employee(String id, String name) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("id không được null hoặc rỗng");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name không được null hoặc rỗng");
        }

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
