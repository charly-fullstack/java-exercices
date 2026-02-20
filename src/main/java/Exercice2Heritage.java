public class Exercice2Heritage {

    public  static void main(String[] args) {


        System.out.println("Welcome to Heritage Exercise 2!");

        // Création des objets Voitures et Moto
        Vehicule vehicule1 = new Voiture();
        Vehicule vehicule2 = new Moto();

        // Appel de la méthode decrire() sur les deux objets
        vehicule1.decrire();
        vehicule2.decrire();


    }
}

class Vehicule {

    // Méthode de base qui peut être redéfinie
    public void decrire() {
        System.out.println("Ceci est un véhicule.");
    }
}

class Voiture extends Vehicule {
    // Redéfinition de la méthode decrire() pour la voiture (polymorphisme dynamique en Java)
    @Override
    public void decrire() {
        System.out.println("Ceci est une voiture.");
    }

}

class Moto extends Vehicule {

    // Redéfinition de la méthode decrire() pour la moto (polymorphisme dynamique en Java)
    @Override
    public void decrire() {
        System.out.println("Ceci est une moto.");
    }

}
