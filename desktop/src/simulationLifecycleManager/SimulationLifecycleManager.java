package simulationLifecycleManager;

import com.badlogic.gdx.Gdx;
import sceneManager.SceneManager;

public class SimulationLifecycleManager {
    private SceneManager sceneManager;

    public SimulationLifecycleManager(SceneManager sceneManager) {
        this.sceneManager = sceneManager;
    }

    public void startGame() {
        sceneManager.showStartScene();
    }

    public void endGame() {
        Gdx.app.exit();
    }
}