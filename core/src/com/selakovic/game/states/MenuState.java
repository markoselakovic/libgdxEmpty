package com.selakovic.game.states;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selakovic.game.MyGdxGame;

/**
 * Created by selak on 4.9.17..
 */

public class MenuState extends State {

    private Texture mBackground;
    private Texture mPlayButton;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        mBackground = new Texture("bg.png");
        mPlayButton = new Texture("playbtn.png");
    }

    @Override
    public void handleInput() {
        if (Gdx.input.justTouched()) {
            mGameStateManager.set(new PlayState(mGameStateManager));
            dispose();
        }

    }

    @Override
    public void update(float dt) {
        handleInput();

    }

    @Override
    public void render(SpriteBatch spriteBatch) {
        spriteBatch.begin();
        spriteBatch.draw(mBackground, 0,0, MyGdxGame.WIDTH, MyGdxGame.HEIGHT);
        spriteBatch.draw(mPlayButton, MyGdxGame.WIDTH/2 - mPlayButton.getWidth()/2, MyGdxGame.HEIGHT/2 - mPlayButton.getHeight()/2);
        spriteBatch.end();

    }

    @Override
    public void dispose() {
        mPlayButton.dispose();
        mBackground.dispose();
    }
}
