package Model;

import java.util.ArrayList;
import java.util.List;

public class ServiceRent {

    private List<Vehicle>vehicleList;
    private List<Rent>rentList;
    private List<Subsidary>subsidaryList;


    public ServiceRent() {
        this.vehicleList = new ArrayList<>();
        this.rentList = new ArrayList<>();
        this.subsidaryList = new ArrayList<>();
    }

    public void addVehicle(Vehicle v){
        vehicleList.add(v);
    }


    public void showVehicle(){

        for(Vehicle v : vehicleList){
            System.out.println(v);
        }

    }

    public void addSubsidary(Subsidary s){
        subsidaryList.add(s);
    }

    public void showSubsidary(){
        for(Subsidary s : subsidaryList){
            System.out.println(s);
        }
    }




}
