import Logic.GameLogic;

/**
 * Created by landfried on 07.02.17.
 */
public class Main {
    public static void main(String argrs[]) {
        GameLogic gameLogic = new GameLogic();

        gameLogic.init();

        while (gameLogic.run)
            gameLogic.update();


    }
}
