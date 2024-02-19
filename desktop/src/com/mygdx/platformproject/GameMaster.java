package com.mygdx.platformproject;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

import CollisionManager.CollisionManager;
import EntityManager.Circle;
import EntityManager.EntityManager;
import inputOutputManager.InputOutputManager;
import playerController.Direction;
import playerController.Jump;
import playerController.PlayerControllerManager;
import sceneManager.SceneManager;
import simulationLifecycleManager.SimulationLifecycleManager;
import simulationLifecycleManager.ErrorHandler;

public class GameMaster extends Game {
	private InputOutputManager ioManager;
	private ErrorHandler errorHandler;
	private SceneManager sceneManager;
	private Direction movement;
	private Jump jump;
	private PlayerControllerManager pcManager;
	private ShapeRenderer shape;
	private EntityManager em;
	private SimulationLifecycleManager slManager;

	private CollisionManager cManager;
	private Circle player;

	@Override
	public void create() {
		// Initialize the InputOutputManager and Error Handler
		ioManager = new InputOutputManager();
		errorHandler = new ErrorHandler();

		// Initialize the EntityManager
		em = new EntityManager();

		// add the entities into an array
		player = new Circle(30, 100, 150, 200, Color.CYAN, true, new Vector2(0, 0));
		em.add(player); // Player
		Circle entity = new Circle(30, 150, 150, 4, Color.GREEN, false);
		em.add(entity); // Entity

		// add entities to collidable list
		em.addCollidableEntity(entity);
		cManager = new CollisionManager();

		// Initialize the PlayerControllerManager, Jump,
		pcManager = new PlayerControllerManager(em);
		movement = new Direction(pcManager);
		jump = new Jump(pcManager);

		// Initialize SceneManager with game and entities
		sceneManager = new SceneManager(this, em);

		// Initialize SimulationLifecycleManager with SceneManager
		slManager = new SimulationLifecycleManager(sceneManager, em);
		// Start with start scene
		try {
			slManager.startGame();
		} catch (Exception e) {
			errorHandler.handleException(e, "Failed to start the game");
			Gdx.app.exit(); // Exit the game if an error occurs
		}

	}

	@Override
	public void render() {
		super.render();
		ioManager.backgroundMusic();

		for (Circle e : em.getCollidableEntityList()) {
			cManager.checkCollision(player, e);
		}

		pcManager.update(Gdx.graphics.getDeltaTime());
		em.moveEntities();
	}

	@Override
	public void dispose() {
		sceneManager.dispose();
		pcManager.dispose();
	}

}