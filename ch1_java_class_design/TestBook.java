public class TestBook {

    public static void main(String[] args) {
        Book b1 = new CourseBook();
        b1.print();
    }


}

class Book {
    static void print() {
        System.out.println("Book printing");
    }


}

class CourseBook extends Book {

    void print() {
        System.out.println("CourseBook Printing");
    }

}