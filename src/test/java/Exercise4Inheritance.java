public class Exercise4Inheritance {

    public static void main(String[] args) {
        System.out.println("Welcome to exercise4Inheritance");

        // Création d'un tableau de formes contenant un cercle et un rectangle
        Forme[] formes = new Forme[4]; // Polymorphisme avec mon tableau Forme[]
        formes[0] = new Cercle(2); // Rayon du cercle
        formes[1] = new Rectangle(3, 4); // Longueur et largeur du rectangle
        formes[2] = new Triangle(4.6, 7.5);
        formes[3] = new Carre(5);

        // Parcours du tableau de formes, call de la méthode calculerSurface() pour calculer la surface de chaque
        // forme i.e du cercle et du rectangle
        for(Forme forme : formes) {
            System.out.println("La surface de la forme est : " + forme.calculerSurface() + " 🍌m\u00B2");
        }
    }
}

// Les Interfaces en Java
interface Describle {
    String decrire();
}

// Classe abstraite Forme
abstract class Forme implements Descriptible {

    // Méthode abstraite calculeSurface(),à implémenter dans les sous-classes
    public abstract double calculerSurface();

    @Override // Les annotations en Java
    public String decrire() {
        return "Bonjour tout le monde";
    }

}

// Classe Cercle qui hérite de Forme
class Cercle extends Forme {
    private double rayon; //  Attributs rayon

    // Constructeur de la classe Cercle
    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    // Implémentation de la méthode calculerSurface() pour le cercle
    @Override // C'est une bonne méthode pour s'assurer que j'ai bien redefinis la méthode de la classe parente au niveau de la classe fille
    public double calculerSurface() {
        return Math.PI * rayon * rayon; // Calcule de la surface d'un cercle PI * r2
    }

    @Override // Les annotations
    public String decrire() {
        return "Bonjour tout le monde!".toUpperCase();
    }

}

// Classe Rectangle qui hérite de Forme
class Rectangle extends Forme {
    // Attributs de la classe Rectangle (encapsulation)
    private double longueur; // Attriuts longueur
    private double largeur; // Attributs largeur

    // Constructeur de la classe Rectangle
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

// Implémentation de la méthode calculeSurface() pour le rectangle
    // Les annotations de la classe Rectangle
    @Override
    public double calculerSurface() {
        return longueur * largeur; // Calcul de la surface d'un rectangle :
    }

    @Override
    public String decrire() {
        return "Hello World!!";
    }
}

class Triangle extends Forme {
    // Attributs
    private double hauteur; // Attribut longueur : Encapsulation
    private double base; // Attribut largeur : Encapsulation

    // Constructeur de la classe Triangle
    public Triangle (double base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    // Les Annotations de la classe Triangle
    @Override
    public double calculerSurface() {
        return base * hauteur / 2;
    }

    @Override
    public String decrire() {
        return "Buna Ziua";
    }
}

class Carre extends Forme {

    // Attributs : encapsulation
    private double cote;

    // Constructeur de la classe Carre
    public Carre(double cote) {
        this.cote = cote;
    }

    // Les Annotations de la classe Carre
    @Override
    public double calculerSurface() {
        return cote * cote;
    }

    @Override
    public String decrire() {
         return "Good morning";
    }


}