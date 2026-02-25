package org.example;

public class User {

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Animal animal1 = new Animal("Rex", 5, "Brown", 50);
        System.out.println("Animal Name: " + animal1.nom);
        System.out.println("Animal Age: " + animal1.getAge());
        System.out.println("Animal Color: " + animal1.couleur);
        System.out.println("Animal Size: " + animal1.getTaille());

        Animal animal2 = new Animal("Mia", 3, "Black", 30);
        System.out.println("Animal Name: " + animal2.nom);
        System.out.println("Animal Age: " + animal2.getAge());
        System.out.println("Animal Color: " + animal2.couleur);
        System.out.println("Animal Size: " + animal2.getTaille());

    }
    Chien chien1 = new Chien("Buddy", 4, "Golden", 40);

}

class Animal {
    String nom;
    int age;
    String couleur;
    int taille;

    public void eat() {
        System.out.println("Animal is eating");
    }
    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    // Setter methods for the attributes of the Animal class. These methods allow setting the values of the private attributes of the class.
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public void setTaille(int taille) {
        this.taille = taille;
    }

    // Getter methods for the attributes of the Animal class. These methods allow access to the private attributes of the class.
    public int getAge() {
        return age;
    }
    public int getTaille() {
        return taille;
    }
    // Constructor for the Animal class that takes parameters for the name, age, color, and size of the animal. It initializes the corresponding attributes with the provided values.
    public Animal(String nom, int age, String couleur, int taille) {
        this.nom = nom;
        this.age = age;
        this.couleur = couleur;
        this.taille = taille;
    }
}

class Chien extends Animal {
    @Override // This method overrides the toString() method from the Object class to provide a string representation of the Chien object.
    public String toString() {
        return super.toString();
    }

//    public void aboyer() {
//        System.out.println("Woof!");
//    }
//
    // Constructor for the Chien class that takes parameters for the name, age, color, and size of the dog. It calls the constructor of the superclass (Animal) to initialize these attributes.
    public Chien(String nom, int age, String couleur, int taille) {
        super(nom, age, couleur, taille);
    }

    public void bark() {
        System.out.println("Woof!");
    }
}