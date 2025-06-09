import Controller.TicketController;
import Dto.IssueTicketRequestDTO;
import Dto.IssueTicketResponseDTO;
import Model.Enums.VehicleType;
import Model.ParkingLot;
import Repository.*;
import Service.InitialisationService;
import Service.TicketService;

public class Main {
    private InitialisationService initialisationService;
    private TicketController ticketController;

    public Main() {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        GateRepository gateRepository = new GateRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

        this.initialisationService = new InitialisationService(gateRepository, parkingFloorRepository, parkingSpotRepository, parkingLotRepository);
        this.ticketController = new TicketController(new TicketService(ticketRepository, gateRepository,parkingLotRepository));
    }

    public static void main(String[] args) {
        Main main = new Main();
        ParkingLot parkingLot = main.initialisationService.initialise();
        IssueTicketRequestDTO issueTicketRequestDTO =
                new IssueTicketRequestDTO("ABCD1234","Black",VehicleType.SUV ,  1);
        IssueTicketResponseDTO responseDTO = main.ticketController.generateTicket(issueTicketRequestDTO);
        System.out.println(responseDTO);

    }
}
