package com.in28minutes.learnspringframework.game;

public class MarioGame implements GamingConsole {

    public void up(){
        System.out.println("jump");
    }
    public void down(){
        System.out.println("Go into a Hole");
    }
    public void left(){
        System.out.println("Go Back");
    }
    public void right(){
        System.out.println("Accelerate");
    }


}