package ru.gb.HomeWork2;

import java.util.ArrayList;
import java.util.*;

class Worker implements Comparable<Worker> {
    private String name;
    private int age;
    private double salary;
    private String department;

    public Worker(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public int compareTo(Worker other) {
        return Integer.compare(age, other.age);
    }

    public static class SalaryComparator implements Comparator<Worker> {
        @Override
        public int compare(Worker emp1, Worker emp2) {
            return Double.compare(emp2.salary, emp1.salary);
        }
    }

    public static class DepartmentComparator implements Comparator<Worker> {
        @Override
        public int compare(Worker emp1, Worker emp2) {
            return emp1.department.compareTo(emp2.department);
        }
    }
}
