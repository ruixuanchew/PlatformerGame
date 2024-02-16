package EntityManager;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public abstract class Entity implements iMovable {

	private float posX, posY, speed;
	private Color colour;
	private boolean isPlayer; // check if entity is player

	abstract void update();

	// default constructor
	public Entity() {

	}

	// parameterized constructor
	public Entity(float posX, float posY, float speed, boolean isPlayer) {
		this.posX = posX;
		this.posY = posY;
		this.speed = speed;
		this.isPlayer = isPlayer;
	}

	public Entity(float posX, float posY, float speed, Color colour, boolean isPlayer) {
		this.posX = posX;
		this.posY = posY;
		this.speed = speed;
		this.colour = colour;
		this.isPlayer = isPlayer;
	}

	public float getPosX() {
		return posX;
	}

	public float getPosY() {
		return posY;
	}

	public float getSpeed() {
		return speed;
	}

	public Color getColour() {
		return colour;
	}

	public void setPosX(float x) {
		posX = x;
	}

	public void setPosY(float y) {
		posY = y;
	}

	public void setSpeed(int s) {
		speed = s;
	}

	public void setColour(Color colour) {
		this.colour = colour;
	}

	public void draw(ShapeRenderer shape) {

	}

	public void draw(SpriteBatch batch) {

	}

	public void movement() {

	}

	public void dispose(SpriteBatch batch) {

	}

	public boolean isPlayer() {
		return isPlayer;
	}
}
