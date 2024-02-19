package EntityManager;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import AIControlManager.AIControlManager;

public class EntityManager {
	private List<Entity> entityList;
	private List<Circle> collidableEntityList;
	private AIControlManager aiControlManager;

	public EntityManager() {
		entityList = new ArrayList<>();
		collidableEntityList = new ArrayList<>();
		aiControlManager = new AIControlManager(this); 
	}

	public void add(Entity entity) {
		entityList.add(entity);
	}

	public List<Entity> getEntityList() { // to return a list of entities
		return entityList;
	}

	public void update() {
		for (Entity entity : entityList) {
			entity.update();

		}
	}

	public void resetEntities() {
		for (Entity entity: entityList) {
			entity.resetPosition();
		}
	}

	public void draw(SpriteBatch batch) {
		for (Entity entity : entityList) {
			entity.draw(batch);
		}
	}

	public void draw(ShapeRenderer shape) {
		for (Entity entity : entityList) {
			entity.draw(shape);
		}
	}

	public void dispose(SpriteBatch batch) {
		for (Entity entity : entityList) {
			entity.dispose(batch);
		}
	}

	public List<Circle> getCollidableEntityList() {
		return collidableEntityList;
	}

	public void addCollidableEntity(Circle entity) {
		this.collidableEntityList.add(entity);
	}
	
	public void moveEntities() {
		aiControlManager.aiMove();
	}

}
