package Controller;

import Dto.IssueTicketRequestDTO;
import Dto.IssueTicketResponseDTO;
import Dto.ResponseStatus;
import Model.Ticket;
import Service.TicketService;
import Exception.InvalidRequestException;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO generateTicket(IssueTicketRequestDTO ticketRequestDTO){
        IssueTicketResponseDTO responseDTO = new IssueTicketResponseDTO();
        Ticket ticket;
        try{
            if(ticketRequestDTO.getGateId() == 0 ||
                    ticketRequestDTO.getVehicleColor() == null ||
                    ticketRequestDTO.getVehicleNumber() == null ||
                    ticketRequestDTO.getVehicleType() == null){
                throw new InvalidRequestException("Provided request does not have all necessary details");
            }
            ticket = ticketService.generateTicket(ticketRequestDTO.getVehicleType(),
                                    ticketRequestDTO.getVehicleNumber(),
                                    ticketRequestDTO.getVehicleColor(),
                                    ticketRequestDTO.getGateId());
            responseDTO.setTicket(ticket);
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        }catch (Exception e){
            responseDTO.setTicket(null);
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
            responseDTO.setExceptionMessage(e.getMessage());
        }
        return responseDTO;
    }

}
