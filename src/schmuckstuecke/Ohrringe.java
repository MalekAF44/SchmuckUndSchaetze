package schmuckstuecke;

import Edelsteine.Onyx;
import stuff.Edelstein;
import stuff.EdelsteinTyp;
import stuff.Material;
import stuff.Schmuck;

import java.util.ArrayList;
import java.util.Collection;

public class Ohrringe implements Schmuck {
    @Override
    public String getBezeichnung() {
        return "Ohrringe";
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD;
    }

    @Override
    public int getMaterialGewicht() {

        return 10;
    }

    @Override
    public int getKatalognummer() {
        return 3399;
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
        for(Edelstein edelstein : getVerbauteEdelsteine()){//rechnet den Wert aller Edelsteine zusammen
            i += edelstein.getWert();
        }

        Material material = getMaterial();
        i += material.getPreisProGramm() * getMaterialGewicht();//rechnet den wert vom material oben drauf

        return i;
    }
}
