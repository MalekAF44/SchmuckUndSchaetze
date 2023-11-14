package stuff;

/**
 * Das stuff.Material, aus welchem stuff.Schmuck bestehen kann.
 */
public enum Material {

    GOLD(true, 1500),
    SILBER(true, 10),
    PLATIN(true, 280),
    BLECH(false, 0),
    KATZENGOLD(false,1);

    private final int preisProGramm;
    private boolean istEdel;

    Material(boolean istEdel, int preisProGramm) {
        this.istEdel = istEdel;
        this.preisProGramm = preisProGramm;
    }

    public boolean isIstEdel() {

        return istEdel;
    }

    public int getPreisProGramm() {

        return preisProGramm;
    }


}
