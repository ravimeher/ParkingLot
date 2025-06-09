package Model;

import Model.Enums.ParkingSpotStatus;
import Model.Enums.ParkingSpotType;
import Model.Enums.VehicleType;

public class ParkingSpot extends BaseModel{
    private int number;
    private Vehicle parkedVehicle;
    private VehicleType supportedVehicleType;
    private ParkingSpotStatus status;

    public ParkingSpot(){}

    public ParkingSpot(int number, Vehicle parkedVehicle, VehicleType supportedVehicleType, ParkingSpotStatus status) {
        this.number = number;
        this.parkedVehicle = parkedVehicle;
        this.supportedVehicleType = supportedVehicleType;
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkedVehicle(Vehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }

    public VehicleType getSupportedVehicleType() {
        return supportedVehicleType;
    }

    public void setSupportedVehicleType(VehicleType supportedVehicleType) {
        this.supportedVehicleType = supportedVehicleType;
    }

    public ParkingSpotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingSpotStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "number=" + number +
                ", parkedVehicle=" + parkedVehicle +
                ", supportedVehicleType=" + supportedVehicleType +
                ", status=" + status +
                '}';
    }
}
