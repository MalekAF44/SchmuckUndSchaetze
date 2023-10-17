package schmuckstuecke;

import Edelsteine.Blutdiamant;
import Edelsteine.Zenyte;
import stuff.Edelstein;
import stuff.EdelsteinTyp;
import stuff.Material;
import stuff.Schmuck;

import java.util.ArrayList;
import java.util.Collection;

public class AmuletderFolter implements Schmuck{

    @Override
    public String getBezeichnung() {
        return "Das Amulett der Folter verleiht dem Träger die Macht der Folter-Techniken";
    }

    @Override
    public Material getMaterial() {
        return Material.KATZENGOLD;
    }

    @Override
    public int getMaterialGewicht() {
        return 100;
    }

    @Override
    public int getKatalognummer() {
        return 44;
    }

    @Override
    public Collection<Edelstein> getVerbauteEdelsteine() {
        ArrayList<Edelstein> edelsteine = new ArrayList<>();
        Zenyte zenyte = new Zenyte();
        edelsteine.add(zenyte);
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
