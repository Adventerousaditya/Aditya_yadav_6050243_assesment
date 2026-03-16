package cg.SpringAssignment.beans;

public class Employee {

    private int empId;
    private String empName;
    private double salary;
    private String department;
    private int age;

    private SBU businessUnit;   // SBU dependency

    public Employee() {
    }

    // Getters and Setters

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SBU getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(SBU businessUnit) {
        this.businessUnit = businessUnit;
    }

    // Display employee details
    public void display() {
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Age: " + age);
    }

    // Method asked in question
    public void getSBUDetails() {
        System.out.println(businessUnit);
    }
}