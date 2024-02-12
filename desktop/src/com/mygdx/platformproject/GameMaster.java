package com.mygdx.platformproject;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

import inputOutputManager.InputOutputManager;

public class GameMaster extends Game {
    private InputOutputManager ioManager;

    @Override
    public void create() {
        ioManager = new InputOutputManager();
       
    }

    @Override
    public void render() {
        super.render();
        ioManager.getMap().render();
        ioManager.getSoundPlayer();
    }

}