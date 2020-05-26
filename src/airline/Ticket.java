/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

/**
 *
 * @author Hasan
 */
public class Ticket {
    public String flightClass;

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }
    
    
    
    public String getPassengerFirstName(Passenger obj)
    {
        return obj.getFirstname();
    }
     public String getPassengerLastName(Passenger obj)
    {
        return obj.getLastname();
    }
      public String getPassengerCnic(Passenger obj)
    {
        return obj.getCnic();
    }
       public String getPassengerAge(Passenger obj)
    {
        return  String.valueOf(obj.getAge());
    }
       
       
    
}
