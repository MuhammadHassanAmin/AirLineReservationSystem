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
public class BusinessClass  implements TicketPrice {

   @Override
    public int calculatePrice(Airline flight) {
            if(flight.getDepartureCity().equals("Lahore") && flight.getArrivalCity().equals("Islamabad"))
            {
                return flight.getBusinessSeatPrice();
            }else
            if(flight.getDepartureCity().equals("Lahore") && flight.getArrivalCity().equals("Karachi"))
            {
                return flight.getBusinessSeatPrice();
            }else
            if(flight.getDepartureCity().equals("Islamabad") && flight.getArrivalCity().equals("Lahore"))
            {
                return flight.getBusinessSeatPrice();
            }else
            if(flight.getDepartureCity().equals("Islamabad") && flight.getArrivalCity().equals("Karachi"))
            {
                return flight.getBusinessSeatPrice();
            }else
            if(flight.getDepartureCity().equals("Karachi") && flight.getArrivalCity().equals("Islamabad"))
            {
                return flight.getBusinessSeatPrice();
            }else
                if(flight.getDepartureCity().equals("Karachi") && flight.getArrivalCity().equals("Lahore"))
            {
                return flight.getBusinessSeatPrice();
            }else
                {
                return 0;
                }
    }
    
    
}
