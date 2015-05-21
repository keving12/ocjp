public class UseParcelClass {

    public static void main(String[] args) {
        Parcel parcel = new Parcel();   // Create Parcel object
        parcel.setObj(new Book());      // Set new Book object as instance variable of parcel - there's no type checking here
        System.out.println((Phone)parcel.getObj()); // Get instance variable from parcel (actual type of Book) and try and cast to Phone - BREAKS!
    
        /**
         * If we know we want to get a phone out of the parcel we should only be allowing Phone objects into the parcel.
         * Using generics will allow the compiler to verify this and prevent compilation if this is not the case rather than the situation
         * above when the code compiles but fails at runtime because the object we have isn't of the exepcted type.
         * 
    } 


}