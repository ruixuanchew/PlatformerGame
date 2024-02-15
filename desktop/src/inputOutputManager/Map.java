package inputOutputManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;


public class Map {

	    private TiledMap map;
	    private OrthographicCamera camera;
	    public Map() {
	        map = new TmxMapLoader().load("level1.tmx");
	        camera = new OrthographicCamera();
	        camera.setToOrtho(false, 30, 30);
	        camera.position.set(camera.viewportWidth / 2f, camera.viewportHeight / 2f, 0);
	        camera.update();
	    }

	    public void render() {
//	    	ScreenUtils.clear(0, 0, 0.2f, 1);
	    }
}
