import Logic.GameLogic;
import View.View;

/**
 * Created by landfried on 07.02.17.
 * Leon auch am start <3
 */
public class Main {
    public static void main(String argrs[]) {
        GameLogic gameLogic = new GameLogic();
        View view = new View();

        gameLogic.init();

        view.setGameObjectGetter(gameLogic.getGameObjectContainer());

        while (gameLogic.run) {
            gameLogic.update();
            view.update();
        }


    }
}
