package sceneManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import EntityManager.EntityManager;


public class GameScene extends BaseScene {    
    private EntityManager entityManager;
    private ShapeRenderer shapeRenderer;

    protected GameScene(SceneManager sceneManager, EntityManager entities) {
        super(sceneManager);
        this.entityManager = entities;
        
        String buttonText = "End";
        // Call addbutton method to set button based on params
        addButton(buttonText, Gdx.graphics.getWidth() - 100, Gdx.graphics.getHeight() - 50,
                () -> sceneManager.showEndScene());
    }
    
    // Override abstract method in BaseScene.java
    @Override
    protected Color getBackgroundColor() {
        return new Color(0,0,0.2f,1);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        
        // Draw the entities based in game scene
        ShapeRenderer shapeRenderer = new ShapeRenderer();
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        
        // call method draw from entityManager
        entityManager.draw(shapeRenderer);
        
        shapeRenderer.end();
    }
}
