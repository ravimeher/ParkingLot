package Dto;

import Model.Ticket;

public class IssueTicketResponseDTO {
    private ResponseStatus responseStatus;
    private Ticket ticket;
    private String exceptionMessage;

    public IssueTicketResponseDTO() {
    }

    public IssueTicketResponseDTO(ResponseStatus responseStatus, Ticket ticket, String exceptionMessage) {
        this.responseStatus = responseStatus;
        this.ticket = ticket;
        this.exceptionMessage = exceptionMessage;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    @Override
    public String toString() {
        return "IssueTicketResponseDTO{" +
                "responseStatus=" + responseStatus +
                ", ticket=" + ticket +
                ", exceptionMessage='" + exceptionMessage + '\'' +
                '}';
    }
}
