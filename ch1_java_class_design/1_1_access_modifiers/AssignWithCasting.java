public class AssignWithCasting {

    public static void main(String[] args) {
        ShoppingItem shopItem = new ShoppingItem();
        //Book book = (Book)shopItem;                   -- This wont compile, cannot cast actual type of base class to derived class (downcast)
        //Printable printable = (Printable)shopItem;    --  This wont compile, cannot case to an interface type that isn't implemented by class of actual type
        
        Book book = new Book();
        ShoppingItem shoppingItem = (ShoppingItem)book; // This compiles fine, can cast object of derived type to base type (upcast)
        Printable printable = (Printable)book;          // This compiles fine, can cast object to interface it implements
    
    }
}