package sceneManager;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;

public class StartScene extends BaseScene{
	public StartScene(SceneManager sceneManager) {
		super(sceneManager);
 
		addButton("Start", Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2,
	            () -> sceneManager.showGameScene());
    }
	
	@Override
    protected Color getBackgroundColor() {
        return new Color(0.2f,0.6f,0,1);
    }
}

