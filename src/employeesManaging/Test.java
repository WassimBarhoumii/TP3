package tn.tuniprob.gestionmagasin.gestionemployes;

import tn.tuniprob.gestionmagasin.exercice1.Produit;
import tn.tuniprob.gestionmagasin.exercice2.Magasin;

public class Test {
    public static void main(String[] args) {

        Magasin m1 = new Magasin(1, "tunis") ;

        // pour magasin 1
        Caissier c1 = new Caissier(1 , "mohamed" , "sousse" , 160 , 1234) ;
        Caissier c2 = new Caissier(2 , "mariem" , "mahdia" , 180 , 2234) ;
        Responsable r1 = new Responsable(3 , "marwen" , "tunis" , 180 , 20 );
        Vendeur v1 = new Vendeur(4 , "cyrine" , "bizerte" , 160 , 120);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(r1.toString());
        System.out.println(v1.toString());

        m1.ajouterEmploye(c1);
        m1.ajouterEmploye(c2);
        m1.ajouterEmploye(r1);
        m1.ajouterEmploye(v1);

        Produit produit1=new Produit(1021,"Lait","delic",2.0);
        Produit produit2=new Produit(2510,"Yaiurt","Vitalait",0.5);

        m1.ajoutProduit(produit1);
        m1.ajoutProduit(produit2);

        m1.afficher();

        // pour magasin 2
        Magasin m2 = new Magasin(2 , "ariana") ;


        Vendeur v2 = new Vendeur(5 , "haifa" , "manouba" , 160 , 125);
        Vendeur v3 = new Vendeur(6 , "najwa" , "ariana" , 160 , 133);
        Vendeur v4 = new Vendeur(7 , "ahlem" , "ben arous" , 160 , 142);
        Responsable r2 = new Responsable(8, "mahdi" , "ariana" , 130 , 210 );

        System.out.println(v2.toString());
        System.out.println(v3.toString());
        System.out.println(v4.toString());
        System.out.println(r2.toString());

        m2.ajouterEmploye(v2);
        m2.ajouterEmploye(v3);
        m2.ajouterEmploye(v4);
        m2.ajouterEmploye(r2);

        Produit produit3=new Produit(3250,"Tomate","sucam",1.4);
        m2.ajoutProduit(produit3);

        m2.afficher();

        c1.calculSalaire();
        c2.calculSalaire();
        r1.calculSalaire();
        v1.calculSalaire();

        v2.calculSalaire();
        v3.calculSalaire();
        v4.calculSalaire();
        r2.calculSalaire();


    }
}
