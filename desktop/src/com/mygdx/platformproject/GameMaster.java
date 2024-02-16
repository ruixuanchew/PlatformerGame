package com.mygdx.platformproject;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

import inputOutputManager.InputOutputManager;
import sceneManager.SceneManager;

public class GameMaster extends Game {
    private InputOutputManager ioManager;
    private SceneManager sceneManager;

    @Override
    public void create() {
        ioManager = new InputOutputManager();
        sceneManager = new SceneManager(this);
		sceneManager.showStartScene();
    }

    @Override
    public void render() {
        super.render();
        ioManager.Map().render();
        ioManager.backgroundMusic();
    }
    @Override
	 public void dispose() {
	     sceneManager.dispose();
	 }

}