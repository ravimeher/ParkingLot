package Model;

import Model.Enums.PaymentStatus;

public class Payment extends BaseModel{
    private PaymentStatus paymentStatus;
    private double amount;
    private Bill bill;
    private int paymentReferenceNumber;


    public Payment(){}

    public Payment(PaymentStatus paymentStatus, double amount, Bill bill, int paymentReferenceNumber) {
        this.paymentStatus = paymentStatus;
        this.amount = amount;
        this.bill = bill;
        this.paymentReferenceNumber = paymentReferenceNumber;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public int getPaymentReferenceNumber() {
        return paymentReferenceNumber;
    }

    public void setPaymentReferenceNumber(int paymentReferenceNumber) {
        this.paymentReferenceNumber = paymentReferenceNumber;
    }
}
