package schmuckstuecke;

import Edelsteine.Onyx;
import stuff.Edelstein;
import stuff.EdelsteinTyp;
import stuff.Material;
import stuff.Schmuck;

import java.util.ArrayList;
import java.util.Collection;

public class Ohrringe implements Schmuck {
    private Material material;
    private int materialGewicht;

    public Ohrringe() {
        this.material = Material.GOLD;
        this.materialGewicht = 10;
    }



    @Override
    public String getBezeichnung() {
        return "Ohrringe";
    }

    @Override
    public Material getMaterial() {
        return material;
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
        int gesamtwert = 0;
        for (Edelstein edelstein : getVerbauteEdelsteine()) {
            gesamtwert += edelstein.getWert();
        }
        return gesamtwert;
    }
}
