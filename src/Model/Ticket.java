package Model;

import java.util.Date;

public class Ticket extends BaseModel{
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSpot spotAllotted;
    public Ticket(){}

    public Ticket(Date entryTime, Vehicle vehicle, ParkingSpot spotAllotted) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.spotAllotted = spotAllotted;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getSpotAllotted() {
        return spotAllotted;
    }

    public void setSpotAllotted(ParkingSpot spotAllotted) {
        this.spotAllotted = spotAllotted;
    }
}
