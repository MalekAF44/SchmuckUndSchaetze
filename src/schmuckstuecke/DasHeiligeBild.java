package schmuckstuecke;

import Edelsteine.Onyx;
import Edelsteine.Zenyte;
import stuff.Edelstein;
import stuff.Material;
import stuff.Schmuck;

import java.util.ArrayList;
import java.util.Collection;

public class DasHeiligeBild implements Schmuck {


    @Override
    public String getBezeichnung() {
        return "Das heilige Bild";
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD;
    }

    @Override
    public int getMaterialGewicht() {
        return 100;
    }

    @Override
    public int getKatalognummer() {
        return 4;
    }

    @Override
    public Collection<Edelstein> getVerbauteEdelsteine() {
        ArrayList<Edelstein> edelsteine = new ArrayList<>();
        Onyx onyxdiamant = new Onyx();
        Zenyte zenyte = new Zenyte();
        edelsteine.add(zenyte);
        edelsteine.add(onyxdiamant);
        return edelsteine;
    }

    @Override
    public int getGesamtwertInEuro() {
        int i = 0;
        for (Edelstein edelstein : getVerbauteEdelsteine()) {//rechnet den Wert aller Edelsteine zusammen
            i += edelstein.getWert();
        }

        Material material = getMaterial();
        i += material.getPreisProGramm() * getMaterialGewicht();//rechnet den wert vom material oben drauf

        return i;
    }
}


