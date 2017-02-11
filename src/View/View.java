package View;

/**
 * Created by landfried on 11.02.17.
 */
public class View {
    private GameObjectGetter gameObjectGetter;


    public void update() {
        //System.out.println("View: " + gameObjectGetter.getSettlers());

    }

    public void setGameObjectGetter(GameObjectGetter gameObjectGetter) {
        this.gameObjectGetter = gameObjectGetter;
    }
}
