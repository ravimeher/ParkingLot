package Strategy.SpotAllocationStrategy;

import Model.Enums.ParkingSpotStatus;
import Model.Enums.VehicleType;
import Model.Gate;
import Model.ParkingFloor;
import Model.ParkingLot;
import Model.ParkingSpot;
import Repository.ParkingLotRepository;
import Exception.ParkingSpotNotFoundException;

public class RandomSpotAllocationStrategy implements SpotAllocationStrategy {
    private ParkingLotRepository parkingLotRepository;

    public RandomSpotAllocationStrategy(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    @Override
    public ParkingSpot getParkingSpot(VehicleType vehicleType, Gate gate) {
        ParkingSpot result = null;
        ParkingLot parkingLot = parkingLotRepository.getParkingLotFromGate(gate);
        int currentFloor = gate.getFloorNumber();

        ParkingFloor parkingFloor = parkingLot.getParkingFloorList().get(currentFloor-1);
        for(ParkingSpot parkingSpot : parkingFloor.getParkingSpots()){
            if(parkingSpot.getSupportedVehicleType().equals(vehicleType)
                    && parkingSpot.getStatus().equals(ParkingSpotStatus.EMPTY)){
                result = parkingSpot;
                break;
            }
        }
        if (result == null) {
            for(ParkingFloor floor : parkingLot.getParkingFloorList()){
                for(ParkingSpot parkingSpot : floor.getParkingSpots()) {
                    if(parkingSpot.getSupportedVehicleType().equals(vehicleType)
                            && parkingSpot.getStatus().equals(ParkingSpotStatus.EMPTY)){
                        result = parkingSpot;
                        break;
                    }
                }
                if (result != null) break;
            }
            if (result == null) {
                throw new ParkingSpotNotFoundException("No parking spot available for this vehicle type" + vehicleType.name() );
            }

        }

        return result;
    }
}
