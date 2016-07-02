/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physics.kappaleet;

import java.awt.Graphics;

/**
 *
 * @author eamiller
 */
public class Vihollinen extends Pelihahmo{
    
    public Vihollinen(int x, int y) {
        super(x, y);
    }
    
    public void luo(Graphics g){
        g.fillRoundRect(x, y, 20, 20, 10, 10);
    }
    
}
