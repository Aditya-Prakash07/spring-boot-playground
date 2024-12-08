package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;
import com.in28minutes.learnspringframework.game.MarioGame;
public class App01GamingBasicJava {
    public static void main(String[] args) {
       //var game = new MarioGame();
        var game = new SuperContraGame();
       // var game = new PacmanGame(); // Object Creation
        var gameRunner = new GameRunner(game); // object creation plus wiring of dependencies
        // game is dependency of gameRunner class which wired or injected over here
        gameRunner.run();
    }
}
