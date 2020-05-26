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
public class Airline extends Passenger{
    String departureCity;
    String arrivalCity;
    String departureTime;
    String arrivalTime;
    int availableseats;
    int economySeatPrice;
    int BusinessSeatPrice;
    String status;
    String seats[];
    
    Airline(){
        this.departureCity = "";
        this.arrivalCity = "";
        this.departureTime = "";
        this.arrivalTime = "";
        this.availableseats = 0;
        this.status="";
       

    }

    public Airline(String departureCity, String arrivalCity, String departureTime, String arrivalTime, int availableseats,String status ,int economySeatPrice,int BusinessSeatPrice) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.availableseats = availableseats;
        this.status=status;
       this.seats=new String[]{"Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available","Available"};
       this.BusinessSeatPrice = BusinessSeatPrice;
       this.economySeatPrice = economySeatPrice;
        this.status=status;
    }

    public int getEconomySeatPrice() {
        return economySeatPrice;
    }

    public void setEconomySeatPrice(int economySeatPrice) {
        this.economySeatPrice = economySeatPrice;
    }

    public int getBusinessSeatPrice() {
        return BusinessSeatPrice;
    }

    public void setBusinessSeatPrice(int BusinessSeatPrice) {
        this.BusinessSeatPrice = BusinessSeatPrice;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getAvailableseats() {
        return availableseats;
    }

    public void setAvailableseats(int availableseats) {
        this.availableseats = availableseats;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSeats() {
        return seats;
    }

    public void setSeats(String[] seats) {
        this.seats = seats;
    }
    
    
    
    public void display(){
        System.out.println("Departure City: "+departureCity+"\nArrival City: "+arrivalCity+"\nDeparture Time: "+departureTime+
                "\nArrival Time: "+arrivalTime+"\nAvailable Seats: "+availableseats);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        view home = new view();
        home.setVisible(true);

        
    }
    
}
