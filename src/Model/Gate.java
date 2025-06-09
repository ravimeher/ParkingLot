package Model;

import Model.Enums.GateType;

public class Gate extends BaseModel{
    private String guardName;
    private GateType type;

    public Gate() {
    }

    public Gate(String guardName, GateType type) {
        this.guardName = guardName;
        this.type = type;
    }

    public String getGuardName() {
        return guardName;
    }

    public void setGuardName(String guardName) {
        this.guardName = guardName;
    }

    public GateType getType() {
        return type;
    }

    public void setType(GateType type) {
        this.type = type;
    }
}
