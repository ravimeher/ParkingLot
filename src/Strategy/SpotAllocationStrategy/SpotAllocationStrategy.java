package Strategy.SpotAllocationStrategy;

import Model.Enums.VehicleType;
import Model.Gate;
import Model.ParkingSpot;

public interface SpotAllocationStrategy {
    ParkingSpot getParkingSpot(VehicleType vehicleType, Gate gate);
}
