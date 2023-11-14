package Edelsteine;

import stuff.Edelstein;
import stuff.EdelsteinTyp;

public class Topas implements Edelstein {
    @Override
    public int getGewichtInKarat() {
        return -300;
    }

    @Override
    public EdelsteinTyp getTyp() {
        return EdelsteinTyp.DIAMANT;
    }

    @Override
    public int getWert() {
        return 150000;
    }
}
