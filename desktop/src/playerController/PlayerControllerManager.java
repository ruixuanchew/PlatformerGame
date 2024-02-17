package playerController;

import com.badlogic.gdx.math.Vector2;

import EntityManager.Entity;
import EntityManager.EntityManager;
import inputOutputManager.InputHandler;

public class PlayerControllerManager {
	private InputHandler movement;
	private EntityManager entities;
	private final float GROUND_LEVEL = 150;

	public PlayerControllerManager(EntityManager em) {
		this.entities = em; // Initialize the entity variable
		movement = new InputHandler(); // Initialize the movement variable
	}

	public InputHandler getMovement() {
		return movement;
	}

	public void setMovement(InputHandler movement) {
		this.movement = movement;
	}

	public EntityManager getEntities() {
		return entities;
	}

	public void setEntities(EntityManager entities) {
		this.entities = entities;
	}

	public void move() {
	}

	public void jump() {
	}

	public void update(float deltaTime, Direction direction, Jump jump) {
		direction.move();
		jump.jump();
		jump.applyGravity();

		// Check if the player is on the ground
		for (Entity entity : getEntities().getEntityList()) {
			if (entity.isPlayer()) {
				entity.setPosX(entity.getPosX() + entity.getVelocity().x * deltaTime);
				entity.setPosY(entity.getPosY() + entity.getVelocity().y * deltaTime);

				if (entity.getPosY() <= GROUND_LEVEL) {
					entity.setPosY(GROUND_LEVEL);
					entity.setVelocity(new Vector2(entity.getVelocity().x, 0));
					jump.resetJump();
				}

			}
		}

	}

}
