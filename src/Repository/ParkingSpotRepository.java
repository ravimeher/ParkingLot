package Repository;
import Model.ParkingSpot;

import java.util.HashMap;
import Exception.*;

public class ParkingSpotRepository {
    private HashMap<Long,ParkingSpot> parkingSpotHashMap;

    public ParkingSpotRepository() {
        this.parkingSpotHashMap = new HashMap<>();
    }


    public ParkingSpot get(Long parkingSpotId) {
        ParkingSpot parkingSpot = parkingSpotHashMap.get(parkingSpotId);
        if(parkingSpot == null){
            throw new UnknownParkingSpotException("Parking Lot Not Found");
        }
        return parkingSpot;
    }

    public void put(ParkingSpot parkingSpot){
        parkingSpotHashMap.put(parkingSpot.getId(),parkingSpot);
    }
}
