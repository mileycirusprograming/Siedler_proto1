package Logic.GameObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by landfried on 03.02.17.
 */
public abstract class Building extends GameObject {
    private BuildingState state;

    public Building() {
        state = BuildingState.CONSTRUCT;
    }

    public abstract void update();

    public abstract Map<ResourceType, Integer> constructionResources();
    public abstract Map<ResourceType, Integer> productionResources();



    public Map<ResourceType, Integer> getNeededResources() {
        switch (state) {
            case CONSTRUCT:
                return constructionResources();

            case PRODUCTION:
                return productionResources();

            case SLEEP:
                return new HashMap<>();
        }

        return new HashMap<>();
    }
}
