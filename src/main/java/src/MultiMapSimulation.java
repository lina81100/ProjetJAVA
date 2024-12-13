package src;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultiMapSimulation {
    public static void main(String[] args) {
        // Simulation de 10 cycles avec 10 personnes par cycle
        List<List<Personne>> cycles = new ArrayList<>();
        Random random = new Random();

        // Génération des 10 cycles
        for (int cycle = 0; cycle < 10; cycle++) {
            List<Personne> personnes = new ArrayList<>();

            for (int i = 1; i <= 10; i++) {
                // Coordonnées aléatoires (0-9) dans une grille 10x10
                double x = random.nextInt(10);
                double y = random.nextInt(10);

                // État de santé aléatoire
                EtatSante etat;
                int etatRandom = random.nextInt(4); // 0 = Sain, 1 = Malade, 2 = Contagieux, 3 = Guéri
                switch (etatRandom) {
                    case 1:
                        etat = EtatSante.Malade;
                        break;
                    case 2:
                        etat = EtatSante.Contagieux;
                        break;
                    case 3:
                        etat = EtatSante.Gueri;
                        break;
                    default:
                        etat = EtatSante.Sain;
                }

                // Type de personne aléatoire
                TypePersonne type = TypePersonne.values()[random.nextInt(TypePersonne.values().length)];

                // Vaccination aléatoire
                Vaccin vaccin = Vaccin.values()[random.nextInt(Vaccin.values().length)];

                // Ajouter la personne au cycle
                personnes.add(new Personne(i, random.nextBoolean(), x, y, etat, type, vaccin));
            }

            cycles.add(personnes); // Ajouter la liste des personnes pour ce cycle
        }

        // Créer la fenêtre principale
        JFrame frame = new JFrame("Simulation multi-cycle");
        JTabbedPane tabbedPane = new JTabbedPane();

        // Ajouter un onglet pour chaque cycle
        for (int cycleIndex = 0; cycleIndex < cycles.size(); cycleIndex++) {
            List<Personne> cycle = cycles.get(cycleIndex);
            MapPanel mapPanel = new MapPanel(cycle);
            tabbedPane.addTab("Cycle " + (cycleIndex + 1), mapPanel);
        }

        // Configurer et afficher la fenêtre
        frame.add(tabbedPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}