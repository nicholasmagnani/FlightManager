// Nicholas Magnani and Adam Uzana - We are experts in Java and the computer science space in general. This Tomas guy however is an absolute first timer and just today learned how to write a print statement. Usually we just use him to bring us water because he has no real programming experience but I have to say he is great a getting the perfect water to glass ratio. Great addition to the team. Can't wait for more bevs!!!
import java.util.*;
import java.math.*;
import java.util.ArrayList;

class Main {
  
  public static void main(String[] args) 
  {
   
    //airplanes
    Airplane plane1 = new Airplane("Boeing", 747, 0, true);
    Airplane plane2 = new Airplane("Boeing", 777, 1, true);
    Airplane plane3 = new Airplane("Airbus", 310, 2, true);
    Airplane plane4 = new Airplane("Airbus", 330, 3, true);
    Airplane plane5 = new Airplane("Fokker", 50, 4, true);
    Airplane plane6 = new Airplane("Boeing", 747, 5, true);
    Airplane plane7 = new Airplane("Boeing", 777, 6, true);
    Airplane plane8 = new Airplane("Airbus", 310, 7, true);
    Airplane plane9 = new Airplane("Airbus", 350, 8, true);
    Airplane plane10 = new Airplane("Fokker", 50, 9, true);

    ArrayList <Airplane> Airplanes = new ArrayList <Airplane>();

    //airports
    Airport Dulles = new Airport("Dulles International", "Washington, DC", 0000, true);
    Airport BWI = new Airport("BWI", "Baltimore, MD", 0001, true);
    Airport GRU = new Airport("Guarulhos", "Guarulhos, Sao Paulo", 0002, true);
    Airport Denver = new Airport("Denver Airport", "Denver", 0003, true);
    Airport LS = new Airport("LSA", "Los Santos Airport", 0004, true);

    ArrayList <Airport> Airports = new ArrayList <Airport>();

    //flights
    Flight DC_GRU = new Flight("United", plane1, Dulles, GRU, 1500, 0000, true);
    Flight BWI_LS = new Flight("Southwest", plane5, Dulles, LS, 2200, 0001, true);
    Flight LS_DEN = new Flight("American Airlines", plane3, LS, Denver, 2200, 0002, true);
    Flight GRU_DEN = new Flight("Southwest", plane3, GRU, Denver, 1800, 0003, true);
    
    Flight DC_LS = new Flight("United", plane1, Dulles, GRU, 1700, 0004, true);
    Flight BWI_DEN = new Flight("Southwest", plane5, Dulles, LS,  2000, 0005, true);
    Flight LS_GRU = new Flight("American Airlines", plane3, LS, Denver, 2300, 0006, true);
    Flight GRU_DC = new Flight("Southwest", plane3, GRU, Denver, 1300, 0007, true);

    ArrayList <Flight> flights = new ArrayList <Flight>();

    flights.add(DC_GRU);
    flights.add(BWI_LS);
    flights.add(LS_DEN);
    flights.add(GRU_DEN);
    flights.add(DC_LS);
    flights.add(BWI_DEN);
    flights.add(LS_GRU);
    flights.add(GRU_DC);
    for(Flight temp : flights)
      temp.getFlight();
    
    /*for (int i = 0; i < flights.size(); i++) {     
      for (int x = i+1; x < flights.size(); x++) {     
        if(flights.get(i).getDepart > flights.get(x).getDepart ){    
          temp = flights.get(i).getDepart;    
          flights.get(i) = flights.get(x);    
          flights.get(x) = temp;    
        }     
      }     
    /*}    

    /*for(String temp : Airplanes){
      if(temp.MonthsSinceMaintenance() >= "12")
        status == false;
      
    }
    */
    /*for(String temp1 : Airport){
      if(temp1.operation() = "Closed")
        status == false;
      
    }
    */
    /*for(String temp2 : Flight){
      if(temp2.weather() = "Extreme")
        status == false;
      
    }
    */
    
    
  }
}