import java.awt.desktop.SystemEventListener;

public class Exercice1Heritage {

    public static void main(String[] args) {

        // Création d'un tableau d'Animal contenant à la fois des objets Chien et Chat
        Animal[] animaux = new Animal[3];
        animaux[0] = new Chien("Baudy", 4); // Chien
        animaux[1] = new Chat("Pichaï", 3); // Chat
        animaux[2] = new Chien("Rex", 5); // Chien


        // Parcours du tableau d'animaux et appel de la méthode faireDuBruit() pour chaque élélement
        // for-each loop
        for (Animal animal : animaux) {
            System.out.println(animal.getNom() + " fait du bruit : ");
            animal.faireDuBruit();

        }
//        Animal animal1 = new Animal("Rex", 5);
//        animal1.faireDuBruit(); // Call the method of the Animal class to demonstrate inheritance.
//        animal1.faireDeLaChasse(); // Appel de la méthode de la classe Animal pour démontrer l'héritage
//        System.out.println("Welcome to Heritage Exercise!");
//
//        // Create an instance of the Chien class, which inherits from the Animal class, and call its methods to demonstrate inheritance and method overriding.
//        // Création d'une instance de la classe Chien, qui hérite de la classe Animal, et appel de ses méthodes pour démontrer l'héritage et la redéfinition de méthodes.
//        Chien chien1 = new Chien("Buddy", 4);
//        System.out.println("Nom du chien : " + chien1.getNom());
//        System.out.println("Âge du chien : " + chien1.getAge());
//        System.out.println("Le chien fait du bruit : ");
//        chien1.faireDuBruit();
//        System.out.println("Modification de l'âge du chien...");
//        chien1.setAge(5);
//        System.out.println("Nouvel âge du chien : " + chien1.getAge());
//
//        // Création d'une instance de la classe Chat, qui hérite de la classe Animal, et appel de ses méthodes pour démontrer l'héritage et le redéfinition de méthodes
//        Chat chat1 = new Chat("Pichaï", 4);
//        System.out.println("Nom du chat : " + chat1.getNom());
//        System.out.println("Âge du chat : " + chat1.getAge());
    }
}

class Animal {
    String nom;
    int age;

    // Constructor for the Animal class (constructeur pour la classe Animal
    public Animal (String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Methods for the Animal class (méthode pour faire du bruit)
    public void faireDuBruit() {
        System.out.println("L'animal fait du bruit");
    }
//    public void faireDeLaChasse() {System.out.println("L'animal chasse");}

    // Getter and setter methods for the attributes of the Animal class (mutators and accessors)
    // These methods allow setting and getting the values of the private attributes of the class.
    // Setter methods for the attributes of the Animal class. These methods allow setting the values of the private attributes of the class.
    // Getter methods for the attributes of the Animal class. These methods allow access to the private attributes of the class.
    // Setter methods for the attributes of the Animal class. These methods allow setting the values of the private attributes of the class.
    // Getter methods for the attributes of the Animal class. These methods allow access to the private attributes of the class.
    // les accesseurs (getters) et mutateurs (setters) sont utilisés pour encapsuler les données de la classe, permettant ainsi de contrôler l'accès et la modification des attributs de manière sécurisée.

    // Setters (mutateurs)
    public void setAge(int age) {
        this.age = age;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getters (accesseurs)
    public int getAge() {return age;}
    public String getNom() {return nom;}

}

class Chien extends Animal {

    // Redéfinition de la méthode faireDuBruit() pour le chien
    @Override
    public void faireDuBruit() {
        System.out.println("Le chien aboie: Woof!");
    }

//    @Override
//    public void faireDeLaChasse() {System.out.println("Le chien chasse");}

    // Constructor for the dog class that calls the constructor of the Animal class using the super keyword to initialize the inherited attributes.
    public Chien(String nom, int age) {
        super(nom, age);
    }
}

class Chat extends Animal {

    // Redéfinition de la méthode faireDuBruit() pour le chat
    @Override
    public void faireDuBruit() {System.out.println("Le chat miaule: Miaou!");}

//    @Override
//    public void faireDeLaChasse() {System.out.println("Le chien chasse");}

    // Le constructeur de la classe Chat qui appelle le constructeur de la classe mère Animal par le biais du mot clé super pour initialiser l'héritage des attributs.
    public Chat(String nom, int age) {
        super(nom, age);
    }
}


