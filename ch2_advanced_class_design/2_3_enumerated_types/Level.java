public enum Level {

    BEGINNER;
    static { System.out.println("static init block"); }
    
    Level() {
        System.out.println("constructor");
    }
    
    public static void main(String[] args) {
        System.out.println(Level.BEGINNER);
    }

}