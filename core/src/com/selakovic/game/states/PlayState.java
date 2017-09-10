package com.selakovic.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selakovic.game.MyGdxGame;
import com.selakovic.game.sprites.Bird;

public class PlayState extends State {

    private Bird mBird;


    public PlayState(GameStateManager gsm) {
        super(gsm);
        mBird = new Bird(50, 300);
        mCamera.setToOrtho(false, MyGdxGame.WIDTH/2, MyGdxGame.HEIGHT/2);
    }

    @Override
    public void handleInput() {
        if (Gdx.input.justTouched()) {

        }

    }

    @Override
    public void update(float dt) {
        handleInput();
        mBird.update(dt);

    }

    @Override
    public void render(SpriteBatch spriteBatch) {
        spriteBatch.setProjectionMatrix(mCamera.combined);
        spriteBatch.begin();
        mBird.draw(spriteBatch);
        spriteBatch.end();
    }

    @Override
    public void dispose() {

    }
}
