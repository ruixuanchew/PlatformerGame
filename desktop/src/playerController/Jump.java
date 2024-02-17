package playerController;

import com.badlogic.gdx.Gdx;

import EntityManager.Entity;
import EntityManager.EntityManager;

public class Jump extends PlayerControllerManager {
	private boolean canJump = true;
	private final float GRAVITY = -100f; // The acceleration due to gravity (in m/s^2)
	private static final float JUMP_VELOCITY = 150f; // JUMP_VELOCITY = sqrt(-2 * GRAVITY * JUMP_HEIGHT) = 160.01f

	public Jump(EntityManager em) {
		super(em);
	}

	public void jump() {
		for (Entity entity : getEntities().getEntityList()) {
			if (entity.isPlayer()) {
				if (getMovement().SpaceKey() && canJump) {
					entity.getVelocity().y += JUMP_VELOCITY; // adjust JUMP VELOCITY
					canJump = false;
				}
			}

		}
	}

	public void resetJump() {
		canJump = true;
	}

	public void applyGravity() {
		for (Entity entity : getEntities().getEntityList()) {
			if (entity.isPlayer()) {
				entity.getVelocity().y += GRAVITY * Gdx.graphics.getDeltaTime();
			}
		}
	}
}
