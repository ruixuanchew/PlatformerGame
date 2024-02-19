package AIControlManager;

import com.badlogic.gdx.Gdx;


import EntityManager.Entity;
import EntityManager.EntityManager;

public class AIControlManager {
    private EntityManager entityManager;
	int screenWidth = Gdx.graphics.getWidth();
	
    public AIControlManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void moveAIControlled() {
        for (Entity entity : entityManager.getEntityList()) {
            if (!entity.isPlayer()) {

            	float deltaX = entity.getSpeed();
	            
	            entity.setPosX(entity.getPosX() + deltaX);
	            if (entity.getPosX() <= 0 || entity.getPosX() >= screenWidth) {
	    			entity.setSpeed(-(int)entity.getSpeed());
	            }
	        }
        }
    }
}
