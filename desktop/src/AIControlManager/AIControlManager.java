package AIControlManager;

import com.badlogic.gdx.Gdx;

import EntityManager.Entity;
import EntityManager.EntityManager;



public class AIControlManager {
	private AIMovement aiMovement;
	private EntityManager entities;

	
    public AIControlManager(EntityManager em) {
        this.entities = em;
        this.aiMovement = new AIMovement(em);
    }

	public void aiMove() {
		aiMovement.aiMovement();
	}
	

}


