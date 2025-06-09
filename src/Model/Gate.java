package Model;

import Model.Enums.GateStatus;
import Model.Enums.GateType;

public class Gate extends BaseModel{
    private String guardName;
    private int gateNumber;
    private GateStatus status;
    private GateType gateType;
    private int floorNumber;
    private int parkingLotId;

    public Gate() {
    }

    public Gate(String guardName, int gateNumber, GateStatus status, GateType gateType, int floorNumber, int parkingLotId) {
        this.guardName = guardName;
        this.gateNumber = gateNumber;
        this.status = status;
        this.gateType = gateType;
        this.floorNumber = floorNumber;
        this.parkingLotId = parkingLotId;
    }

    public String getGuardName() {
        return guardName;
    }

    public void setGuardName(String guardName) {
        this.guardName = guardName;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateStatus getStatus() {
        return status;
    }

    public void setStatus(GateStatus status) {
        this.status = status;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }
}
