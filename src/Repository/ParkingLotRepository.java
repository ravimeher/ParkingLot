package Repository;

import Model.Gate;
import Model.ParkingLot;

import java.util.HashMap;
import Exception.*;

public class ParkingLotRepository {
    private HashMap<Long,ParkingLot> parkingLotHashMap;

    public ParkingLotRepository() {
        this.parkingLotHashMap = new HashMap<>();
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

    public ParkingLot getParkingLotFromGate(Gate gate){
        long parkingLotId = gate.getId();
        ParkingLot parkingLot = parkingLotHashMap.get(parkingLotId);
        if(parkingLot == null){
            throw new UnknownParkingLotException("Parking lot not found for Gate: "
                    + gate.getId());
        }
        return parkingLot;
    }
}
