public class Mammals extends Animals{

    // Mammals here extends the Animal class as single Inheritance

    public void Vertebrate(){

        System.out.println("All Mammals are vertebrate Animals");
    }

    public static void main(String[] args) {

        Mammals animal_type = new Mammals();

        animal_type.Vertebrate();
        animal_type.life();
    }
}