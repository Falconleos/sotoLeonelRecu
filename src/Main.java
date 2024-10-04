import Model.ServiceRent;
import Model.Subsidary;
import Model.Type;
import Model.Vehicle;

public class Main {
    public static void main(String[] args) {

        ServiceRent serviceRent = new ServiceRent();


        Vehicle vehicle = new Vehicle(2011, 109000, 2011, 20540, 100.0, Type.VAN);
        Vehicle vehicle1 = new Vehicle(2010, 101200, 2010, 20542, 120.0, Type.FOUR_DOORS);

        serviceRent.addVehicle(vehicle);
        serviceRent.addVehicle(vehicle1);

        serviceRent.showVehicle();

        Subsidary subsidary = new

    }
}