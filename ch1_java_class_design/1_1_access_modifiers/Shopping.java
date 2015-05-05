public class Shopping {

    public static void main(String[] args) {
        Printable book = new Book();
        book.print();           //Should print "Printing Book"
        
        ShoppingItem shopItem = new Book();
        shopItem.description(); // Should print "Shopping Item"
    }


}

interface Printable {
    
    public void print();

}

class Book extends ShoppingItem implements Printable {

    @Override
    public void print() {
        System.out.println("Printing Book");
        
    }
    
    public void description() {
        System.out.println("Book");
    }
    

}

class ShoppingItem {


    public void description() {
        System.out.println("Shopping Item");
    }

}