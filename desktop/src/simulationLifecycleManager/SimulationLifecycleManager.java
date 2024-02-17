package simulationLifecycleManager;

import sceneManager.SceneManager;

public class SimulationLifecycleManager {
    private SceneManager sceneManager;
    private ErrorHandler errorHandler;

    public SimulationLifecycleManager(SceneManager sceneManager) {
        this.sceneManager = sceneManager;
    }

    public void startGame() {
        sceneManager.showStartScene();
    }

    public void endGame() {
        System.exit(0);
    }
}