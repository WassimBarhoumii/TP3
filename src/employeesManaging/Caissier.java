package tn.tuniprob.gestionmagasin.gestionemployes;

public class Caissier  extends Employe{
    private int numeroCaisse ;

    public Caissier() {
    }

    public Caissier(int identifiant, String nom, String adresse, int nbrHeures, int numeroCaisse) {
        super(identifiant, nom, adresse, nbrHeures);
        this.numeroCaisse = numeroCaisse;
    }

    public int getNumeroCaisse() {
        return numeroCaisse;
    }

    public void setNumeroCaisse(int numeroCaisse) {
        this.numeroCaisse = numeroCaisse;
    }

    @Override
    public String toString() {
        return "Caissier{" +
                super.toString()  +
                ", numeroCaisse=" + numeroCaisse

        + "} ";
    }

    public void calculSalaire()
    {
        if(getNbrHeures() <= 180)
        {
            System.out.println("le salaire  de caissier " + getNom() + " est " +getNbrHeures()  * 5 + "DT");
        } else {
            int salaire = 180  * 5  + (180  * 5 * 15 / 100 ) ;
            System.out.println("le salaire  de caissoer " + getNom() + " est " +salaire + "DT");
        }
    }
}
