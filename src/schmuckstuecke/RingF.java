package schmuckstuecke;

import Edelsteine.Blutdiamant;
import stuff.Edelstein;
import stuff.Material;
import stuff.Schmuck;

import java.util.ArrayList;
import java.util.Collection;

public class RingF implements Schmuck {

    private double durchmesser;

    @Override
    public String getBezeichnung() {
        return "Ring";
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD;
    }

    @Override
    public int getMaterialGewicht() {

           return -50;
        }


    @Override
    public int getKatalognummer() {
        return 2277;
    }

    @Override
    public Collection<Edelstein> getVerbauteEdelsteine() {

        ArrayList<Edelstein> edelsteine = new ArrayList<>();
        Blutdiamant blutdiamant = new Blutdiamant();
        edelsteine.add(blutdiamant);
        return edelsteine;
    }

    @Override
    public int getGesamtwertInEuro() {
        int i = 0;
        for(Edelstein edelstein : getVerbauteEdelsteine()){//rechnet den Wert aller Edelsteine zusammen
            i += edelstein.getWert();
        }

        Material material = getMaterial();
        i += material.getPreisProGramm() * getMaterialGewicht();//rechnet den wert vom material oben drauf

        return i;
    }
}

