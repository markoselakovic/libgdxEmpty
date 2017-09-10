package com.selakovic.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by selak on 4.9.17..
 */

public class GameStateManager {

    private Stack<State> mStates;

    public GameStateManager() {
        mStates = new Stack<State>();
    }

    public void push(State state) {
        mStates.push(state);
    }

    public void pop() {
        mStates.pop();
    }

    public void set(State state) {
        mStates.pop();
        mStates.push(state);
    }

    public void update(float dt) {
        mStates.peek().update(dt);
    }

    public void render(SpriteBatch sb) {
        mStates.peek().render(sb);
    }

}
