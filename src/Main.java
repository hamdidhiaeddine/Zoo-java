import java.util.Scanner;

public class Main {
    int nbrCages;
    String ZooName;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Main zoo = new Main();

        System.out.println("Entrer le nom du Zoo :");
        zoo.ZooName = scanner.nextLine();

        // Vérification du nom
        while (zoo.ZooName.isEmpty()) {
            System.out.println("Le nom ne peut pas être vide. Entrez le nom :");
            zoo.ZooName = scanner.nextLine();
        }
        System.out.println("Entrer la ville du Zoo :");
        String city = scanner.nextLine();

        System.out.println("Entrer le nombre de cages :");
        zoo.nbrCages = scanner.nextInt();


        while (zoo.nbrCages <= 0) {
            System.out.println("Le nombre doit être positif. Entrez le nombre :");
            zoo.nbrCages = scanner.nextInt();
        }
        Zoo myZoo = new Zoo(zoo.ZooName, city , zoo.nbrCages);

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
        Animal snake = new Animal("Pythonidae", "Python", 3, false);

      //  System.out.println(myZoo);
        System.out.println(myZoo.toString());
        myZoo.display();

        System.out.println("\n...Animaux...");
        System.out.println(lion);
        System.out.println(elephant);
        System.out.println(snake);

         //Instruction 3
        System.out.println("Le zoo " + zoo.ZooName +
                " contient " + zoo.nbrCages + " cages.");
        System.out.println();

        scanner.close();
    }
}