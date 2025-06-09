package Model;

import Model.Enums.BillStatus;
import Model.Enums.PaymentStatus;

import java.util.Date;

public class Bill extends BaseModel{
    private double amount;
    private Date exitTime;
    private BillStatus billStatus;

    public Bill() {

    }

    public Bill(double amount, Date exitTime, BillStatus billStatus) {
        this.amount = amount;
        this.exitTime = exitTime;
        this.billStatus = billStatus;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }
}
