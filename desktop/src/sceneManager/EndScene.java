package sceneManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import simulationLifecycleManager.SimulationLifecycleManager;
import com.badlogic.gdx.graphics.Cursor;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class EndScene extends BaseScene{
	private SimulationLifecycleManager slManager;

	protected EndScene(SceneManager sceneManager, SimulationLifecycleManager slManager) {
		super(sceneManager);
		this.slManager = slManager;
		addButton("Back", Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2,
				() -> sceneManager.showStartScene());
		addButton("Exit", Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2 - 50,
				() -> this.slManager.endGame());
		addButton("Restart", Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2 - 100,
				() -> this.slManager.restartGame());
	}

	@Override
	protected Color getBackgroundColor() {
		return new Color(0.8f,0,0,1);
	}
}
