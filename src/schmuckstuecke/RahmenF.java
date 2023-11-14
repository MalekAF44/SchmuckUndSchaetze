package schmuckstuecke;

import Edelsteine.Onyx;
import stuff.Edelstein;
import stuff.Material;
import stuff.Schmuck;

import java.util.ArrayList;
import java.util.Collection;

public class RahmenF implements Schmuck {


    @Override
    public String getBezeichnung() {
        return "Sehr alter Bilderrahmen";
    }

    @Override
    public Material getMaterial() {
        return Material.PLATIN;
    }

    @Override
    public int getMaterialGewicht() {
        return 4000;
    }

    @Override
    public int getKatalognummer() {
        return 346;
    }

    @Override
    public Collection<Edelstein> getVerbauteEdelsteine() {
        ArrayList<Edelstein> edelsteine = new ArrayList<>();
        Onyx onyxdiamant = new Onyx();


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

