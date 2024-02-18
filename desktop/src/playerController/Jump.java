package playerController;

import com.badlogic.gdx.Gdx;

import EntityManager.Entity;

public class Jump {
	private PlayerControllerManager pcManager;
	private boolean canJump = true;
	private final float GRAVITY = -100f; // The acceleration due to gravity (in m/s^2)
	private static final float JUMP_VELOCITY = 150f; // JUMP_VELOCITY = sqrt(-2 * GRAVITY * JUMP_HEIGHT) = 160.01f

	public Jump(PlayerControllerManager jump) {
		this.pcManager = jump;
	}

	public void jump() {
		for (Entity entity : pcManager.getEntities().getEntityList()) {
			if (entity.isPlayer()) {
				if (pcManager.getMovement().SpaceKey() && canJump) {
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
		for (Entity entity : pcManager.getEntities().getEntityList()) {
			if (entity.isPlayer()) {
				entity.getVelocity().y += GRAVITY * Gdx.graphics.getDeltaTime();
			}
		}
	}

	public void dispose() {

	}
}
