public class Flight {
    Airplane plane;
    Airport port;
    Airport port2;
    int depart, id;
    String line;
    boolean status;

    public Flight(String airline, Airplane airplane1, Airport airport1, Airport airport2, int time, int num, boolean s)
    {
        plane = airplane1;
        port = airport1;
        port2 = airport2;
        depart = time;
        id = num;
        line = airline;
        status = s;

    }

    public int getDepart(){return depart;}

    public void getFlight(){
        System.out.println(line + " flight " +  id + " will depart from " + port.getLocation() + " for " + port2.getLocation() + " at " + depart + " hours. " + plane.getPlane() + "\n");

    }
}
