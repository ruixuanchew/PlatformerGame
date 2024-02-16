package com.mygdx.platformproject;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;

import inputOutputManager.InputOutputManager;
import playerController.PlayerControllerManager;
import playerController.entitytest;
import sceneManager.SceneManager;

public class GameMaster extends Game {
	private InputOutputManager ioManager;
	private SceneManager sceneManager;
	private PlayerControllerManager pcManager;
	private ShapeRenderer shape;
	private Circle circle;
	private entitytest entity;

	@Override
	public void create() {
		ioManager = new InputOutputManager();
		sceneManager = new SceneManager(this);
		sceneManager.showStartScene();
		shape = new ShapeRenderer();

		// circle = new Circle(300, 300, 30);

		// Initialize the PlayerControllerManager and entitytest instances
		entity = new entitytest(300, 300, 30, 200, Color.RED);
		pcManager = new PlayerControllerManager(entity);

	}

	@Override
	public void render() {
		super.render();
		ioManager.Map().render();
		ioManager.backgroundMusic();

		shape.begin(ShapeRenderer.ShapeType.Filled); // Add the shape type before drawing the shape
		entity.draw(shape);
		shape.end();

		pcManager.move();
	}

	@Override
	public void dispose() {
		sceneManager.dispose();
	}

}