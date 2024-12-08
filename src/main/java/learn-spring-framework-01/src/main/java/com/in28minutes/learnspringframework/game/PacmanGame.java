package com.in28minutes.learnspringframework.game;

public class PacmanGame implements GamingConsole {
    public void up(){
        System.out.println("pacman move up");
    }


    public void down() {
        System.out.println("pacman move down");
    }


    public void left() {
        System.out.println("pacman move left");
    }


    public void right() {
        System.out.println("pacman move right");
    }
}
