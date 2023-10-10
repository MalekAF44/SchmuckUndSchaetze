package schmuckstuecke;

import stuff.Edelstein;
import stuff.Material;
import stuff.Schmuck;

import java.util.Collection;

public class RiotAnhaenger implements Schmuck {
    @Override
    public String getBezeichnung() {
        return "Riot Gun Buddy";
    }

    @Override
    public Material getMaterial() {
        return Material.BLECH;
    }

    @Override
    public int getMaterialGewicht() {
        return 0;
    }

    @Override
    public int getKatalognummer() {
        return 56876;
    }

    @Override
    public Collection<Edelstein> getVerbauteEdelsteine() {
        return ;
    }

    @Override
    public int getGesamtwertInEuro() {
        return 5000;
    }
}
