/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwars;

import java.awt.Color;
import java.awt.Graphics;


/**
 *
 * @author Spencer Atkins
 */
public class Hero extends Character {
    //Fields (Variables)
   private int health;
    //Constructor
    public Hero() {
        super();
        health = 3;
    }
     public Hero(int x, int y, Color color, int size, String name) {
        super (x, y, color, size, name);
        
    }
    
    
    //Getters 
    public int getHealth() {
        return health;
    }
    
    //Public Methods
    public void kill() {
        
    }
    public void collect() {
        
    }
    public void teleport() {
        
    }
    
    //Private Methods
    private void grow() {
       
    }
    
    private void canTeleport() {
        
    }
}
