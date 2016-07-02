/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physics.grafiikat;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import physics.kappaleet.Pelihahmo;
import physics.kappaleet.Kuutio;
import physics.kappaleet.Pallo;

public class NappaimistonKuuntelija implements KeyListener {

    private Piirtoalusta piirtoalusta;
    private Pelihahmo hahmo;

    public NappaimistonKuuntelija(Piirtoalusta alusta, Pelihahmo hahmo) {
        this.piirtoalusta = alusta;
        this.hahmo = hahmo;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                hahmo.siirry(0, -10);
                break;
            case KeyEvent.VK_DOWN:
                hahmo.siirry(0, 10);
                break;
            case KeyEvent.VK_LEFT:
                if (hahmo.getX() > 5) {
                    hahmo.setMenosuunta(-1);
                    hahmo.siirry(-10, 0);
                }   break;
            case KeyEvent.VK_RIGHT:
                if (hahmo.getX() < 1270) {
                    hahmo.setMenosuunta(1);
                    hahmo.siirry(10, 0);
                }   break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                hahmo.siirry(0, -10);
                break;
            case KeyEvent.VK_DOWN:
                hahmo.siirry(0, 10);
                break;
            case KeyEvent.VK_LEFT:
                if (hahmo.getX() > 5) {
                    hahmo.setMenosuunta(-1);
                    hahmo.siirry(-10, 0);
                }   break;
            case KeyEvent.VK_RIGHT:
                if (hahmo.getX() < 1270) {
                    hahmo.setMenosuunta(1);
                    hahmo.siirry(10, 0);
                }   break;
            default:
                break;
        }
                
    }

    @Override
    public void keyTyped(KeyEvent e) {
        Pallo pallo = new Pallo(100);
        pallo.asetaKoordinaatit(hahmo.getX(), hahmo.getY());
        Kuutio kuutio = new Kuutio(10);
        kuutio.asetaKoordinaatit(hahmo.getX(), hahmo.getY());
        switch (e.getKeyChar()) {
            case 'a':
                piirtoalusta.lisaaKappale(kuutio);
                break;
            case 's':
                pallo.kiihdytaX(8 * hahmo.getMenosuunta());
                piirtoalusta.lisaaKappale(pallo);
                break;
            case 'd':
                pallo.kiihdytaX(14 * hahmo.getMenosuunta());
                piirtoalusta.lisaaKappale(pallo);
                break;
            default:
                break;
        }
        
    }
}
