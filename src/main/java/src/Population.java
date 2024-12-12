package src;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Population {
    private ArrayList<Personne> listePersonne;
    private int idPopulation;

    public Population(ArrayList<Personne> listePersonne, int idPopulation) {
        this.listePersonne = listePersonne;
        this.idPopulation = idPopulation;
    }

    public ArrayList<Personne> getListePersonne() {
        return listePersonne;
    }

    public void setListePersonne(ArrayList<Personne> listePersonne) {
        this.listePersonne = listePersonne;
    }

    public int getIdPopulation() {
        return idPopulation;
    }

    public void setIdPopulation(int idPopulation) {
        this.idPopulation = idPopulation;
    }
}
