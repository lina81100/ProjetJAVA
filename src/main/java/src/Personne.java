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



    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }
    public boolean isAccesVaccin() {
        return accesVaccin;
    }
    public void setAccesVaccin(boolean accesVaccin) {
        this.accesVaccin = accesVaccin;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
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
    public void setType(TypePersonne type) {
        this.type = type;
    }
    public Vaccin getVaccin() {
        return vaccin;
    }
    public void setVaccin(Vaccin vaccin) {
        this.vaccin = vaccin;
    }
}
