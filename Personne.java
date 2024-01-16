//Mohamed Camara
//DBE

//Ex 3 programe Corriger+Anniversaire

import java.util.Scanner;
import java.awt.*;
import java.util.Arrays;

public class Personne{

    public String prenom;
    public String nom;
    public int age;
    static int nb_Personnes = 0;
    //structure
    public Personne(String p, String n, int a){
        prenom = p;
        nom = n;
        age = a;
        nb_Personnes++;
    }
    //methode Affichage 
    public void affichePersonne(){
        System.out.println(prenom+" "+nom+"à"+age+"ans");
    }
    //augmentation age
public static void anniversaire(Personne p){
     p.age++;  
    }

public static void main(String[] args){
         
        Personne p1 = new Personne("Jean","Durand",25);
        System.out.println(p1.prenom);
        System.out.println(p1.nom);
        System.out.println(p1.age);

        anniversaire(p1);

        System.out.println(p1.prenom);
        System.out.println(p1.nom);
        System.out.println(p1.age);

}
}

