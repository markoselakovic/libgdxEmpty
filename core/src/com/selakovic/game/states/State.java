package com.selakovic.game.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public abstract class State {

    protected OrthographicCamera mCamera;
    protected Vector3 mMouse;
    protected GameStateManager mGameStateManager;

    public State(GameStateManager gsm) {
        mGameStateManager = gsm;
        mCamera = new OrthographicCamera();
        mMouse = new Vector3();
    }

    public abstract void handleInput();

    public abstract void update(float dt);

    public abstract void render(SpriteBatch spriteBatch);

    public abstract void dispose();
}
