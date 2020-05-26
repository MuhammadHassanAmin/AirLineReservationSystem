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
public class Passenger{
    public String firstname;
    public String lastname;
    public String cnic;
    public int age;
    public String ticketnumber;
    public String flightClass;
    public int ticketprice;

    public int getTicketprice() {
        return ticketprice;
    }

    public void setTicketprice(int ticketprice) {
        this.ticketprice = ticketprice;
    }

    public Passenger() {
        this.firstname = "";
        this.lastname = "";
        this.cnic = "";
        this.ticketnumber = "";
        this.age = 0;
        flightClass="";
        ticketprice=0;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
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

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getTicketnumber() {
        return ticketnumber;
    }

    public void setTicketnumber(String ticketnumber) {
        this.ticketnumber = ticketnumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void display(){
        System.out.println("Name: "+this.getFirstname()+" "+this.getLastname()+"\nAge: "+this.getAge()+
                "\nCNIC: "+this.getCnic()+"\nTicket Number: "+this.getTicketnumber());
    }

    
    
    public static void main(String[] args){
       
         
      
 
           
    }
    
}
