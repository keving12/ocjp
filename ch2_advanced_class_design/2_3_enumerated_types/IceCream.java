public enum IceCream {
    VANILLA("white"),
    STRAWBERRY("pink"),
    WALNUT("brown") {
        public String toString() {
            return "WALNUT is brown in colour";
        }
        
        public String flavour() {
            return "great!";
        }
    },
    CHOCOLATE("dark brown");
    
    private String colour;
    
    IceCream(String colour) {
        this.colour = colour;
    }
    
    public String toString() {
        return "MyColour: "+colour;
    }




}