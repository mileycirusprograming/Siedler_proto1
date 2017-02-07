package Logic.Mission;

import Logic.GameObject.Building;

/**
 * Created by landfried on 30.01.17.
 */
public abstract class Mission {
    private MissionState state;
    private Building building;

    public Mission(Building building) {
        state = MissionState.ASSIGN;
        this.building = building;
    }

    public void begin() {
        state = MissionState.WORK;
    }

    public void abort() {
        state = MissionState.FAIL;
    }

    public void finish() {
        state = MissionState.COMPLETE;
    }

}
