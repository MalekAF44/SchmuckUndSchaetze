package schmuckstuecke;

import Edelsteine.titanium;
import stuff.Edelstein;
import stuff.Material;
import stuff.Schmuck;

import java.util.ArrayList;
import java.util.Collection;

public class RolexF implements Schmuck {
    @Override
    public String getBezeichnung() {
        return "";
    }

    @Override
    public Material getMaterial() {
        return Material.BLECH;
    }

    @Override
    public int getMaterialGewicht() {
        return -600;
    }

    @Override
    public int getKatalognummer() {
        return 44;
    }

    @Override
    public Collection<Edelstein> getVerbauteEdelsteine() {
        ArrayList<Edelstein> edelsteine = new ArrayList<>();
        titanium titanium = new titanium();
        edelsteine.add(titanium);
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
