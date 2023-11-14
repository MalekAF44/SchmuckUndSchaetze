package stuff;

import org.reflections.Reflections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Die stuff.Schatztruhe beinhaltet eine Schatz, der aus jeweils einem Objekt von jeder Klasse besteht,
 * welche {@link Schmuck} implementieren und im Verzeichnis 'schmuckstuecke' liegen.
 */
public class Schatztruhe {

    enum Schmuckfilter{
        ALLES,
        NUR_FALSCHE,
        NUR_RICHTIGE
    }

    //TODO: Diesen Wert ändern, wenn Ihr die Tests nur für bestimmte Schmuckstücke laufen lassen wollt.
    private static final Schmuckfilter filter = Schmuckfilter.ALLES;


    public static Collection<Schmuck> getSchatz(){

        switch (filter){


            case NUR_FALSCHE:
                return getSchatzInternal().stream().filter(schmuck -> schmuck.getClass().getName().endsWith("F")).collect(Collectors.toList());
            case NUR_RICHTIGE:
                return getSchatzInternal().stream().filter(schmuck -> !schmuck.getClass().getName().endsWith("F")).collect(Collectors.toList());
            case ALLES:
            default:
                return getSchatzInternal();
        }
    }



    private static Collection<Schmuck> getSchatzInternal(){


        Reflections reflections = new Reflections("schmuckstuecke");

        Set<Class<? extends Schmuck>> allSchmuckClasses = reflections.getSubTypesOf(Schmuck.class);
        Collection<Schmuck> schmuckstuecke = new HashSet<>();
        for (Class<? extends Schmuck> schmuckKlasse : allSchmuckClasses) {
            try {
                schmuckstuecke.add(schmuckKlasse.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return schmuckstuecke;

    }
}
