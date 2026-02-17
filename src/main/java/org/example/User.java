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
    public int getAge() {
        return age;
    }

    public int getTaille() {
        return taille;
    }

    public Animal(String nom, int age, String couleur, int taille) {
        this.nom = nom;
        this.age = age;
        this.couleur = couleur;
        this.taille = taille;
    }
}
