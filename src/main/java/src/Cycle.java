package src;

import java.util.Random;

import static java.lang.Math.max;


public class Cycle {

    //attributs
    private Epidemie maladie;
    private Population population;
    private int nbMalades;
    private int nbGueris;
    private int nbDeces;
    private int numCycle;
    //getters
    public int getNbDeces() {
        return nbDeces;
    }

    public int getNbMalades() {
        return nbMalades;
    }
    public int getNbGueris() {
        return nbGueris;
    }

    //Setters
    public int getNumCycle() {
        return numCycle;
    }
    public Population getPopulation() {
        return population;
    }
    public void setPopulation(Population population) {
        this.population = population;
    }
    public void setNbDeces(int nbDeces) {
        this.nbDeces = nbDeces;
    }
    public void setNbMalades(int nbMalades) {
        this.nbMalades = nbMalades;
    }
    public void setNbGueris(int nbGueris) {
        this.nbGueris = nbGueris;
    }


    //méthodes
    public void actualisationContamination(){
        for (Personne p : this.population.getListePersonne()){
            if ( p.getVaccin() == Vaccin.Aucun ) {
                double probaContagion = 0;
                for (Personne pers : this.population.getListePersonne() ) {
                    if (pers != p) { // égalité peut etre à redéfinir

                        double distance = 0;
                        distance = Math.sqrt(Math.pow(pers.getX() - p.getX(), 2) + Math.pow(pers.getY() - p.getY(), 2)); // à l'a puissance 2 puis racine carré
                        probaContagion = max(0, maladie.getProbaIniTransmission() * (1 - distance / maladie.getDistanceMaxTransmissionEnKM())); // calcul de p(d)

                        System.out.println("PROBA CONTAGION AVANT = " + probaContagion);
                        System.out.println("TYPE EFFECTIF = " + p.getType());
                        // 3 CAS POSSIBLES
                        if (p.getType() == TypePersonne.Resistante) {
                            probaContagion = probaContagion * maladie.getFacteurTransmissionResistants(); //p(d) * facteurTransmission...
                            System.out.println("PROBA CONTAGION RESISTANT = " + probaContagion);
                        } else if (p.getType() == TypePersonne.Neutre) {
                            probaContagion = probaContagion * maladie.getFacteurTransmissionNeutres();
                            System.out.println("PROBA CONTAGION NEUTRE = " + probaContagion);
                        } else {      //si Sensible
                            probaContagion = probaContagion * maladie.getFacteurTransmissionSensibles();
                            System.out.println("PROBA CONTAGION SENSIBLE = " + probaContagion);
                        }
                        System.out.println("PROBA CONTAGION après = " + probaContagion);



                        // ON A OBTENU LA PROBA QUE p SOIT CONTAMINE par pers, ON FAIT LE TIRAGE POUR SAVOIR SI p DEVIENT MALADE OU NON
                        boolean resultat = new Random().nextDouble() <= probaContagion; // TIRAGE ALEATOIRE AVEC LA PROBA probaContagion
                        if (resultat && p.getEtat() != EtatSante.Decede && p.getEtat() != EtatSante.Malade ) { //si la personne p est contaminé
                            p.setEtat(EtatSante.Malade);
                        }


                        ///// RQ : REMPLACER TOUS LES STATIC PAR FINAL DANS LES GETTERS ET ATTRIBUTS DE EPIDEMIE ET REMPLACER DANS CETTE CLASSE "EPIDEMIE" PAR UNE INSTANCE DE CETTE CLASSE !!!!!!!!!!!!


                    }

                }
            }

        }


    }

    public void bilan(){
        for (Personne p : this.population.getListePersonne()){
            if (p.getEtat() == EtatSante.Malade){
                nbMalades++;
            }
            else if(p.getEtat() == EtatSante.Decede ){
                nbDeces++;
            }
            else if (p.getEtat() == EtatSante.Gueri ){
                nbGueris++;
            }
        }
    }


    // Constructeurs
    public Cycle(Epidemie maladie, int numCycle, Population population){
        this.maladie = maladie;
        this.numCycle = numCycle;
        this.population = population;


    }
    //toString
    public String toString(){
        return "Nb de malade(s) :" + this.nbMalades + " Nb de guéri(s) :" + this.nbGueris + " Nb de décès(s) :" + this.nbDeces + "\n";
    }


}
