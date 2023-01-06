import models.Creature;

public class StarMain {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Creature stephane = new Creature();
        System.out.println(stephane.isAdulte());
        System.out.println(stephane.getRace());
        System.out.println(stephane.afficherInfo());



    }
}