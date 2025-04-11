public class Domestic extends Land_Animals{

    void Dog(){
        System.out.println("Dog is an example of a domestic animal that lives in the house");
    }

    public static void main(String[] args) {

        Domestic Dome = new Domestic();

        Dome.Dog();   // to display the message in the method created in the subclass
        Dome.Definition();  // to display the message in the method created in the superclass

    }
}
