package EntityManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.Color;

public class Circle extends Entity
{
	private float radius;
	
	// default
	public Circle()
	{
		
	}
	
	// parameterized
	public Circle(float radius, float posX, float posY, float speed, Color colour)
	{
		super(posX, posY, speed, colour);
		this.radius = radius;
	}
	
	public float getRadius()
	{
		return radius;
	}
	
	public void setRadius(float r)
	{
		this.radius = r; 
	}
	
	@Override
	public void draw(ShapeRenderer shape) 
	{
        // Set the drawing color
        shape.setColor(this.getColour());

        // Draw the circle using the Circle's position and radius
        shape.circle(this.getPosX(), this.getPosY(), this.radius);
    }

	
	@Override
	public void movement()
	{
//		if (Gdx.input.isKeyPressed(Keys.UP))
//		{
//			float y = this.getPosY() + this.getSpeed() * Gdx.graphics.getDeltaTime();
//			this.setPosY(y);
//		}
//		
//		if (Gdx.input.isKeyPressed(Keys.DOWN))
//		{
//			float y = this.getPosY() - this.getSpeed() * Gdx.graphics.getDeltaTime();
//			this.setPosY(y);
//		}
	}

	@Override
	public void update() 
	{
		this.moverUserControlled();
	}

	@Override
	public void moveAIControlled() 
	{
		
	}

	@Override
	public void moverUserControlled() 
	{
		this.movement();
	}
	
		
	
}