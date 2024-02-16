package playerController;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class entitytest {
	private float x, y, radius, speed;
	private Color color;

	public entitytest() {

	}

	public entitytest(float x, float y, float radius, float speed, Color color) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.speed = 200;
		this.color = color.RED;
	}

	public void draw(ShapeRenderer shape) {
		shape.setColor(getColor());
		shape.circle(x, y, radius);
		// shape.setColor(this.getColor());

	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
