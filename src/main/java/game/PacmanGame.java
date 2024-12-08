package game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
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
