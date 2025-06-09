package Repository;

import java.util.HashMap;
import Exception.*;
import Model.ParkingFloor;

public class ParkingFloorRepository {
    private HashMap<Long, ParkingFloor> parkingFloorHashMap;

    public ParkingFloorRepository() {
        this.parkingFloorHashMap = new HashMap<>();
    }

    public ParkingFloor get(Long parkingFloorId) {
        ParkingFloor parkingFloor = parkingFloorHashMap.get(parkingFloorId);
        if (parkingFloor == null) {
            throw new UnknownParkingFloorException("Parking Floor Not Found");
        }
        return parkingFloor;
    }

    public void put(ParkingFloor parkingFloor) {
        parkingFloorHashMap.put(parkingFloor.getId(), parkingFloor);
    }
}