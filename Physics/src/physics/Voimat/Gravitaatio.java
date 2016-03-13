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
public class Gravitaatio implements Voima {

    private boolean kappaleetkoskevat = false;
    private PerusKappale kpl1;
    private PerusKappale kpl2;
    private double G = 10;
//          6.67  * Math.pow(10, -11);
    private double kpl1kiihtyyX;
    private double kpl2kiihtyyX;
    private double kpl1kiihtyyY;
    private double kpl2kiihtyyY;

    public Gravitaatio(PerusKappale kappale1, PerusKappale kappale2) {
        this.kpl1 = kappale1;
        this.kpl2 = kappale2;
    }

    private void laskeKiihtyvyydet() {
        double etaisyysX, etaisyysY, etaisyys, voima, osuusX, osuusY;
        etaisyysX = kpl1.getX() - kpl2.getX();
        etaisyysY = kpl1.getY() - kpl2.getY();
        etaisyys = Math.sqrt(Math.pow(etaisyysX, 2) + Math.pow(etaisyysY, 2));
        osuusX = Math.abs(etaisyysX) / (Math.abs(etaisyysX) + Math.abs(etaisyysY));
        osuusY = 1 - osuusX;
        voima = G * ((kpl1.getMassaKiloina() * kpl2.getMassaKiloina())
                / Math.pow(etaisyys, 2));

        if (etaisyys < 50) {
            kappaleetkoskevat = true;
        }

        if (etaisyysX < 0) {
            kpl1kiihtyyX = osuusX * voima / kpl1.getMassaKiloina();
            kpl2kiihtyyX = osuusX * (-1) * voima / kpl2.getMassaKiloina();
        } else {
            kpl1kiihtyyX = osuusX * (-1) * voima / kpl1.getMassaKiloina();
            kpl2kiihtyyX = osuusX * voima / kpl2.getMassaKiloina();
        }

        if (etaisyysY < 0) {
            kpl1kiihtyyY = osuusY * voima / kpl1.getMassaKiloina();
            kpl2kiihtyyY = osuusY * (-1) * voima / kpl2.getMassaKiloina();
        } else {
            kpl1kiihtyyY = osuusY * (-1) * voima / kpl1.getMassaKiloina();
            kpl2kiihtyyY = osuusY * voima / kpl2.getMassaKiloina();
        }
    }

    @Override
    public void vaikuta() {
        laskeKiihtyvyydet();
        if (kappaleetkoskevat) {
            kpl1.pysayta();
            kpl2.pysayta();
        } else {
            kpl1.kiihdytaY(kpl1kiihtyyY);
            kpl1.kiihdytaX(kpl1kiihtyyX);

            kpl2.kiihdytaY(kpl2kiihtyyY);
            kpl2.kiihdytaX(kpl2kiihtyyX);
        }

    }

}
