package Logic.GameObject;

import Logic.Mission.Mission;

/**
 * Created by landfried on 30.01.17.
 */
public abstract class Settler extends GameObject {
    private boolean busy;
    private Mission mission;

    public Settler() {
        busy = false;

    }

    public abstract void update();

    protected abstract boolean isCorrectMission(Mission mission);

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public void setMission(Mission mission) {
        if (this.mission != null)
            this.mission.abort();

        this.mission = mission;

        if (isCorrectMission(this.mission)) {
            setBusy(true);
            this.mission.begin();
        }
        else {
            setBusy(false);
            this.mission = null;
            mission.abort();
        }
    }

    public Mission getMission() {
        return mission;
    }
}
