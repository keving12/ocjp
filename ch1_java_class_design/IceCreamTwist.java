public enum IceCreamTwist {

    VANILLA("white"),
    STRAWBERRY("pink"),
    WALNUT("brown"),
    CHOCOLATE("dark brown");
    
    String colour;
    
    IceCreamTwist(String colour) {
        this.colour = colour;
    }
    
    public static void main(String[] args) {
        System.out.println(VANILLA);
        System.out.println(CHOCOLATE);
    
    }


}