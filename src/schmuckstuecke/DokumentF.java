package schmuckstuecke;

import Edelsteine.Blutdiamant;
import Edelsteine.Onyx;
import stuff.Edelstein;
import stuff.Material;
import stuff.Schmuck;

import java.util.ArrayList;
import java.util.Collection;

public class DokumentF implements Schmuck {


    @Override
    public String getBezeichnung() {
        return "Dokument mit wertvollen Informationen...";
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
        return 346;
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
        int i = 0;
        for (Edelstein edelstein : getVerbauteEdelsteine()) {//rechnet den Wert aller Edelsteine zusammen
            i += edelstein.getWert();
        }

        Material material = getMaterial();
        i += material.getPreisProGramm() * getMaterialGewicht();//rechnet den wert vom material oben drauf

        return i;
    }
}

