package sceneManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Cursor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.graphics.Color;

public class GameScene extends BaseScene {	
	public GameScene(SceneManager sceneManager) {
		super(sceneManager);
		addButton("End", Gdx.graphics.getWidth() - 100, Gdx.graphics.getHeight() - 50,
	            () -> sceneManager.showEndScene());
	    }
		
	@Override
    protected Color getBackgroundColor() {
        return new Color(0,0,0.2f,1);
    }
	
	     
}

