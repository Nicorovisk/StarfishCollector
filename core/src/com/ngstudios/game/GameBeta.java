package com.ngstudios.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public abstract class GameBeta extends Game {

    protected Stage mainStage;

    public void create() {
        mainStage = new Stage();
        initialize();
    }

    public abstract void initialize();

    public void render(){

        float dt = Gdx.graphics.getDeltaTime();

        //act method
        mainStage.act(dt);

        // defined by user
        update(dt);

        //clear the screen
        Gdx.gl.glClearColor(0,0,0,1);

        //draw the graphics
        mainStage.draw();
    }

    public abstract void update(float dt);

}
