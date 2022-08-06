public class Airport{
    String name, location;
    int id;
    boolean status;

    public Airport(String n, String l, int num, boolean s){
        name = n;
        location = l;
        id = num;
        status = s;
    }
    
    String getName(){return name;}

    String getLocation(){return location;}

    int getId(){return id;}

    void getStatus(){
        if(status == true)
            System.out.println("Airport is online");
        else
            System.out.println("Airport is offline");

    }



}//end class