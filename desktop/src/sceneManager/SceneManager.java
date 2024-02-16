package sceneManager;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import EntityManager.EntityManager;

public class SceneManager {
	private Game game;
	private StartScene startScene;
	private GameScene gameScene;
	private EndScene endScene;
	private EntityManager entityManager;
	
	public SceneManager(Game game, EntityManager em) {
		this.game = game;
		this.entityManager = em;
		startScene = new StartScene(this);
		// Game scene accepts entity manager
		gameScene = new GameScene(this, entityManager);
		endScene = new EndScene(this);
	}
	
	// sets screen for different scenes
	public void showStartScene() {
		game.setScreen(startScene);
		
	}
	public void showGameScene() {
		game.setScreen(gameScene);
	}
	public void showEndScene() {
		game.setScreen(endScene);
	}
	
	public void dispose() {
        startScene.dispose();
        gameScene.dispose();
        endScene.dispose();
    }

}
