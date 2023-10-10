package schmuckstuecke;

import Edelsteine.Blutdiamant;
import stuff.Edelstein;
import stuff.Material;
import stuff.Schmuck;

import java.util.ArrayList;
import java.util.Collection;

public class Krone implements Schmuck {
    @Override
    public String getBezeichnung() {
        return "Die schönste Krone";
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD;
    }

    @Override
    public int getMaterialGewicht() {
        return 4;
    }

    @Override
    public int getKatalognummer() {
        return 2;
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
        return 1000000;
    }
}
