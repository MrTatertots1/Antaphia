package MainMenu;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class MainMenu extends JPanel implements Runnable{

    static final int SCREEN_HEIGHT = 500;
    static final int SCREEN_WIDTH = (int)(SCREEN_HEIGHT * (1.77778));
    
    static final Dimension SCREEN_SIZE = new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT);

    Thread menuThread;

    JButton start;
    JButton quit;

    public MainMenu(){
        this.setFocusable(true);
        this.setPreferredSize(SCREEN_SIZE);
        this.setBackground(Color.black);

        menuThread = new Thread(this);

        start = new JButton("Start Game");
        this.add(start);


        quit = new JButton("Quit Game");
        this.add(quit);
    }

    public void run(){
        //game loop
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000/amountOfTicks;
        double delta = 0;
        while(true){
            long now = System.nanoTime();
            delta += (now - lastTime)/ns;
            lastTime = now;
            if (delta >= 1){
                repaint();
                delta--;
            }
        }
    }
}
