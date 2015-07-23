import java.util.List;
import java.util.ArrayList;
class Gift { }

class Book extends Gift {

    String title;
    Book(String title) {
        this.title = title;
    }
    public String toString() {
        return title;
    }
}

class Courier {

    public static void wrapGift(List<?> list) {
        for(Object item : list) {
            System.out.println("GiftWrap - "+item);
        }
    }
    
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Book1"));
        bookList.add(new Book("Book2"));
        wrapGift(bookList);
        
        List<String> stringList = new ArrayList<String>();
        stringList.add("Bill");
        stringList.add("Ben");
        wrapGift(stringList);
    }
}