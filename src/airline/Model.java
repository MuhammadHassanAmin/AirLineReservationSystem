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
import static airline.view.flightNum;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
public class Model extends Passenger{
    String tempticketnumber; int tempseatnumber; String tempfirstname; String templastname;String tempcnic; int tempage;
    int temp1;
    int temp2;
    int temp3;
    String temp4;
    int temp5;
    String DATE;
    String arrival,departure,ticketNum;
    
    public int searchByFlightNumber(String flight){    
        flight=flight.toLowerCase();
        
        if(flight.equals("flight00") || flight.equals("flight0")|| flight.equals("0")|| flight.equals("00"))
        return 1;
        else if(flight.equals("flight01") || flight.equals("flight1") || flight.equals("1")|| flight.equals("01"))
        return 2;
        else if(flight.equals("flight02")|| flight.equals("flight2")|| flight.equals("2")|| flight.equals("02"))
        return 3;
        else if(flight.equals("flight03")|| flight.equals("flight3")|| flight.equals("3")|| flight.equals("03"))
        return 4;
        else if(flight.equals("flight04")|| flight.equals("flight4")|| flight.equals("4")|| flight.equals("04"))
        return 5;
        else if(flight.equals("flight05")|| flight.equals("flight5")|| flight.equals("5")|| flight.equals("05"))
        return 6;
        else{
            return 0;
        }
    }
    public int checkAvailableFlights(int month,int date,int year, String arrival, String departure){
        DATE = "01/01/2018";
        
        if((month>0) && (month<13) && (date>0) && (date<32) && (year>2016)){
                
            if(year>2017){
                            temp4=DATE.substring(6, 10);
                            temp5=Integer.parseInt(temp4);
                            
                            if(year==temp5){
                                temp4=DATE.substring(0, 2);
                                temp5=Integer.parseInt(temp4);
                                if(month==temp5){
                                    temp4=DATE.substring(3, 5);
                                    temp5=Integer.parseInt(temp4);
                                    if(date>=temp5){
                                        //DATE VERIFIED
                                        if(arrival.equals(departure)){
                                            return 0;
                                        }
                                        else{
                                            return 1;
                                        }
                                    }
                                    else
                                    return 0;
                                }
                                else
                                return 0;
                            }
                            else
                                return 0;
        }
            else{
                DATE = "12/13/2017";
                temp4=DATE.substring(6, 10);
                temp5=Integer.parseInt(temp4);


                            if(year>=temp5){
                                temp4=DATE.substring(0, 2);
                                temp5=Integer.parseInt(temp4);
                                if(month>=temp5){
                                    temp4=DATE.substring(3, 5);
                                    temp5=Integer.parseInt(temp4);
                                    if(date>=temp5){
                                        //DATE VERIFIED
                                        if(arrival.equals(departure)){
                                            return 0;
                                        }
                                        else{
                                            return 1;
                                        }
                                    }
                                    else
                                    return 0;
                                }
                                else
                                return 0;
                            }
                            else
                                return 0;
            }    
            
        }
        else{
            return 0;
        }
    }
    
    public int checkAvailableSeats(Airline obj){
        int num_of_available_seats=40;
        for (int i = 0; i < 40; i++) {
            if(obj.seats[i] == "Booked")
            {
                num_of_available_seats--;
            }
            
        }
        obj.availableseats=num_of_available_seats;
        return num_of_available_seats;
        
    }
    public int checkAvailableSeats(Airline obj, int seatnumber){
        
        if(seatnumber>40 || seatnumber < 1){
            return 420;
        }
        else if(obj.seats[seatnumber-1].equals("Available"))
        {
            return 1;
        }else{
                    return 0;

        }
        
       
    }
    
    public String validateTicket(String TicketNumber){
        String wrongInput= "Wrong Ticket Number Entered";
        int seatNum=0;
        int flightNum=0;
        int ticketlength=TicketNumber.length();
        ticketlength=ticketlength;
   
        if(ticketlength<3){
            return wrongInput;
        }
        else if(ticketlength==4){
            flightNum = Integer.parseInt(TicketNumber.substring(0, 2));
            seatNum =  Integer.parseInt(TicketNumber.substring(2, 4));
            seatNum= seatNum-1;
            
            if(flightNum<0 || flightNum>5)
        {
               return wrongInput;
        }else if(seatNum<0 || seatNum>39)
        {
                return wrongInput;
        } 
        }
        else{
            flightNum = Integer.parseInt(TicketNumber.substring(0, 2));
            seatNum =  Integer.parseInt(TicketNumber.substring(2, 3));
            seatNum= seatNum-1;//Original Index
            
            if(flightNum<0 || flightNum>5)
        {
               return wrongInput;
        }else if(seatNum<0 || seatNum>39)
        {
                return wrongInput;
        } 
        }
    
    
    //Exception Handling
          
                return "correct";
    }
    
