public class Flower {

    String colour = "Red";
    Petal[] petals;
    
    private class Petal {
        public Petal() { System.out.println(colour); }
        String colour = "purple";
        static final int count = 3;
    
    
    
    }
    
    Flower() {
        petals = new Petal[2];
    }
    
    public static void main(String[] args) {
        new Flower();
        
    
    }




}