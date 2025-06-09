package Model;

import Model.Enums.VehicleType;

public class Vehicle extends BaseModel {
    private VehicleType type;
    private String number;
    private String color;
    public Vehicle(){

    }

    public Vehicle(VehicleType type, String number, String color) {
        this.type = type;
        this.number = number;
        this.color = color;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
