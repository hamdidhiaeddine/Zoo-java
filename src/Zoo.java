import java.time.ZoneOffset;

public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbr_cages;

    Zoo(String name, String city, int nbr_cages) {
        this.name = name;
        this.city = city;
        this.nbr_cages = nbr_cages;
    }

    public void display() {
        System.out.println("nom du Zoo: " + name + ", ville :" + city + ", Nombre de cages :" + nbr_cages);
    }

    @Override
    public String toString() {
        return "Zoo{" + "name=" + name + ", city=" + city  + ", nbrCages=" + nbr_cages + '}';

    }
}