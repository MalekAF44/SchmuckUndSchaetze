package schmuckstuecke;

import stuff.Edelstein;
import stuff.EdelsteinTyp;
import stuff.Material;
import stuff.Schmuck;

import java.util.Collection;

public class Halskette implements Schmuck {
    @Override
    public String getBezeichnung() {
        return null;
    }

    @Override
    public Material getMaterial() {
        return null;
    }

    @Override
    public int getMaterialGewicht() {
        return 0;
    }

    @Override
    public int getKatalognummer() {
        return 0;
    }

    @Override
    public Collection<Edelstein> getVerbauteEdelsteine() {
        return null;
    }

    @Override
    public int getGesamtwertInEuro() {
        return 0;
    }
}
