package rockpaperscissors;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author jword
 */
public class Rock extends Character {
private int size;
private Color color;
private ImageIcon ii;
private Image img;
private Rectangle bound;


public Rock(int size) {
super();
this.size = size;
this.color = new Color(255,0,100,100);
this.ii = new ImageIcon(getClass().getResource("/images/Rock.png"));
this.img = ii.getImage();
bound = new Rectangle(this.x, this.y, this.size, this.size);
}

public Rock() {
this(50);
}

@Override
public void draw(Graphics g) {
//g.setColor(color);
//g.fillOval(x, y, size, size);
g.drawImage(img, x, y, size, size, null);
Graphics2D g2d = (Graphics2D) g;

}
}