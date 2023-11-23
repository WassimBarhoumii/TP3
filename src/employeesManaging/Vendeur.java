package tn.tuniprob.gestionmagasin.gestionemployes;

public class Vendeur extends Employe{
    private double taux ;

    public Vendeur() {
    }

    public Vendeur(int identifiant, String nom, String adresse, int nbrHeures, double taux) {
        super(identifiant, nom, adresse, nbrHeures);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "Vendeur{" +
                super.toString() +
                ", taux=" + taux

                + "} ";
    }

    public void calculSalaire()
    {
        System.out.println("le salaire du vendeur " + getNom() + " est " + (450   * taux / 100) + "DT");

    }
}
