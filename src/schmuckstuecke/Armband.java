package schmuckstuecke;

import stuff.Edelstein;
import stuff.Material;
import stuff.Schmuck;

import java.util.Collection;

public class Armband implements Schmuck {


    @Override
    public String getBezeichnung() {
        return "Armband";
    }

    @Override
    public Material getMaterial() {
        return Material.SILBER;
    }

    @Override
    public int getMaterialGewicht() {


        return 20;
    }

    @Override
    public int getKatalognummer() {
        return 4466;
    }

    @Override
    public Collection<Edelstein> getVerbauteEdelsteine() {

        return null;
    }

    @Override
    public int getGesamtwertInEuro() {

        return 200;
    }
}
