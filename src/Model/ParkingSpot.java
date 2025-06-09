package Model;

import Model.Enums.ParkingSpotStatus;
import Model.Enums.ParkingSpotType;

public class ParkingSpot extends BaseModel{
    private Vehicle parkedVehicle;
    private ParkingSpotType parkingSpotType;
    private ParkingSpotStatus status;

    public ParkingSpot(){}
    public ParkingSpot(Vehicle parkedVehicle, ParkingSpotType parkingSpotType, ParkingSpotStatus status) {
        this.parkedVehicle = parkedVehicle;
        this.parkingSpotType = parkingSpotType;
        this.status = status;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkedVehicle(Vehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public ParkingSpotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingSpotStatus status) {
        this.status = status;
    }
}
