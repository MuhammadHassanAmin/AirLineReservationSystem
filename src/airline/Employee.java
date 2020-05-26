/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

/**
 *
 * @author dominator
 */
public abstract class Employee{
    public String firstname;
    public String lastname;
    public int age;
    public int employeeID;
    public double salary;
    public double hoursWorked;
    
    public Employee(){
        this.firstname = "";
        this.lastname = "";
        this.age = 0;
        this.employeeID = 0;
    }

    public Employee(String firstname, String lastname, int age, int employeeID, double salary, double hoursWorked) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.employeeID = employeeID;
        this.salary = salary;
        this.hoursWorked = hoursWorked;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    
    
}