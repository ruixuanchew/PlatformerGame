package com.mygdx.platformproject;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import EntityManager.Circle;
import EntityManager.EntityManager;
import inputOutputManager.InputOutputManager;
import playerController.PlayerControllerManager;
import sceneManager.SceneManager;
import simulationLifecycleManager.SimulationLifecycleManager;

public class GameMaster extends Game {
	private InputOutputManager ioManager;
	private SceneManager sceneManager;
	private PlayerControllerManager pcManager;
	private ShapeRenderer shape;
	private EntityManager em;
	private SimulationLifecycleManager slManager;

	@Override
	public void create() {
		// Initialize the InputOutputManager
		ioManager = new InputOutputManager();

		// Initialize the EntityManager
		em = new EntityManager();

		// add the entities into an array
		em.add(new Circle(30, 30, 50, 200, Color.BLUE, true)); // Player
		em.add(new Circle(30, 90, 50, 20, Color.GREEN, false)); // Entity

		// Initialize the PlayerControllerManager
		pcManager = new PlayerControllerManager(em);
		
		// Initialize SceneManager with game and entities
		sceneManager = new SceneManager(this, em);

		// Initialize SimulationLifecycleManager with SceneManager
		slManager = new SimulationLifecycleManager(sceneManager);
		// Start with start scene
		slManager.startGame();

	}

	@Override
	public void render() {
		super.render();
		ioManager.Map().render();
		ioManager.backgroundMusic();

//		shape.begin(ShapeRenderer.ShapeType.Filled); // Add the shape type before drawing the shape
//
//		em.draw(shape);
//		shape.end();

		pcManager.move();
	}

	@Override
	public void dispose() {
		sceneManager.dispose();
	}

}