package Repository;

import Model.ParkingLot;

import java.util.HashMap;
import Exception.*;

public class ParkingLotRepository {
    private HashMap<Long,ParkingLot> parkingLotHashMap;

    public ParkingLotRepository(HashMap<Long, ParkingLot> parkingLotHashMap) {
        this.parkingLotHashMap = parkingLotHashMap;
    }

    public ParkingLot get(Long parkingLotId) {
        ParkingLot parkingLot = parkingLotHashMap.get(parkingLotId);
        if(parkingLot == null){
            throw new UnknownParkingLotException("Parking Lot Not Found");
        }
        return parkingLot;
    }

    public void put(ParkingLot parkingLot){
        parkingLotHashMap.put(parkingLot.getId(),parkingLot);
    }
}
