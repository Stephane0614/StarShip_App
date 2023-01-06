package models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Creature {
    String nom;
    Race race;
    int age;

    public Creature() {
        this.nom = "Stephane";
        this.race = Race.HUMAIN;
        this.age = 42;
    }
    public Creature(String name, Race race, int age)
    {
        this.nom = name;
        this.race = race;
        this.age = age;
    }

    public boolean isAdulte()
    {
        return this.age >= this.race.ageAdulte;
    }

    public String  toString()
    {
        return nom +"-"+ age+"ans-"  + race;
    }

    public String afficherInfo()
    {
        if (isAdulte())
        {
            return "Mon non est " + this.nom + ". Je suis un " + this.race + ". Je suis un adulte.";
        } else {
            return "Mon non est " + this.nom + ". Je suis un " + this.race + ". Je suis un enfant.";
        }
    }
}
