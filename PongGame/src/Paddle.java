import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle {

    int id;
    int yVelocity;
    int speed = 17;

    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.id = id;

    }

    public void keyPressed(KeyEvent e) {
        switch (id) {
            case 1:
                ;
                if (e.getKeyChar() == KeyEvent.VK_W) {
                    setYDirection(-speed);
                    move();
                }
                if (e.getKeyChar() == KeyEvent.VK_S) {
                    setYDirection(speed);
                    move();
                }
                break;
            case 2:
                ;
                if (e.getKeyChar() == KeyEvent.VK_I) {
                    setYDirection(-speed);
                    move();
                }
                if (e.getKeyChar() == KeyEvent.VK_K) {
                    setYDirection(speed);
                    move();
                }
                break;

        }
    }

    public void keyReleased(KeyEvent e) {
        switch (id) {
            case 1:
                ;
                if (e.getKeyChar() == KeyEvent.VK_W) {
                    setYDirection(0);
                    move();
                }
                if (e.getKeyChar() == KeyEvent.VK_S) {
                    setYDirection(0);
                    move();
                }
                break;
            case 2:

                if (e.getKeyChar() == KeyEvent.VK_I) {
                    setYDirection(0);
                    move();
                }
                if (e.getKeyChar() == KeyEvent.VK_K) {
                    setYDirection(0);
                    move();
                }
                break;

        }

    }

    public void setYDirection(int yDirection) {
        yVelocity = yDirection;

    }

    public void move() {
        y += yVelocity;


    }

    public void draw(Graphics g) {
        if (id == 1)
            g.setColor(Color.WHITE);
        else
            g.setColor(Color.WHITE);
        g.fillRect(x, y, width, height);


    }
}


