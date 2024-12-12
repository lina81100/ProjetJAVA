package src;

import javax.swing.*;
import java.util.ArrayList;

public class MapSimulation {
    public static void main(String[] args) {
        ArrayList<Personne> personnes = new ArrayList<>();
        // Ajout de 15 personnes
        personnes.add(new Personne(1, true, 2.0, 3.0, EtatSante.Sain, TypePersonne.Sensible, Vaccin.Aucun));
        personnes.add(new Personne(2, false, 5.0, 4.0, EtatSante.Malade, TypePersonne.Neutre, Vaccin.UneDose));
        personnes.add(new Personne(3, false, 7.0, 7.0, EtatSante.Sain, TypePersonne.Resistante, Vaccin.DeuxDoses));
        personnes.add(new Personne(4, true, 1.0, 2.0, EtatSante.Contagieux, TypePersonne.Sensible, Vaccin.Aucun));
        personnes.add(new Personne(5, false, 6.0, 5.0, EtatSante.Malade, TypePersonne.Neutre, Vaccin.Aucun));
        personnes.add(new Personne(6, true, 3.0, 8.0, EtatSante.Sain, TypePersonne.Resistante, Vaccin.DeuxDoses));
        personnes.add(new Personne(7, false, 9.0, 1.0, EtatSante.Sain, TypePersonne.Sensible, Vaccin.UneDose));
        personnes.add(new Personne(8, true, 4.0, 6.0, EtatSante.Contagieux, TypePersonne.Neutre, Vaccin.Aucun));
        personnes.add(new Personne(9, false, 8.0, 2.0, EtatSante.Gueri, TypePersonne.Resistante, Vaccin.Aucun));
        personnes.add(new Personne(10, true, 2.0, 9.0, EtatSante.Sain, TypePersonne.Sensible, Vaccin.UneDose));
        personnes.add(new Personne(11, false, 5.0, 3.0, EtatSante.Malade, TypePersonne.Neutre, Vaccin.Aucun));
        personnes.add(new Personne(12, true, 7.0, 4.0, EtatSante.Contagieux, TypePersonne.Resistante, Vaccin.DeuxDoses));
        personnes.add(new Personne(13, false, 6.0, 7.0, EtatSante.Sain, TypePersonne.Sensible, Vaccin.Aucun));
        personnes.add(new Personne(14, true, 3.0, 1.0, EtatSante.Malade, TypePersonne.Neutre, Vaccin.UneDose));
        personnes.add(new Personne(15, false, 9.0, 5.0, EtatSante.Sain, TypePersonne.Resistante, Vaccin.Aucun));

        JFrame frame = new JFrame("Simulation");
        MapPanel mapPanel = new MapPanel(personnes);
        frame.add(mapPanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
