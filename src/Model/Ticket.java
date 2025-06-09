package Model;

import java.time.LocalDateTime;
import java.util.Date;

public class Ticket extends BaseModel{
    private LocalDateTime entryTime;
    private Vehicle vehicle;
    private ParkingSpot spotAllotted;
    public Ticket(){}

    public Ticket(LocalDateTime entryTime, Vehicle vehicle, ParkingSpot spotAllotted) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.spotAllotted = spotAllotted;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
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

    @Override
    public String toString() {
        return "Ticket{" +
                "entryTime=" + entryTime +
                ", vehicle=" + vehicle +
                ", spotAllotted=" + spotAllotted +
                '}';
    }
}
