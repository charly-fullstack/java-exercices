public class Exercice3Heritage {

    public static void main(String[] args) {
        System.out.println("Welcome to exercise 3 on inheritance !!");
        Student student = new Student("Charles", 25, "UTCN");
        System.out.println("Your name is : " + student.getNom());
        System.out.println("your old is : " + student.getAge() + " ans.");
        System.out.println("The name of your university is : " + student.getUniversity());
    }
}

class Person {
    private String nom;
    private int age;

    // Constructor of the Person class
    public Person (String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Getters for accessing private attributes (principle of encapsulation)
    public String getNom() {
        return nom;
    }
    public int getAge() {
        return age;
    }

// Setters for accessing private attributes (principle of encapsulation)
//    public void setNom(String nom) {
//        this.nom = nom;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }

}

class Student extends Person {
    private String university;

    // Constructor of the Student class
    public Student (String nom, int age, String university) {
        super(nom, age); // Call to the parent class constructor
        this.university = university;
    }

    // Getter for university attribute
    public String getUniversity() {
        return university;
    }

}