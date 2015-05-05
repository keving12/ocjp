public class BirdSanctuary {

    public static void main(String[] args) {
        Bird bird = new Bird();
        Parrot parrot = new Parrot();
        Vulture vulture = new Vulture();
        //Vulture vulture2 = (Vulture)parrot;       // incompatible types
        //Parrot parrot2 = (Parrot)bird;              // classcastexception - cannot downcast bird (supertype) to parrot (subtype)
        //Scavenger sc = (Scavenger)vulture;        // Compile and runs fine. vulture can be upcast to interface it implements
        Scavenger sc2 = (Scavenger)bird;            // Should get classcastexception - casting to interface it doesn't implement
    }


}

interface Scavenger {

}

class Bird { }

class Parrot extends Bird { }

class Vulture extends Bird implements Scavenger { }