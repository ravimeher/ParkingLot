package Service;

import Model.Enums.*;
import Model.Gate;
import Model.ParkingFloor;
import Model.ParkingLot;
import Model.ParkingSpot;
import Repository.GateRepository;
import Repository.ParkingFloorRepository;
import Repository.ParkingLotRepository;
import Repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;

public class InitialisationService {
    private GateRepository gateRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSpotRepository parkingSpotRepository;
    private ParkingLotRepository parkingLotRepository;


    public InitialisationService(GateRepository gateRepository, ParkingFloorRepository parkingFloorRepository, ParkingSpotRepository parkingSpotRepository, ParkingLotRepository parkingLotRepository) {
        this.gateRepository = gateRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.parkingLotRepository = parkingLotRepository;
    }

    /***
     *  This will create a parking lot with 10 floors, and each floor having 10 spots
     *  @return ParkingLot object
     */
    public ParkingLot initialise(){
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setId(1);
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setAddress("Road A, City C, State S");
        parkingLot.setCapacity(100);

        Gate entryGate = new Gate();
        entryGate.setId(1);
        entryGate.setGuardName("Ram Kumar");
        entryGate.setGateNumber(1);
        entryGate.setGateType(GateType.ENTRY_GATE);
        entryGate.setFloorNumber(1);
        entryGate.setStatus(GateStatus.OPEN);
        entryGate.setParkingLotId(1);

        Gate exitGate = new Gate();
        exitGate.setId(2);
        exitGate.setGuardName("Mohan Kumar");
        exitGate.setGateNumber(2);
        exitGate.setGateType(GateType.EXIT_GATE);
        exitGate.setFloorNumber(1);
        exitGate.setStatus(GateStatus.OPEN);
        exitGate.setParkingLotId(1);

        parkingLot.setGates(List.of(exitGate,entryGate));
        gateRepository.put(entryGate);
        gateRepository.put(exitGate);

        List<ParkingFloor> parkingFloors = new ArrayList<>();

        for(int i=1;i<=10;i++){
            List<ParkingSpot> parkingSpots = new ArrayList<>();
            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setId(100 + i);
            parkingFloor.setParkingFloorStatus(ParkingFloorStatus.OPEN);
            parkingFloor.setFloorNumber(i);
            for(int j=1;j<=10;j++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setId(1000+j);
                parkingSpot.setNumber(i*100+j);
                if(j%2==0){
                    parkingSpot.setSupportedVehicleType(VehicleType.SUV);
                } else {
                    parkingSpot.setSupportedVehicleType(VehicleType.HATCHBACK);
                }
                parkingSpot.setStatus(ParkingSpotStatus.EMPTY);
                parkingSpots.add(parkingSpot);
                parkingSpotRepository.put(parkingSpot);
            }
            parkingFloor.setParkingSpots(parkingSpots);
            parkingFloorRepository.put(parkingFloor);
            parkingFloors.add(parkingFloor);
        }
        parkingLot.setParkingFloorList(parkingFloors);
        parkingLotRepository.put(parkingLot);
        return parkingLot;
    }

}
