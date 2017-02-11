package View;

import Logic.GameObject.Building;
import Logic.GameObject.Resource;
import Logic.GameObject.Settler;

import java.util.List;

/**
 * Created by landfried on 11.02.17.
 */
public interface GameObjectGetter {
    public List<Settler> getSettlers();
    public  List<Building> getBuildings();
    public List<Resource> getResources();
}
