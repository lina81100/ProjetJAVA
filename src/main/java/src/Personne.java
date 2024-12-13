package src;

public class Personne {
    private int idPersonne;
    private boolean accesVaccin;
    private double x;
    private double y;
    private EtatSante etat;
    private TypePersonne type;
    private Vaccin vaccin;


    //Constructeur
    public Personne(int idPersonne, boolean accesVaccin, double x, double y, EtatSante etat, TypePersonne type, Vaccin vaccin) {
        this.idPersonne = idPersonne;
        this.accesVaccin = accesVaccin;
        this.x = x;
        this.y = y;
        this.etat = etat;
        this.type = type;
        this.vaccin = vaccin;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public EtatSante getEtat() {
        return etat;
    }
    public void setEtat(EtatSante etat) {
        this.etat = etat;
    }
    public TypePersonne getType() {
        return type;
    }

    public Vaccin getVaccin() {
        return vaccin;
    }

}
