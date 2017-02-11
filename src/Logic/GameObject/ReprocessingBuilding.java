package Logic.GameObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Franken on 12.02.2017.
 */
public abstract class ReprocessingBuilding extends Building {

    Map<ResourceType, Integer> baseResources;

    public Map<ResourceType, Integer> getBaseResources() {
        return baseResources;
    }

    public Map<ResourceType, Integer> getNeededResources() {
        switch (state) {
            case CONSTRUCT:
                return getConstructionResources();

            case PRODUCTION:
                return baseResources;

            case SLEEP:
                return new HashMap<>();
        }

        return new HashMap<>();
    }

}
