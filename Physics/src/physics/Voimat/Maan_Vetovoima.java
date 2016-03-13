/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physics.Voimat;

import physics.kappaleet.PerusKappale;

/**
 *
 * @author eamiller
 */
public class Maan_Vetovoima implements Voima{
    private PerusKappale kappale;

    public Maan_Vetovoima(PerusKappale kappale) {
        this.kappale = kappale;
    }
    
    

    @Override
    public void vaikuta() {
        kappale.kiihdytaY(1);
    }
    
}
