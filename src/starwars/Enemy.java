/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwars;

import java.awt.Color;

/**
 *
 * @author Spencer Atkins
 */
public class Enemy extends Character {
    public Enemy () {
        super();
    }
       public Enemy (int x, int y, Color color, int size, String name) {
           super (x, y, color, size, name); 
           
       }
    @Override
    public void update() {
        super.setDX( (int) (Math.random()*3) - 2 );
        super.setDY( (int) (Math.random()*3) - 2 );
        super.update();
    }
}
 
