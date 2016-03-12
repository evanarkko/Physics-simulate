/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physics.Voimat;

import physics.kappaleet.Kappale;

/**
 *
 * @author eamiller
 */
public class Maan_Vetovoima implements Voima{
    private Kappale kappale;

    public Maan_Vetovoima(Kappale kappale) {
        this.kappale = kappale;
    }
    
    

    @Override
    public void vaikuta() {
        kappale.kiihdytaY(1);
    }
    
}
