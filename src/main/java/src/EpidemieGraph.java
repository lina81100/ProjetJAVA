package src;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class EpidemieGraph {
    public static void main(String[] args) {
        // Exemple de données : nombre de malades par cycle
        List<Integer> maladesParCycle = new ArrayList<>();
        maladesParCycle.add(5);  // Cycle 0
        maladesParCycle.add(10); // Cycle 1
        maladesParCycle.add(15); // Cycle 2
        maladesParCycle.add(20); // Cycle 3
        maladesParCycle.add(18); // Cycle 4
        maladesParCycle.add(12); // Cycle 5
        maladesParCycle.add(5);  // Cycle 6

        // Créer une série pour les données
        XYSeries series = new XYSeries("Nombre de malades");
        for (int i = 0; i < maladesParCycle.size(); i++) {
            series.add(i, maladesParCycle.get(i)); // Cycle en X, Nombre de malades en Y
        }

        // Ajouter la série à une collection
        XYSeriesCollection dataset = new XYSeriesCollection(series);

        // Créer le graphique
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Évolution du nombre de malades", // Titre
                "Cycle", // Axe X
                "Nombre de malades", // Axe Y
                dataset
        );

        // Afficher le graphique dans une fenêtre
        JFrame frame = new JFrame("Graphique d'évolution");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        ChartPanel chartPanel = new ChartPanel(chart);
        frame.add(chartPanel);
        frame.setVisible(true);
    }
}
