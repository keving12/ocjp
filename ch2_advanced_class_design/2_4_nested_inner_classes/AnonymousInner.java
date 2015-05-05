public class AnonymousInner {

    static Pen pen = new Pen(){};
    
    public static void main(String[] args) {
        System.out.println(new Pen());
        System.out.println(pen);
    
    
    }


}

class Pen {

    public void write() {
        System.out.println("Writing with Pen");
    }


}