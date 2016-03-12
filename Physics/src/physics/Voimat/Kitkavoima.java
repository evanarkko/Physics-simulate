package physics.Voimat;

import physics.kappaleet.Kappale;

/**
 *
 * @author eamiller
 */
public class Kitkavoima implements Voima {

    private Kappale kappale;

    public Kitkavoima(Kappale kappale) {
        this.kappale = kappale;
    }

    @Override
    public void vaikuta() {
        if (kappale.getLattialla()) {
            if(kappale.getNopeusX()!=0){
                kappale.setNopeusX(kappale.getNopeusX()*kappale.getKitkakerroin());
                if(Math.abs(kappale.getNopeusX()) < 0.1)kappale.setNopeusX(0);
            }
        }
    }

}
