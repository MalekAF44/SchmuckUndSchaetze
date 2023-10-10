package stuff;

import java.awt.*;

/**
 *
 */
public enum EdelsteinTyp {

    DIAMANT(Color.WHITE),
    SAPHIR(Color.BLUE),
    SMARAGD(Color.GREEN),
    AMETHYST(Color.MAGENTA),
    RUBIN(Color.RED);


    private final Color farbe;

    EdelsteinTyp(Color farbe){
        this.farbe = farbe;
    }

    public Color getFarbe() {
        return farbe;
    }
}
