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
public class AirHostess extends Employee implements EmployeeInterface{
    
    public AirHostess(){
        super.firstname="";
        super.lastname=""; 
        super.age=0; 
        super.employeeID=0;
    }

    public AirHostess(String firstname, String lastname,int age, int employeeID, double salary, double hoursWorked) {
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

   
    
}
