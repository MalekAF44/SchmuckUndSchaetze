package schmuckstuecke;

import Edelsteine.Topas;
import stuff.Edelstein;
import stuff.Material;
import stuff.Schmuck;

import java.util.ArrayList;
import java.util.Collection;

public class AnstecknadelF implements Schmuck {


    @Override
    public String getBezeichnung() {
        return "Anstecknadel aus Topas und Gold";
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD;
    }

    @Override
    public int getMaterialGewicht() {
        return 20;
    }

    @Override
    public int getKatalognummer() {
        return 7873;
    }

    @Override
    public Collection<Edelstein> getVerbauteEdelsteine() {
        ArrayList<Edelstein> edelsteine = new ArrayList<>();
        Topas topas = new Topas();
        edelsteine.add(topas);
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

