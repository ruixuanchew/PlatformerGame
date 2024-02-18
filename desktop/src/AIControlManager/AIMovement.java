package AIControlManager;

import com.badlogic.gdx.Gdx;

import EntityManager.Entity;
import EntityManager.EntityManager;


public class AIMovement {
	private EntityManager entities;
	int screenWidth = Gdx.graphics.getWidth();
	
	public AIMovement(EntityManager em) {
	    this.entities = em;
	    this.screenWidth = Gdx.graphics.getWidth();
	}
	  
	public void aiMovement() {
	    for (Entity entity : entities.getEntityList()) {
	        if (!entity.isPlayer()) {
	            //Set the entity's speed to move in the current direction
	            float deltaX = entity.getSpeed();
	            
	            // Update the entity's position
	            entity.setPosX(entity.getPosX() + deltaX);

	            // Check if the entity has reached the edge of the screen, if yes, change direction of entity.
	            if (entity.getPosX() <= 0 || entity.getPosX() >= screenWidth) {
	            	entity.setSpeed(-(int)entity.getSpeed());
	            }
	        	
	        }
	    }
	}
	
}