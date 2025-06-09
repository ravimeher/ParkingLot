package Service;

import Model.Enums.ParkingSpotStatus;
import Model.Enums.VehicleType;
import Model.Gate;
import Model.ParkingSpot;
import Model.Ticket;
import Model.Vehicle;
import Repository.GateRepository;
import Repository.ParkingLotRepository;
import Repository.TicketRepository;
import Strategy.SpotAllocationStrategy.SpotAllocationFactory;
import Strategy.SpotAllocationStrategy.SpotAllocationStrategy;

import java.time.LocalDateTime;

public class TicketService {

    private TicketRepository ticketRepository;
    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;

    public TicketService(TicketRepository ticketRepository, GateRepository gateRepository, ParkingLotRepository parkingLotRepository) {
        this.ticketRepository = ticketRepository;
        this.gateRepository = gateRepository;
        this.parkingLotRepository = parkingLotRepository;
    }

    public Ticket generateTicket(VehicleType vehicleType, String vehicleNumber, String vehicleColor, long gateId){
        Gate gate = gateRepository.get(gateId);
        SpotAllocationStrategy spotAllocationStrategy = SpotAllocationFactory.getSpotAllocationStrategy(parkingLotRepository);
        ParkingSpot parkingSpot = spotAllocationStrategy.getParkingSpot(vehicleType, gate);
        parkingSpot.setStatus(ParkingSpotStatus.NOT_AVAILABLE);

        Ticket ticket = new Ticket();
        ticket.setVehicle(new Vehicle(vehicleType, vehicleNumber, vehicleColor));
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setSpotAllotted(parkingSpot);
        return ticket;
    }
}
