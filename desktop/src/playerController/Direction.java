package playerController;

import EntityManager.Entity;

public class Direction {

	private PlayerControllerManager pcManager;

	public Direction(PlayerControllerManager movement) {
		// super(em);
		this.pcManager = movement;

	}

	public void move() {
		for (Entity entity : pcManager.getEntities().getEntityList()) {
			if (entity.isPlayer()) {
				if (pcManager.getMovement().LeftKey()) {

					entity.getVelocity().x = (-entity.getSpeed());

				} else if (pcManager.getMovement().RightKey()) {

					entity.getVelocity().x = entity.getSpeed();

				} /*
					 * else if (pcManager.getMovement().DownKey()) {
					 * 
					 * entity.getVelocity().y = -entity.getSpeed();
					 * 
					 * } else if (pcManager.getMovement().UpKey()) {
					 * 
					 * entity.getVelocity().y = entity.getSpeed();
					 * 
					 * }
					 */ else {

					entity.getVelocity().x = 0;
					// entity.getVelocity().y = 0;
				}
			}
		}
	}

	public void dispose() {

	}

}
