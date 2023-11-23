package tn.tuniprob.gestionmagasin.gestionemployes;

public class Responsable extends Employe{
    private int prime ;

    public Responsable() {
    }

    public Responsable(int identifiant, String nom, String adresse, int nbrHeures, int prime) {
        super(identifiant, nom, adresse, nbrHeures);
        this.prime = prime;
    }

    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "Responsable{" +
                super.toString() +
                ", prime=" + prime

                + "} ";
    }

    public void calculSalaire()
    {
        if(getNbrHeures() <= 160)
        {
            System.out.println("le salaire  de responsable " + getNom()  +  " est " +getNbrHeures()  * 10 + "DT");
        } else {
            int salaire = 160  * 10  + (160  * 10 * prime / 100 ) ;
            System.out.println("le salaire de responsable " + getNom() + " est " +salaire + "DT");
        }
    }
}
