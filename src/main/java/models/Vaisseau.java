package models;

import java.util.ArrayList;

public class Vaisseau {

    Creature capitain;
    ArrayList<Creature> ListPassager;
    ArrayList<CapsuleDeSecour> capsuleDeSecour;
    int nbMaximumPassager;

    public Vaisseau() {
        this.capitain = new Creature("Albator", Race.HUMAIN, 42);
        this.capsuleDeSecour = new ArrayList<>();
        CapsuleDeSecour saveCapsule1 = new CapsuleDeSecour();
        CapsuleDeSecour corp2 = new CapsuleDeSecour();
        capsuleDeSecour.add(saveCapsule1);
        capsuleDeSecour.add(corp2);
//		capsuleDeSecour.add(new CapsuleDeSecour());
//		capsuleDeSecour.add(new CapsuleDeSecour());
        ListPassager = new ArrayList<>();
        nbMaximumPassager = 10;
    }

    public Vaisseau(Creature Capitaine, ArrayList<Creature> listPassager, int nbMax) {
        this.capitain = Capitaine;
        this.ListPassager = listPassager;
        this.nbMaximumPassager = nbMax;
        this.capsuleDeSecour = new ArrayList<>();
        CapsuleDeSecour saveCapsule1 = new CapsuleDeSecour();
        CapsuleDeSecour saveCapsule2 = new CapsuleDeSecour();
        capsuleDeSecour.add(saveCapsule1);
        capsuleDeSecour.add(saveCapsule2);

    }

    public String toString() {
        return "le capitaine de ce Vaisseau ce nomme " + capitain.nom + " nous avons " + capsuleDeSecour.size()
                + " capusles de secour, actuellement nous somme " + ListPassager.size() + " passagers à bords";

    }

    public boolean ajouterPassager(Creature creature) {

        if (ListPassager.size() < nbMaximumPassager) {

            this.ListPassager.add(creature);
            if (ListPassager.contains(creature)) {
                System.out.println("Le passager " + creature.nom + " de race " + creature.race + "  à bien embarqué a bords ");
            }
            return true;
        } else {
            System.out.println("Vaisseau complet le passager " + creature.nom + " ne peu pas embarqué");
            return false;
        }
    }

    public void ajouterpasagerClandestin(Creature clando, int potDeVin) {
        this.ListPassager.add(clando);
        System.out.println("Merci pour votre contribution...Bienvenu a bord Mr " + clando.nom);
    }

    public boolean ajouterPassagerCapsuleSecour() {
        Creature firstPassager = this.ListPassager.get(0);
        CapsuleDeSecour saveCapsule1 = this.capsuleDeSecour.get(0);

        if (this.ListPassager.isEmpty() || this.capsuleDeSecour.isEmpty()) {
            System.out.println("aucun passager/ou aucune capsule");
            return false;
        } else {
            if (saveCapsule1.SaveCapsuleListpassagers.size() < saveCapsule1.nbMaximumPassager) {
                saveCapsule1.SaveCapsuleListpassagers.add(firstPassager);
                if (saveCapsule1.SaveCapsuleListpassagers.contains(firstPassager)) {
                    System.out.println("le passager " + firstPassager.nom + "  à bien été ajouter a la capsule de secour");
                }
                return true;
            } else {
                System.out.println("je,ne peu rien faire pour vous aider !! ");
            }
            return false;
        }
    }
}
