package com.selakovic.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selakovic.game.states.GameStateManager;
import com.selakovic.game.states.MenuState;

public class MyGdxGame extends ApplicationAdapter {

	public static final int WIDTH = 480;
	public static final int HEIGHT = 800;
	public static final String TITLE = "Flappy bird";
	private GameStateManager mGameStateManager;

	private SpriteBatch mBatch;
	Texture img;
	
	@Override
	public void create () {
		mBatch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		mGameStateManager = new GameStateManager();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		mGameStateManager.push(new MenuState(mGameStateManager));
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		mGameStateManager.update(Gdx.graphics.getDeltaTime());
		mGameStateManager.render(mBatch);
//		mBatch.begin();
//		mBatch.draw(img, 0, 0);
//		mBatch.end();
	}
	
	@Override
	public void dispose () {
		mBatch.dispose();
		img.dispose();
	}
}
