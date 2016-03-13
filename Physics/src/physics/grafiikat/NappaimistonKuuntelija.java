/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physics.grafiikat;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import physics.kappaleet.Hahmo;
import physics.kappaleet.Pallo;

public class NappaimistonKuuntelija implements KeyListener {

    private Piirtoalusta piirtoalusta;
    private Hahmo hahmo;

    public NappaimistonKuuntelija(Piirtoalusta alusta, Hahmo hahmo) {
        this.piirtoalusta = alusta;
        this.hahmo = hahmo;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            hahmo.siirry(0, -5);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hahmo.siirry(0, 5);
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (hahmo.getX() > 5) {
                hahmo.setMenosuunta(-1);
                hahmo.siirry(-5, 0);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (hahmo.getX() < 1270) {
                hahmo.setMenosuunta(1);
                hahmo.siirry(5, 0);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
        Pallo pallo = new Pallo(100);
        pallo.asetaKoordinaatit(hahmo.getX(), hahmo.getY());
        pallo.kiihdytaX(4*hahmo.getMenosuunta());
        if (e.getKeyChar() == 's') {
            piirtoalusta.lisaaKappale(pallo);
        }
    }
}
