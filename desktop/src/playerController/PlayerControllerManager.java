package playerController;

import com.badlogic.gdx.math.Vector2;

import EntityManager.Entity;
import EntityManager.EntityManager;
import inputOutputManager.InputHandler;

public class PlayerControllerManager {
	private InputHandler movement;
	private EntityManager entities;
	private Direction direction;
	private Jump jump;

	private final float GROUND_LEVEL = 150;

	public PlayerControllerManager(EntityManager em) {
		this.entities = em; // Initialize the entity variable
		movement = new InputHandler(); // Initialize the movement variable
		direction = new Direction(this);
		jump = new Jump(this);

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

	public void update(float deltaTime) {
		final String ANSI_RESET = "\u001B[0m";
		final String ANSI_CYAN = "\u001B[36m";
		final String ANSI_Green = "\u001B[32m";

		direction.move();
		jump.jump();
		jump.applyGravity();

		// Check if the player is on the ground
		for (Entity entity : getEntities().getEntityList()) {
			if (entity.isPlayer()) {
				entity.setPosX(entity.getPosX() + entity.getVelocity().x * deltaTime);
				entity.setPosY(entity.getPosY() + entity.getVelocity().y * deltaTime);
				System.out.println(String.format(ANSI_CYAN + "Player is at %.2f,%.2f position" + ANSI_RESET,
						entity.getPosX(), entity.getPosY()));

				if (entity.getPosY() <= GROUND_LEVEL) {
					entity.setPosY(GROUND_LEVEL);
					entity.setVelocity(new Vector2(entity.getVelocity().x, 0));
					jump.resetJump();
				}

			} else {
				System.out.println(String.format(ANSI_Green + "Entity is at %.2f, %.2f position" + ANSI_RESET,
						entity.getPosX(), entity.getPosY()));
			}

		}

	}

	public void dispose() {
		direction.dispose();
		jump.dispose();
	}

}
