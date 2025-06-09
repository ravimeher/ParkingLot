package Repository;

import Model.Gate;
import Exception.UnknownGateException;

import java.util.HashMap;

public class GateRepository {
    private HashMap<Long, Gate> gateHashMap;

    public GateRepository() {
        this.gateHashMap = new HashMap<>();
    }


    public Gate get(Long gateId) {
        Gate Gate = gateHashMap.get(gateId);
        if (Gate == null) {
            throw new UnknownGateException("Gate Not Found");
        }
        return Gate;
    }

    public void put(Gate Gate) {
        gateHashMap.put(Gate.getId(), Gate);
    }

}
