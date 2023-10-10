package schmuckstuecke;

import stuff.Edelstein;
import stuff.Material;
import stuff.Schmuck;

import java.util.Collection;

public class Armreif implements Schmuck {
    @Override
    public String getBezeichnung() {
        return "Armreif von Queen-Elizabeth";
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD;
    }

    @Override
    public int getMaterialGewicht() {
        return 2;
    }

    @Override
    public int getKatalognummer() {
        return 5;
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
