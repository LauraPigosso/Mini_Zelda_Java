package src;

import java.awt.*;

public class Player extends Rectangle{

    public int spd = 3;
    public boolean right, up, drow, left;

    public Player(int x, int y){
        super(x, y, 32, 32);
    }

    public void tick(){
        if (right && World.isFree(x+spd, y)){
            x+=spd;
        }else if (left && World.isFree(x-spd, y)){
            x-=spd;
        }

        if (up && World.isFree(x, y-spd)){
            y-=spd;
        }else if (drow && World.isFree(x, y+spd)){
            y+=spd;
        }
    }

    public void render(Graphics g){
        g.drawImage(Spritesheet.player_front, x, y, 32, 32, null);
    }
}