package playerController;

import com.badlogic.gdx.Gdx;

import EntityManager.Entity;
import EntityManager.EntityManager;
import inputOutputManager.InputHandler;

public class PlayerControllerManager {
	private InputHandler movement;
	// private List<Entity> entityList = new ArrayList<>();
	private EntityManager entities;

	public PlayerControllerManager(EntityManager em) {
		this.entities = em; // Initialize the entity variable
		movement = new InputHandler(); // Initialize the movement variable
	}

	public void move() {
		for (Entity entity : entities.getEntityList()) {
			if (entity.isPlayer()) {
				if (movement.LeftKey()) {
					entity.setPosX(entity.getPosX() - (entity.getSpeed() * Gdx.graphics.getDeltaTime()));
				}
				if (movement.RightKey()) {
					entity.setPosX(entity.getPosX() + (entity.getSpeed() * Gdx.graphics.getDeltaTime()));
				}
			}

		}
	}
}
