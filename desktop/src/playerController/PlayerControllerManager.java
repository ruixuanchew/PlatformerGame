package playerController;

import com.badlogic.gdx.Gdx;

import inputOutputManager.InputHandler;

public class PlayerControllerManager {
	private InputHandler movement;
	private entitytest entity;

	public PlayerControllerManager(entitytest entity) {
		this.entity = entity; // Initialize the entity variable
		movement = new InputHandler(); // Initialize the movement variable
	}

	public void move() {
		if (movement.LeftKey()) {
			entity.setX(entity.getX() - (entity.getSpeed() * Gdx.graphics.getDeltaTime()));
		}
		if (movement.RightKey()) {
			entity.setX(entity.getX() + (entity.getSpeed() * Gdx.graphics.getDeltaTime()));
		}
	}
}
