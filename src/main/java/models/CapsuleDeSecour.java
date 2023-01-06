package models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter
public class CapsuleDeSecour {
    ArrayList<Creature> SaveCapsuleListpassagers;
    int nbMaximumPassager;
    boolean isInSpace;

    public CapsuleDeSecour()
    {
        this.SaveCapsuleListpassagers = new ArrayList<Creature>();
        this.isInSpace = false;
        this.nbMaximumPassager = 3;
    }
    public String  toString()
    {
        return "Message de la Capsule : nombre de passager a bords est de "   + nbMaximumPassager;
    }

    public boolean ajouterPassager(Creature creature)
    {
        this.SaveCapsuleListpassagers.add(creature);
        if(SaveCapsuleListpassagers.contains(creature))
        {
            System.out.println("Le passager " + creature.nom + " à bien embarqué a bords de la capsule de secour  ");
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isInSpace()
    {
        if(isInSpace)
        {
            System.out.println("En orbite");
            return true;
        }
        else
        {
            System.out.println("Stationné place 40");
            return false;
        }
    }
    public ArrayList<Creature> LanceCapsule()
    {
        isInSpace = true;
        return SaveCapsuleListpassagers;
    }
}
