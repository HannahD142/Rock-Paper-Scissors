/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author jword
 */
public class Arena extends JPanel {

    private Timer timer;
    private static ArrayList<Character> rocks;
    private static ArrayList<Character> papers;
    private static ArrayList<Character> scissorss;

        
    public Arena() {
        super();
        setSize(1200, 960);
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 1000, 1000/24);
        rocks = new ArrayList<>();
        papers = new ArrayList<>();
        scissorss = new ArrayList<>();
        for (int i = 0; i<20; i++){
            rocks.add(new Rock() );
            papers.add(new Paper());
            scissorss.add(new Scissors());
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(Character character : rocks){
            character.draw(g);
        }    
        for(Character character : papers){
            character.draw(g);
        }
        for(Character character : scissorss){
            character.draw(g);
        }
    }
    
    private class ScheduleTask extends TimerTask {
    
        @Override
        public void run() {
           for(Character rock : rocks){
               wallCollisions(rock);
               rock.update();
             for(Character scissors : scissorss){  
               collisionDetection(rock, scissors);
             }
        }
           for(Character paper : papers){
               wallCollisions(paper);
               paper.update();
               for(Character rock : rocks){  
               collisionDetection(paper, rock);
             }
        }
           for(Character scissors : scissorss){
               wallCollisions(scissors);
               scissors.update();
               for(Character paper : papers){  
               collisionDetection(scissors, paper);
             }        }
            repaint();
        }
    }
    
   private void wallCollisions(Character c) {
       
        if (c.getX() <= 0 || c.getX() + 30 >= 1200){
            c.setVx(-c.getVx());
        }
        if (c.getY() <= 0 || c.getY() + 30 >= 960){
            c.setVy(-c.getVy());
        }
    } 
       private void collisionDetection(Character c1, Character c2) {
            if (c1.getX() + c1.getSize() > c2.getX() 
            && c1.getX() < c2.getX() + c2.getSize()
            && c1.getY() + c1.getSize()> c2.getY()
            && c1.getY() < c2.getY() + c2.getSize()){
                c2.die();
            }
    }

    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            
        }
    }
    
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            
            
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            
            
        if (e.getKeyCode() == KeyEvent.VK_UP)
            
            
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
            
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            
        }
            
    }   
    
    
    
    
    
}