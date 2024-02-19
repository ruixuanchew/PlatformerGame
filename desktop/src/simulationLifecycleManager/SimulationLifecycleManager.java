package simulationLifecycleManager;

import com.badlogic.gdx.Gdx;
import sceneManager.SceneManager;
import EntityManager.EntityManager;

public class SimulationLifecycleManager {
    private SceneManager sceneManager;
    private EntityManager entityManager;

    public SimulationLifecycleManager(SceneManager sceneManager, EntityManager entityManager) {
        this.sceneManager = sceneManager;
        this.entityManager = entityManager;
    }

    public void startGame() {
        sceneManager.showStartScene();
    }

    public void endGame() {
        Gdx.app.exit();
    }

    public void restartGame() {
        entityManager.resetEntities();
        sceneManager.showGameScene();
    }
}