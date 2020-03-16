public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("d213f423gf", 4,"b12pvi");
        myVehicle.addFuel(23);
        myVehicle.goTo(13,24);
        myVehicle.printInfo();

        OnRoad myOnRoad = new OnRoad("vbybreiovb2", 3, "moto", 5,2);
        myOnRoad.addFuel(23);
        myOnRoad.goTo(13,24);
        myOnRoad.printInfo();

        OnWater myOnWater = new OnWater("vbybreiovb2", 3, "moto", 5,2);
        myOnWater.addFuel(23);
        myOnWater.goTo(13,24);
        myOnWater.printInfo();

        OnAir myOnAir = new OnAir("vbybreiovb2", 3, "moto", 5,true);
        myOnAir.addFuel(23);
        myOnAir.goTo(13,24);
        myOnAir.printInfo();
    }
}

