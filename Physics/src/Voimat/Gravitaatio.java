/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Voimat;

import physics.kappaleet.Kappale;

/**
 *
 * @author eamiller
 */
public class Gravitaatio implements Voima{
    private Kappale kpl1;
    private Kappale kpl2;
    private double G = 6.67 * Math.pow(10, -11);
    private double kpl1kiihtyyX;
    private double kpl2kiihtyyX;
    private double kpl1kiihtyyY;
    private double kpl2kiihtyyY;

    public Gravitaatio(Kappale kappale1, Kappale kappale2) {
        this.kpl1 = kappale1;
        this.kpl2 = kappale2;
    }
    
    public void laskeKiihtyvyydetY(){
        double etaisyys, voima;
        etaisyys = kpl1.getY() - kpl2.getY();
        voima = G*((kpl1.getMassaKiloina()*kpl2.getMassaKiloina())
                /Math.pow(etaisyys, 2));
        if(etaisyys < 0){
            kpl1kiihtyyY = voima/kpl1.getMassaKiloina();
            kpl2kiihtyyY = (-1) * voima/kpl2.getMassaKiloina();
        } else {
            kpl1kiihtyyY = (-1) * voima/kpl1.getMassaKiloina();
            kpl2kiihtyyY = voima/kpl2.getMassaKiloina();
        }
    }
    
    public void laskeKiihtyvyydetX(){
        double etaisyys, voima;
        etaisyys = kpl1.getX() - kpl2.getX();
        voima = G*((kpl1.getMassaKiloina()*kpl2.getMassaKiloina())
                /Math.pow(etaisyys, 2));
        if(etaisyys < 0){
            kpl1kiihtyyX = voima/kpl1.getMassaKiloina();
            kpl2kiihtyyX = (-1) * voima/kpl2.getMassaKiloina();
        } else {
            kpl1kiihtyyX = (-1) * voima/kpl1.getMassaKiloina();
            kpl2kiihtyyX = voima/kpl2.getMassaKiloina();
        }
    }

    @Override
    public void vaikuta() {
        kpl1.kiihdyY(kpl1kiihtyyY);
        kpl1.kiihdyX(kpl1kiihtyyX);
        
        kpl2.kiihdyY(kpl2kiihtyyY);
        kpl2.kiihdyX(kpl2kiihtyyX);
        
    }
    
    
    
}
