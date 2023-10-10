package Edelsteine;

import stuff.Edelstein;
import stuff.EdelsteinTyp;

public class Blutdiamant implements Edelstein {
    @Override
    public int getGewichtInKarat() {
        return 3;
    }

    @Override
    public EdelsteinTyp getTyp() {
        return EdelsteinTyp.DIAMANT;
    }

    @Override
    public int getWert() {
        return 300000;
    }
}
