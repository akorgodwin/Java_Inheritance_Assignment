public class Tilapia_Fish extends Aquatic_Animals{

    // Here, the  Tilapia_Fish class inherited the Aquatic animal class, which has already inherited the animal class
    // And they all have methods which were in turn printed out by creating an object for each class

    public void animal_type(){

        System.out.println(" Tilapia Fish is an example of animals that live in the water (Aquatic)");

    }

    public static void main(String[] args) {
        Tilapia_Fish water_animal = new Tilapia_Fish();
        Aquatic_Animals  aquatic = new Aquatic_Animals();

        water_animal.animal_type();  // the object of the classes created here displays each method
        aquatic.Habitat();
        aquatic.life();
        water_animal.life();

    }
}
