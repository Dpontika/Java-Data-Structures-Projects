/**
 * Car Class for Toll Booth Management System
 * Represents a car with license plate information
 */
public class Car {
    private String licensePlate;
    private String arrivalTime;

    // Constructor
    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.arrivalTime = java.time.LocalTime.now().toString().substring(0, 8);
    }

    public Car(String licensePlate, String arrivalTime) {
        this.licensePlate = licensePlate;
        this.arrivalTime = arrivalTime;
    }

    // Getters
    public String getLicensePlate() { return licensePlate; }
    public String getArrivalTime() { return arrivalTime; }

    // String representation
    @Override
    public String toString() {
        return " Car (licence plate) :" + licensePlate + " " + "Arrival :" + arrivalTime + " ";
    }

    public String toSimpleString() {
        return licensePlate;
    }
}