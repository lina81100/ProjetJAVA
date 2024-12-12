package src;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Simulation {
    private int nbCycles;
    private ArrayList<Cycle> Cycles;
    private Population pop;
    private Epidemie maladie;

    //méthodes
    public boolean lancer() {
        //on créait nbCycles cycles
        Cycles.add(new Cycle(maladie, 0, pop));
        for (int i = 1; i <= nbCycles; i++) {

            Cycles.add(new Cycle(maladie, i + 1, pop));
            Cycles.getLast().actualisationContamination();
            Cycles.getLast().bilan();

        }
        return true;
    }
    //Constructeur
    //Lors de la création, on veut juste un nombre de cycles
    public Simulation( int nbCycles, Population pop, Epidemie maladie ) {
        this.nbCycles = nbCycles;
        this.pop = pop;
        this.maladie = maladie;
        ArrayList<Cycle> Cycles = new ArrayList<>();
        this.Cycles = Cycles;
    }

    //toString
    public ArrayList<Cycle> compteRendu(){
        String chaine = "";
        return Cycles;
    }
}
