public class Wild extends Land_Animals{

    public void Lion(){

        System.out.println("Lion is termed as a wild animal because it lives in the forest");
    }

    public static void main(String[] args) {
        Wild bush = new Wild();

        bush.Definition(); // to display the message in the method created in the superclass
        bush.Lion();  // to display the message in the method created in the subclass
    }
}
