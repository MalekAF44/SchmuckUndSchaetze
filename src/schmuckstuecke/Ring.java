package schmuckstuecke;

import Edelsteine.Blutdiamant;
import Edelsteine.Onyx;
import stuff.Edelstein;
import stuff.Material;
import stuff.Schmuck;

import java.util.ArrayList;
import java.util.Collection;

public class Ring implements Schmuck {

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

           return 50;
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
        return 1600;
    }
}

