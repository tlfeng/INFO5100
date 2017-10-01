
import Business.Airliner;
import Business.Flight;
import Business.FlightSchedule;
import Business.MasterFlightSchedule;
import Business.Seat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ftl
 */
public class Revenue {
    public int revenuePerFlight(Flight flight) {
        int revenue = 0;
        for (Seat seat : flight.getSeat()) {
            revenue+=seat.getPrice();
        }
        return revenue;
    }
    
    public int revenuePerAirliner(Airliner airliner) {
        int revenue = 0;
        for (Flight flight : airliner.getFSCatalog().getFlightSchedule()) {
            revenue += revenuePerFlight(flight);
        }
        return revenue;
    }
    
    public int revenueTotal(MasterFlightSchedule mFS) {
        int revenue = 0;
        for (FlightSchedule fS : mFS.getmFS()) {
            for (Flight flight : fS.getFlightSchedule()) {
                revenue += revenuePerFlight(flight);
        }
        }
        return revenue;
    }
}