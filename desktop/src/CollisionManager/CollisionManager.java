package CollisionManager;

import EntityManager.Circle;

public class CollisionManager {

	public CollisionManager() {

	}

	public void checkCollision(Circle player, Circle entity) {
		float playerX = player.getPosX();
		float playerY = player.getPosY();
		float playerRadius = player.getRadius();

		float entityX = entity.getPosX();
		float entityY = entity.getPosY();
		float entityRadius = entity.getRadius();

		// find dist between player & entity
		float distX = Math.abs(playerX) - Math.abs(entityX);
		float distY = Math.abs(playerY) - Math.abs(entityY);
		double distance = Math.sqrt((distX * distX) + (distY * distY));
		if (distance <= (playerRadius + entityRadius)) {
			handleCollision(player, entity);
		}
	}

	private void handleCollision(Circle player, Circle entity) {
		if (player.getPosX() > entity.getPosX()) {
			player.setPosX(player.getPosX() + 5);
		} else if (player.getPosX() < entity.getPosX()) {
			player.setPosX(player.getPosX() - 5);
		}
		if (player.getPosY() > entity.getPosY()) {
			player.setPosY(player.getPosY() + 1);
		} else if (player.getPosY() < entity.getPosY()) {
			player.setPosY(player.getPosY() - 1);
		}
		System.out.println("\u001B[31m" + "Collision detected between player and entity!" + "\u001B[0m");

	}

}
