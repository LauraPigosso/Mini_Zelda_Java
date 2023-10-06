package src;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Spritesheet {

    public static BufferedImage spritesheet;
    public static BufferedImage []player_front;

    public Spritesheet() {
        try {
            spritesheet = ImageIO.read(getClass().getResource("../res/spritesheet.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        player_front = new BufferedImage[3];
        player_front[0] = Spritesheet.getSprite(x,y,width, height)
    }
    public static BufferedImage getSprite(int x, int y, int width, int height) {
        return spritesheet.getSubimage(x, y, width, height);
    }
}