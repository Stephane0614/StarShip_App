package models;

public enum Race {

    HUMAIN(18),TOGRUTA(3),

    KLACKSONS(6),KLINGON(12),

    EPSILON(24),BORON(48),

    PHENIX(96);

    int ageAdulte;

    Race( int race)
    {
        this.ageAdulte = race;
    }
}
