package Repository;

import java.util.HashMap;
import Exception.*;
import Model.ParkingLot;
import Model.Ticket;

public class TicketRepository {
    private HashMap<Long, Ticket> ticketHashMap;

    public TicketRepository(HashMap<Long, Ticket> ticketHashMap) {
        this.ticketHashMap = ticketHashMap;
    }

    public Ticket get(Long ticketId) {
        Ticket ticket = ticketHashMap.get(ticketId);
        if (ticket == null) {
            throw new UnknownTicketException("Ticket Not Found");
        }
        return ticket;
    }

    public void put(Ticket ticket) {
        ticketHashMap.put(ticket.getId(), ticket);
    }
}