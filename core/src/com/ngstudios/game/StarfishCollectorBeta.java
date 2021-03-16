package com.ngstudios.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.graphics.GL20;

public class StarfishCollectorBeta extends Game {
    
    private Turtle turtle;
    private ActorBeta starfish;
    private ActorBeta ocean;
    private ActorBeta winMessage;
    
    private Stage mainStage;
    
    private boolean win;
    
    public void create() {
        mainStage = new Stage();
        
        ocean = new ActorBeta();
        ocean.setTexture(new Texture("water.jpg"));
        mainStage.addActor(ocean);
        
        starfish = new ActorBeta();
        starfish.setTexture (new Texture("starfish.png"));
        starfish.setPosition(380, 380);
        mainStage.addActor(starfish);
        
        turtle = new Turtle();
        turtle.setTexture(new Texture("turtle-1.png"));
        turtle.setPosition(20, 20);
        mainStage.addActor(turtle);

        winMessage = new ActorBeta();
        winMessage.setTexture(new Texture("you-win.png"));
        winMessage.setPosition(180, 180);
        winMessage.setVisible(false);
        mainStage.addActor(winMessage);

        win = false;
    }

    public void render(){
        //check user input
        mainStage.act(1/60f);

        //check win condition: turtle muss be overlapping starfish
        if (turtle.overlaps(starfish)){
            starfish.remove();
            winMessage.setVisible(true);
        }

        // clear screen
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //draw graphics
        mainStage.draw();
    }
}
