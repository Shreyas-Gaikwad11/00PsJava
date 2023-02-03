package Hierachical.Inheritance;

public class VehicleTest {
    public static void main(String[] args) {

        Cars obj1 = new Cars();
        obj1.vehicle();
        obj1.car();
        System.out.println("Total Vehicle : "+obj1.getVehicleQut());
        System.out.println("Cars : "+obj1.getCarQut());

        System.out.println("__________________________________");

        Motorcycle obj2 = new Motorcycle();
        obj2.vehicle();
        obj2.bike();
        System.out.println("\nTotal Vehicle : "+obj2.getVehicleQut());
        System.out.println("Bikes : "+obj2.getBikeQut());
    }
}
