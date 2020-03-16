public class OnRoad extends Vehicle {
    private int noWheels;
    private int noDoor;

    public OnRoad(String serialNumber, int noPersons){
        super(serialNumber, noPersons);
        this.noDoor = 4;
        this.noWheels = 4;
    }

    public OnRoad(String serialNumber, int noPersons, String name){
        super(serialNumber, noPersons, name);
        this.noDoor = 4;
        this.noWheels = 4;
    }

    public OnRoad(String serialNumber, int noPersons, int noWheels) {
        super(serialNumber, noPersons);
        this.noWheels = noWheels;
        this.noDoor = 4;
    }

    public OnRoad(String serialNumber, int noPersons, String name, int noWheels, int noDoor) {
        super(serialNumber, noPersons, name);
        this.noWheels = noWheels;
        this.noDoor = noDoor;
    }

    @Override
    public boolean goTo(double positionX, double positionY) {
        System.out.println("Driving the vehicle on road to coordinates: [" +
                positionX + ", " + positionY + "]");
        return true;
    }

    @Override
    public boolean addFuel(double amount) {
        System.out.println("Adding " + amount + " l of fuel to the driving vehicle.");
        return true;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Driving vehicle properties:" +
                "\n\t- number of wheels: " + this.noWheels +
                "\n\t- number of doors: " + this.noDoor);
    }
}
