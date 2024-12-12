package src;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello World");
        Personne pers1 = new Personne(1, false, 2.0, 3.0, EtatSante.Sain, TypePersonne.Sensible, Vaccin.Aucun);
        Personne pers2 = new Personne(2, true, 5.0, 3.0, EtatSante.Sain, TypePersonne.Sensible, Vaccin.Aucun);
        Personne pers3 = new Personne(3, true, 4.0, 7.0, EtatSante.Sain, TypePersonne.Neutre, Vaccin.Aucun);
        Personne pers4 = new Personne(4, false, 1.0, 2.0, EtatSante.Sain, TypePersonne.Sensible, Vaccin.Aucun);
        Personne pers5 = new Personne(5, true, 5.0, 4.0, EtatSante.Sain, TypePersonne.Neutre, Vaccin.Aucun);
        Personne pers6 = new Personne(6, true, 3.0, 9.0, EtatSante.Sain, TypePersonne.Sensible, Vaccin.Aucun);
        Personne pers7 = new Personne(7, true, 1.0, 2.0, EtatSante.Sain, TypePersonne.Neutre, Vaccin.DeuxDoses);
        Personne pers8 = new Personne(8, true, 6.0, 1.0, EtatSante.Sain, TypePersonne.Resistante, Vaccin.UneDose);
        Personne pers9 = new Personne(9, true, 4.0, 2.0, EtatSante.Sain, TypePersonne.Neutre, Vaccin.Aucun);
        Personne pers10 = new Personne(10, true, 1.0, 4.0, EtatSante.Sain, TypePersonne.Sensible, Vaccin.Aucun);


        pers4.setEtat(EtatSante.Malade);

        ArrayList<Personne> listePersonnes = new ArrayList<>();

        Population pop = new Population(listePersonnes, 1);

        listePersonnes.add(pers1);
        listePersonnes.add(pers2);
        listePersonnes.add(pers3);
        listePersonnes.add(pers4);
        listePersonnes.add(pers5);
        listePersonnes.add(pers6);
        listePersonnes.add(pers7);
        listePersonnes.add(pers8);
        listePersonnes.add(pers9);
        listePersonnes.add(pers10);

        Epidemie maladie = new Epidemie(1, 0.9F, 0.8F, 2, 0.4F , 0.1F , 10, 0.5F);
        Simulation simulation = new Simulation( 2, pop, maladie);
        simulation.lancer();
        System.out.println( simulation.compteRendu() );



    }
}
