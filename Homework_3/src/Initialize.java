
import Business.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tianli Feng
 */
public class Initialize {
    public ArrayList<Airliner> airlinerList;
    public FlightSchedule fS;
    public Fleet fleet;
    public SeatCatalog seatList;
    public CustomerDirectory cD;
    public MasterTravelSchedule mTS;
    
    public Initialize() {
        mTS = new MasterTravelSchedule();
        ReadAirlinerList();
        ReadAirlinerData();
        ReadPersonData();
    }
    
    public void ReadAirlinerList() {
        // Read the list of airliners
        String csvFile = "airliner.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        airlinerList = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] airlinerElement = line.split(cvsSplitBy);
                
                Airliner airliner = new Airliner();
                airlinerList.add(airliner);
                String airlinerName = airlinerElement[0];
                airliner.setAirlinerName(airlinerName);
            }
            
            //for (Airplane a : airplaneList.getAirplaneList()) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
 
    public void ReadAirlinerData() {
        // Read airliner data file
    for (int i=1; i<=airlinerList.size(); i++) {
            StringBuffer sb = new StringBuffer();
            sb.append("airliner");
            sb.append(i);
            sb.append(".txt");
            String csvFile = sb.toString();

        BufferedReader br = null;
        String line = "";
        String airlinerName = "";
        String cvsSplitBy = ",";
        
        fS = new FlightSchedule();
        fleet = new Fleet();
        fS = mTS.addFlightSchedule();
        
        try {
            br = new BufferedReader(new FileReader(csvFile));
            airlinerName = br.readLine();
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] flightElement = line.split(cvsSplitBy); 

                Flight flight = fS.addFlight();
                flight.setFlightNum(flightElement[0]);
                flight.setDepartTime(flightElement[1]);
                flight.setDepartAirport(flightElement[2]);
                flight.setArrivalAirport(flightElement[3]);

                Airplane airplane = fleet.addAirplane();
                airplane.setSerialNum(flightElement[4]);
                airplane.setModelNum(flightElement[5]);
                airplane.setMenufacture(flightElement[6]);
                airplane.setSeatCapacity(Integer.parseInt(flightElement[7]));
                
                // Assign airplane to the flight
                flight.setAirplane(airplane);
                // Create seat catalog to the flight
                seatList = new SeatCatalog();
                seatList.setFlight(flight);
                flight.setSeat(seatList.getSeatCatalog());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        // Assign flight to airliner
        for (Airliner airliner: airlinerList) {
            if (airliner.getAirlinerName().equals(airlinerName)) {
                airliner.setFSCatalog(fS);
                airliner.setFleetCatalog(fleet);
            }
        }
    }
    }
    
    public void ReadPersonData() {
        // Read Personvdata file
        String csvFile = "person.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        cD = new CustomerDirectory();
                
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] PersonElement = line.split(cvsSplitBy); 

                Person person = cD.addPerson();
                person.setFirstName(PersonElement[0]);
                person.setLastName(PersonElement[1]);
                person.setGender(PersonElement[2]);
                person.setSsn(PersonElement[3]);
                
                Seat seat = new Seat();
                // set between flight and seat
                for (FlightSchedule fS : mTS.getmTS()) {
                    for (Flight flight : fS.getFlightSchedule()) {
                        if (flight.getFlightNum().equals(PersonElement[4])) {
                             seat.setFlight(flight);
                             flight.getSeat().add(seat);
                        }
                    }
                }
                
                seat.setColGroup(Integer.parseInt(PersonElement[5]));
                seat.setColPosition(PersonElement[6]);
                seat.setRow(Integer.parseInt(PersonElement[7]));
                seat.setPrice(Integer.parseInt(PersonElement[8]));
                
                // Assign person with seat
                person.setSeat(seat);
                seat.setPerson(person);       
    }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }         
    
}
