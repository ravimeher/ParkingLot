package Model;

import Model.Enums.ParkingLotStatus;

import java.util.List;

public class ParkingLot extends BaseModel{
    private List<ParkingFloor> parkingFloorList;
    private String parkingLotName;
    private String address;
    private int capacity;
    private ParkingLotStatus parkingLotStatus;
    public ParkingLot(){}

    public ParkingLot(List<ParkingFloor> parkingFloorList, String parkingLotName, String address, int capacity, ParkingLotStatus parkingLotStatus) {
        this.parkingFloorList = parkingFloorList;
        this.parkingLotName = parkingLotName;
        this.address = address;
        this.capacity = capacity;
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<ParkingFloor> getParkingFloorList() {
        return parkingFloorList;
    }

    public void setParkingFloorList(List<ParkingFloor> parkingFloorList) {
        this.parkingFloorList = parkingFloorList;
    }

    public String getParkingLotName() {
        return parkingLotName;
    }

    public void setParkingLotName(String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }
}
