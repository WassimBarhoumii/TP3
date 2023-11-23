package tn.tuniprob.gestionmagasin.gestionemployes;

public class Employe {
    private int identifiant ;
    private String nom ;
    private String adresse ;
    private int nbrHeures ;

    public Employe() {
    }

    public Employe(int identifiant, String nom, String adresse, int nbrHeures) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeures = nbrHeures;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNbrHeures() {
        return nbrHeures;
    }

    public void setNbrHeures(int nbrHeures) {
        this.nbrHeures = nbrHeures;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("identifiant=").append(identifiant);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", adresse='").append(adresse).append('\'');
        sb.append(", nbrHeures=").append(nbrHeures);
        return sb.toString();
    }
}