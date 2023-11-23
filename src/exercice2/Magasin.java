package tn.tuniprob.gestionmagasin.exercice2;

import tn.tuniprob.gestionmagasin.exercice1.Produit;
import tn.tuniprob.gestionmagasin.gestionemployes.Caissier;
import tn.tuniprob.gestionmagasin.gestionemployes.Employe;
import tn.tuniprob.gestionmagasin.gestionemployes.Responsable;
import tn.tuniprob.gestionmagasin.gestionemployes.Vendeur;

import java.util.ArrayList;

public class Magasin {
    public int identifiant;
    public String adresse;
    public int capacite=50;

    public Produit[] produits=new Produit[capacite];
    public int nombreDeProduit=0;
    public int nombreEmployee = 0 ;
    private ArrayList<Employe> employes ;


    public Magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.employes = new ArrayList<>();

    }

    public Magasin() {

    }

    public ArrayList<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(ArrayList<Employe> employes) {
        this.employes = employes;
    }

    public void ajoutProduit(Produit produit){
        if(nombreDeProduit<=capacite){
            produits[nombreDeProduit]=produit;
            nombreDeProduit++;
        }else {
            System.out.println("le contene maximale de la magasin est 50");
        }
    }

    public void ajouterEmploye(Employe employe)
    {
        if(employes.size() <= 20)
        {
            this.employes.add(employe) ;

        } else {
            System.out.println("le nombre  maximal des employés de la magasin est 20");

        }
    }
    public void afficher(){
        System.out.println("identifiant de magasin est :"+identifiant
                +"\n Adresse :"+adresse
                +"\ncapacite :"+capacite
                +"\nLes produits de magasin sont:"
        );
        for (int i = 0; i < nombreDeProduit; i++) {
            System.out.println(
                    "le nom de la produit n°"+(i+1)+"est :"+produits[i].getLibelle()
                            +"\nle prix de la produit n°"+(i+1)+"est :"+produits[i].getPrix()

            );
        }
        System.out.println("\n les employes de magasin sont : " );
        for(Employe employe : employes)
        {
            if(employe instanceof Responsable)
            {
                System.out.println(employe.toString());
            }

            if(employe instanceof Caissier)
            {
                System.out.println(employe.toString());
            }

            if(employe instanceof Vendeur)
            {
                System.out.println(employe.toString());
            }
        }
    }
}
