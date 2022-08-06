
public class Airplane{
    String make;
    int model, id;
    boolean status;

    //plane constructor

    public Airplane(String mk, int md, int num, boolean s){
        make = mk;
        model = md;
        id = num;
        status = s;
    }


    //accessors 

    public String getMake(){return make;}
    
    public int getModel(){return model;}

    public int getId(){return id;}

    public void getStatus(){
        if(status == true)
            System.out.println("Plane does not need maintenece and is ready to fly.");
        else
            System.out.println("Plane needs maintenece.");
    }

    public String getPlane(){
        return "Plane #" + id + " is a " + make + " " + model;
    }

}

