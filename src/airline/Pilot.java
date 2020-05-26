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
public class Pilot extends Employee implements EmployeeInterface{
    String currentAssignedFlight;
    String rank;
    
    public Pilot(){
        super.firstname="";
        super.lastname=""; 
        super.age=0; 
        super.employeeID=0;
        this.currentAssignedFlight="";
        this.rank="";
    }

    public Pilot(String firstname, String lastname,int age, int employeeID, double salary, double hoursWorked) {
        super(firstname, lastname, age, employeeID, salary, hoursWorked);
        
        super.firstname = firstname;
        super.lastname = lastname;
        super.age = age;
        super.employeeID = employeeID;
        super.salary = salary;
        super.hoursWorked = hoursWorked;
    }

    @Override
    public double calcuatesalary(double hoursWorked, double salary) {
         return hoursWorked*salary;
    }

    public String getCurrentAssignedFlight() {
        return currentAssignedFlight;
    }

    public void setCurrentAssignedFlight(String currentAssignedFlight) {
        this.currentAssignedFlight = currentAssignedFlight;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    
}
