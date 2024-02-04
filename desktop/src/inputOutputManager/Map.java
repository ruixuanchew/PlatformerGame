package inputOutputManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;


public class Map {

	    private TiledMap map;
	    private OrthogonalTiledMapRenderer renderer;
	    private OrthographicCamera camera;
	    private Rectangle player;

	    public Map() {
	        map = new TmxMapLoader().load("level1.tmx");
	        camera = new OrthographicCamera();
	        camera.setToOrtho(false, 30, 30);
	        camera.position.set(camera.viewportWidth / 2f, camera.viewportHeight / 2f, 0);
	        camera.update();
	        renderer = new OrthogonalTiledMapRenderer(map, 1 / 16f);
	    }

	    public void setPlayer(Rectangle player) {
	        this.player = player;
	    }

	    public void updatePlayer() {
	        player.x = MathUtils.clamp(player.x, 0, 615);
	        player.y = MathUtils.clamp(player.y, 30, 455);
	    }

	    public void updateCamera() {
	        float cameraHalfWidth = camera.viewportWidth / 2;
	        float cameraHalfHeight = camera.viewportHeight / 2;
	        float cameraRightBound = 50 - cameraHalfWidth;
	        float cameraLeftBound = 0 + cameraHalfWidth;
	        float cameraBottomBound = 0 + cameraHalfHeight;
	        float cameraTopBound = 50 - cameraHalfHeight;
	        float cameraX = MathUtils.clamp(player.x / 16, cameraLeftBound, cameraRightBound);
	        float cameraY = MathUtils.clamp(player.y / 16, cameraBottomBound, cameraTopBound);
	        camera.position.set(cameraX, cameraY, 0);
	        camera.update();
	    }

	    public void render() {
	        Gdx.gl.glClearColor(0, 0, 0, 1);
	        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	        renderer.setView(camera);
	        renderer.render();
	        updateCamera();
	        updatePlayer();
	    }
}
