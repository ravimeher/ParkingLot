package Model;

import Model.Enums.ParkingFloorStatus;

import java.util.List;

public class ParkingFloor extends BaseModel {
    private List<ParkingSpot> parkingSpots;
    private List<Gate> gatesList;
    private int availableSpots;
    private ParkingFloorStatus parkingFloorStatus;

    public ParkingFloor(){}

    public ParkingFloor(List<ParkingSpot> parkingSpots, List<Gate> gatesList, int availableSpots, ParkingFloorStatus parkingFloorStatus) {
        this.parkingSpots = parkingSpots;
        this.gatesList = gatesList;
        this.availableSpots = availableSpots;
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public List<Gate> getGatesList() {
        return gatesList;
    }

    public void setGatesList(List<Gate> gatesList) {
        this.gatesList = gatesList;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    public void setAvailableSpots(int availableSpots) {
        this.availableSpots = availableSpots;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }
}
