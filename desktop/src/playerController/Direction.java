package playerController;

import EntityManager.Entity;
import EntityManager.EntityManager;

public class Direction extends PlayerControllerManager {

	public Direction(EntityManager em) {
		super(em);
	}

	@Override
	public void move() {
		for (Entity entity : getEntities().getEntityList()) {
			if (entity.isPlayer()) {
				if (getMovement().LeftKey()) {

					entity.getVelocity().x = -entity.getSpeed();

				} else if (getMovement().RightKey()) {

					entity.getVelocity().x = entity.getSpeed();

				} else {
					entity.getVelocity().x = 0;
					// entity.getVelocity().y = 0;
				}

			}

		}
	}

}
