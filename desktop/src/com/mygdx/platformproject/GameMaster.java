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
    private SpriteBatch batch;
    private Texture bucketImage;
    private Rectangle player;

    @Override
    public void create() {
        ioManager = new InputOutputManager();
        
        /* for testing camera and player movement in map, can probably move to Player class */
        batch = new SpriteBatch();
        bucketImage = new Texture(Gdx.files.internal("bucket.png"));
        player = new Rectangle();
        player.x = 0;
        player.y = 30;
        player.width = 25;
        player.height = 25;
        ioManager.getMap().setPlayer(player);
    }

    @Override
    public void render() {
        super.render();
        ioManager.getMap().render();
        ioManager.getSoundPlayer();

        batch.begin();
        batch.draw(bucketImage, player.x, player.y, player.width, player.height);
        batch.end();

        if (Gdx.input.isKeyPressed(Keys.LEFT)) player.x -= 200 * Gdx.graphics.getDeltaTime();
        if (Gdx.input.isKeyPressed(Keys.RIGHT)) player.x += 200 * Gdx.graphics.getDeltaTime();
        if (Gdx.input.isKeyPressed(Keys.DOWN)) player.y -= 200 * Gdx.graphics.getDeltaTime();
        if (Gdx.input.isKeyPressed(Keys.UP)) player.y += 200 * Gdx.graphics.getDeltaTime();
    }

}