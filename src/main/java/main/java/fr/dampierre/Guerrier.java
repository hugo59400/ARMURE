package main.java.fr.dampierre;

import java.util.Random;

public class Guerrier {
    private int pv = 100;
    private double force = 2.0;
  //  private Armure armure;
    private int vitesse = 1;
    private String nom;

    public void attaquer(Guerrier autre) {
        Random rand = new Random();
        int puissMoi = rand.nextInt((int) (force * vitesse));
        int puissAutre = rand.nextInt((int) (autre.force * autre.vitesse));
        if (puissMoi > puissAutre) {
            autre.pv -= 10;
        } else {
            pv -= 10;
        }
        // if (suffisammentPuissant())
    }

    public void afficherPv() {
        System.out.print(pv + " ");
    }

    public void afficherNom() {
        System.out.print(nom + " ");
    }

    public boolean estEnVie() {
        return pv > 0;
    }

    public void init(String leNom, double force, int vitesse) {
        nom = leNom;
        this.force = force;
        this.vitesse = vitesse;
    }

}