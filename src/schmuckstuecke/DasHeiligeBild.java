package schmuckstuecke;

import Edelsteine.Zenyte;
import stuff.Edelstein;
import stuff.Material;
import stuff.Schmuck;

import java.util.ArrayList;
import java.util.Collection;

public class DasHeiligeBild implements Schmuck {


        @Override
        public String getBezeichnung() {
            return "Das heilige Bild";
        }

        @Override
        public Material getMaterial() {
            return Material.GOLD;
        }

        @Override
        public int getMaterialGewicht() {
            return 100;
        }

        @Override
        public int getKatalognummer() {
            return -4;
        }

    @Override
    public Collection<Edelstein> getVerbauteEdelsteine() {
        return null;
    }


    @Override
        public int getGesamtwertInEuro() {
            return 150000;
        }
    }


