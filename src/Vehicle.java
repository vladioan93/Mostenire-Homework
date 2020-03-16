public class Vehicle {
    private final String serialNumber;
    private int noPersons;
    private String name;

    public Vehicle(String serialNumber, int noPersons) {
        this.serialNumber = serialNumber;
        this.noPersons = noPersons;
    }

    public Vehicle(String serialNumber, int noPersons, String name) {
        this.serialNumber = serialNumber;
        this.noPersons = noPersons;
        this.name = name;
    }

    public final String getSerialNumber() {
        return serialNumber;
    }

    public boolean goTo(double positionX, double positionY){
        System.out.println("Error: unknown vehicle cannot move...");

        return false;
    }

    public boolean addFuel(double amount){
        System.out.println("Error: unknown vehicle cannot move...");

        return false;
    }

    public void printInfo(){
        System.out.println("Vehicle properties: " +
                "\n\t- serial number: " + this.serialNumber +
                "\n\t- capacity: " + this.noPersons +
                "\n\t- name: " + this.name);
    }
}
