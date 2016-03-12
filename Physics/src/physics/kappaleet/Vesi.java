/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physics.kappaleet;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author eamiller
 */
public class Vesi extends Neste{
    
    public Vesi(int korkeus) {
        super(korkeus);
        tilavuus = 1270 * korkeus; //unit pix^3
        massa = tilavuus; //tai jtn
    }

    @Override
    public void luo(Graphics g) {
        g.setColor(Color.blue);
        super.luo(g); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
