package physics.kappaleet;

import java.awt.Graphics;
import physics.logiikka.Aine;

public abstract class Kappale {
    
    boolean lattialla;
    double tilavuusKuutioina;
    double massaKiloina;
    Aine aine;
    double x = 100;
    double y = 100;
    double nopeusX = 0.0;
    double nopeusY = 0.0;
    double kiihtyvyysX;
    double kiihtyvyysY;

    double kimmoisuus;
    double kitkakerroin;

    public Kappale(Aine aine, double tilavuusKuutioina) {
        this.aine = aine;
        this.tilavuusKuutioina = tilavuusKuutioina;
        this.massaKiloina = this.aine.getTiheys() * this.tilavuusKuutioina;
        this.kimmoisuus = 0.75;
    }

    public Kappale(double massa) {
        this.massaKiloina = massa;
        this.kimmoisuus = 0.75;
        this.kitkakerroin = 0.99;
    }

    public void asetaKoordinaatit(int x, int y) {
        this.x = x;
        this.y = y;
        if(y<671)
            lattialla = false;
                else
            lattialla = true;
    }

    public void liiku() {
        if (y > 671) {
            //menettää nopeutta kimmoisuuden mukaan täällä
            nopeusY = Math.abs(nopeusY) * (-1) * this.kimmoisuus;
            if (Math.abs(nopeusY) < 5) {
//                System.out.println("nopeusY meni nollaan");
                nopeusY = 0;
                lattialla = true;
            }
        } else if (y < 0) {
            nopeusY = Math.abs(nopeusY);
        }
        if (x > 1270) {
            nopeusX = Math.abs(nopeusX) * (-1);
        } else if (x < 0) {
            nopeusX = Math.abs(nopeusX);
        }

        y += nopeusY;
        x += nopeusX;
    }

    private int laskemitat;

    public void pysayta() {
        nopeusX = 0;
        nopeusY = 0;
    }

    public void kiihdytaX(double nopeudenmuutos) {
        this.nopeusX += nopeudenmuutos;
    }

    public void kiihdytaY(double nopeudenmuutos) {
        this.nopeusY += nopeudenmuutos;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getMassaKiloina() {
        return massaKiloina;
    }

    public void luo(Graphics graphics) {

    }

    public double getKitkakerroin() {
        return kitkakerroin;
    }

    public void setKitkakerroin(double kitkakerroin) {
        this.kitkakerroin = kitkakerroin;
    }

    public double getNopeusX() {
        return nopeusX;
    }

    public double getNopeusY() {
        return nopeusY;
    }

    public void setNopeusX(double nopeusX) {
        this.nopeusX = nopeusX;
    }

    public void setNopeusY(double nopeusY) {
        this.nopeusY = nopeusY;
    }
    
    public boolean getLattialla(){
        return this.lattialla;
    }

}
