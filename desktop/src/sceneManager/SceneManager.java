package sceneManager;

import com.badlogic.gdx.Game;
public class SceneManager {
	private Game game;
	private StartScene startScene;
	private GameScene gameScene;
	private EndScene endScene;
	
	public SceneManager(Game game) {
		this.game = game;
		startScene = new StartScene(this);
		gameScene = new GameScene(this);
		endScene = new EndScene(this);
	}
	
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
