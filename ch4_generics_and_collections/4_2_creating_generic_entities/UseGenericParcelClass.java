public class UseGenericParcelClass {

    public static void main(String[] args) {
        GenericParcel<Toy> parcel = new GenericParcel<>();
        parcel.set(new Toy());   // Adding object of correct type - compiler will be happy
        System.out.println(parcel.get());            // No need for explicit casting - we know we're going to get a Toy
        
        /**
         * Trying to execute the below line will cause a failure to compile. The GenericParcel object above has a generic type
         * argument to say that only Toy objects can be added to the parcel. 
         * 
         * "incompatible types: Clothing cannot be converted to Toy"
         */
        
        parcel.set(new Clothing());     
    }

}