    public void storeUserDatainTemp(String ticketnumber, int seatnumber, String firstname,String lastname,String cnic, int age,int passengernumber){

            tempfirstname = firstname;
            templastname = lastname;
            tempcnic = cnic;
            tempage = age;
            tempticketnumber=ticketnumber;
      

    }
    public void sendCitesToUserData(String arrivalCity,String departureCity){
                 arrival = arrivalCity;
                 departure = departureCity;
                 switch (arrivalCity)
                 {
                     case "Islamabad":{
                     if(departure == "Karachi"){
                         
                     }
                     }
                        
                     
                 }
                 ticketNum=arrival+departure;
    }
    public String getFlightDetails(Airline flight00, Airline flight01,Airline flight02,Airline flight03,Airline flight04,Airline flight05){
         checkAvailableSeats(flight00);
        checkAvailableSeats(flight01);
        checkAvailableSeats(flight02);
        checkAvailableSeats(flight03);
        checkAvailableSeats(flight04);
        checkAvailableSeats(flight05);
        
        String FlightDetails = "Flight Number  |" + "  Departure City  |" + "  Arrival City  |" + "  Departure Time  |" + "  Arrival Time  |" + "  Available Seats |" + " Status"
                + "\n Flight00          |  " + flight00.departureCity + "              |  " + flight00.arrivalCity + "    |  " + flight00.departureTime + "                  |  " + flight00.arrivalTime + "            |           " + flight00.availableseats + "             | " + flight00.status
                + "\n Flight01          |  " + flight01.departureCity + "              |  " + flight01.arrivalCity + "        |  " + flight01.departureTime + "                  |  " + flight01.arrivalTime + "            |           " + flight01.availableseats + "             | " + flight01.status
                + "\n Flight02          |  " + flight02.departureCity + "         |  " + flight02.arrivalCity + "         |  " + flight02.departureTime + "                  |  " + flight02.arrivalTime + "            |           " + flight02.availableseats + "             | " + flight02.status
                + "\n Flight03          |  " + flight03.departureCity + "         |  " + flight03.arrivalCity + "        |  " + flight03.departureTime + "                  |  " + flight03.arrivalTime + "            |           " + flight03.availableseats + "             | " + flight03.status
                + "\n Flight04          |  " + flight04.departureCity + "             |  " + flight04.arrivalCity + "    |  " + flight04.departureTime + "                  |  " + flight04.arrivalTime + "            |           " + flight04.availableseats + "             | " + flight04.status
                + "\n Flight05          |  " + flight05.departureCity + "             |  " + flight05.arrivalCity + "         |  " + flight05.departureTime + "                  |  " + flight05.arrivalTime + "            |           " + flight05.availableseats + "             | " + flight05.status;
        return FlightDetails;    
     }
    
    public String displayFlight(Airline flight) {
        String FlightDetails = "  Departure City  |" + "  Arrival City  |" + "  Departure Time  |" + "  Arrival Time  |" + "  Available Seats |" + " Status"
                + "\n  " + flight.departureCity + "              |  " + flight.arrivalCity + "    |  " + flight.departureTime + "                  |  " + flight.arrivalTime + "           |           " + flight.availableseats + "             | " + flight.status;
        return FlightDetails;
    }
    
    public void setPassengerData(Airline flight,Passenger passenger,String ticketnumber, int seatnumber, String firstname, String lastname, String cnic, int age, int passengernumber, String flightClass,int ticketprice)
    {
            passenger.setTicketnumber(ticketnumber);
            passenger.setFirstname(firstname);
            passenger.setLastname(lastname);
            passenger.setCnic(cnic);
            passenger.setAge(age);
            passenger.setFlightClass(flightClass);
            passenger.setTicketprice(ticketprice);
            flight.seats[passengernumber - 1] = "Booked";   
    }
    
     public String findFlightNumber(String arrivalCity, String departureCity) {

        if (arrivalCity.equals("Islamabad") && departureCity.equals("Lahore")) {
            flightNum = "02";
        }
        else if (arrivalCity.equals("Islamabad") && departureCity.equals("Karachi")) {
            flightNum = "03";
        }
        else if (arrivalCity.equals("Lahore") && departureCity.equals("Islamabad")) {
            flightNum = "00";
        }
        else if (arrivalCity.equals("Lahore") && departureCity.equals("Karachi")) {
            flightNum = "01";
        }
        else if (arrivalCity.equals("Karachi") && departureCity.equals("Islamabad")) {
            flightNum = "04";
        }
        else if(arrivalCity.equals("Karachi") && departureCity.equals("Lahore")) {
            flightNum = "05";
        }
        return flightNum;
        
    }
     
     public int selectFlight(String departureCity,String arrivalCity){
         if (arrivalCity.equals("Islamabad") && departureCity.equals("Lahore")) {
            return 0;
        }
         else if (arrivalCity.equals("Islamabad") && departureCity.equals("Karachi")) {
            return 1;
        }
        else if (arrivalCity.equals("Lahore") && departureCity.equals("Islamabad")) {
            return 2;
        }
        else if (arrivalCity.equals("Lahore") && departureCity.equals("Karachi")) {
            return 3;
        }
        else if (arrivalCity.equals("Karachi") && departureCity.equals("Islamabad")) {
            return 4;
        }
        else  {
            return 5;
        }
     }
    
    public static void main(String[] args){ 
      
    }
}
