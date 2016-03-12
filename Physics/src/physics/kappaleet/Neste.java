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
public abstract class Neste {
    double tiheys;
    double tilavuus;
    double massa;
    int korkeus;

    public Neste(int korkeus) {
        this.korkeus = korkeus;
    }
    
    public void luo(Graphics g){
        g.fillRect(0, 671, 1270, 671 - korkeus);
    }
    
}
