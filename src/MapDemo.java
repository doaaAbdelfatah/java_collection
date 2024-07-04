import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {

        HashMap<String, Employee>  employees = new HashMap<>();
        employees.put("A001"  ,new Employee("Doaa" , 50000, "Instructor"));
        employees.put("E001"  ,new Employee("Doaa" , 7000 , "Sales"));
        employees.put("A002"  ,new Employee("Dalia" , 5000, "Customer Services"));
        employees.put("A003"  ,new Employee("Ahmed" , 10000, "Sales"));

        System.out.println(employees.size());
        employees.remove("A002");
        System.out.println(employees.size());
        Employee e = employees.get("E001");
        System.out.println(e);
        System.out.println("--------------------------");
        Set<String> keys = employees.keySet();
//        System.out.println(keys);
        for (String k : keys){
            System.out.print(k   + " : "); // A001
            System.out.println(employees.get(k)); // Employee("Doaa" , 50000, "Instructor")
        }



    }
}

class  Employee {
    private  String name;
    private  double salary;

    private  String job;

     Employee(String name, double salary, String job) {
        this.name = name;
        this.salary = salary;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", job='" + job + '\'' +
                '}';
    }
}
