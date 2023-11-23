package tn.tuniprob.gestionmagasin.exercice1;

import java.util.Date;

public class Produit {
     Date date_ex;
    int identifier;
    String libelle;
    String marque;
    double prix;

    public Produit() {
        if(prix>=0){
            this.prix = prix;
        }
    }

    public Produit(int identifier, String libelle, String marque) {
        this.identifier = identifier;
        this.libelle = libelle;
        this.marque = marque;
        if(prix>=0){
            this.prix = prix;
        }
    }

    public Produit(int identifier, String libelle, String marque, double prix) {
        this.identifier = identifier;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        if(prix>=0){
            this.prix = prix;
        }
    }

    public  Produit (int identifier, String libelle, String marque, double prix, Date d){
        this.identifier=identifier;
        this.libelle=libelle;
        this.marque=marque;
        this.prix=prix;
        this.date_ex=d;
        if(prix>=0){
            this.prix = prix;
        }
    }

    void affiche(){
        System.out.println("le idntifier "+ identifier+ " le libelle"+ " " +libelle+"le marque" + " "+marque+"le prix" +" "+prix+"la date est"+date_ex);
        System.out.println(date_ex);

    }
    public String toString() {
        return "identifier"+this.identifier+"libelle"+this.libelle+"marque"+this.marque+"prix"+this.prix;
    }
    public void setDate_ex(Date d){
        this.date_ex=d;
    }

    public Date getDate_ex() {
        return date_ex;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
