/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author jword
 */
public abstract class Character {
    
    //Fields
    protected int x;
    protected int y;
    protected int size;
    protected int vx;
    protected int vy;
    private Rectangle bound;
      

    //Constructor
    public Character(int x, int y, int size) {
        this.x = (int) (Math.random()*1200);
        this.y = (int) (Math.random()*960);
        this.vx = (int) (Math.random()*5+2);
        this.vy = (int) (Math.random()*5+2);
        bound = new Rectangle(this.x, this.y, this.size, this.size);
    }
    public Rectangle getBound() {
        return bound;
    }

    public int getVx() {
        return vx;
    }

    public void setVx(int vx) {
        this.vx = vx;
    }

    public int getVy() {
        return vy;
    }

    public void setVy(int vy) {
        this.vy = vy;
    }

    public Character() {
        this(100,100,30);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public abstract void draw(Graphics g);
    
    public void update() {
        move();
        bound = new Rectangle(this.x, this.y, this.size, this.size);
    }
    
    public void move() {
        x += vx;
        y += vy;
    }
    public void die() {
        x = -500;
        y = -500;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}

