package EntityManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Entity implements iMovable{

	private float posX, posY, speed;
	private Color colour;
	
	abstract void update();
	
	// default constructor
	public Entity ()
	{
		
	}
	
	// parameterized constructor
	public Entity(float posX, float posY, float speed)
	{
		this.posX = posX;
		this.posY = posY;
		this.speed = speed;
	}
	
	public Entity(float posX, float posY, float speed, Color colour)
	{
		this.posX = posX;
		this.posY = posY;
		this.speed = speed;
		this.colour = colour;
	}
	
	public float getPosX () 
	{
		return posX;
	}
	
	public float getPosY () 
	{
		return posY;
	}
	
	public float getSpeed()
	{
		return speed;
	}
	
	public Color getColour()
	{
		return colour;
	}
	
	void setPosX (float x)
	{
		 posX = x;
	}
	
	void setPosY (float y)
	{
		posY = y;
	}
	
	void setSpeed (int s)
	{
		speed = s;
	}
	
	public void setColour(Color colour)
	{
		this.colour = colour;
	}
	
	public void draw(ShapeRenderer shape)
	{
		
	}
	
	public void draw(SpriteBatch batch)
	{
		
	}
	
	public void movement()
	{
		
	}
	
	public void dispose(SpriteBatch batch)
	{
		
	}
}


