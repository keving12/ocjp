public class TryTest {

    public static void main(String[] args) {
        try {
            if(true) {
                throw new A();
            }
            if(true) {
                throw new B();
            }
            
        
        }
        /*catch( A | B e) {
            if(e instanceof A) {
                ((A)e).doIt();
            }
            else {
                ((B)e).doIt();
            }
            
           // e.doIt();
        } */
        catch(A e) {
            e.doIt();
            
        }
        catch(B e) {
            e.doIt();
        }
    }
}

class A extends Exception {
    
    public void doIt() {
        System.out.println("A is doing it");
    
    }

}

class B extends Exception {

    public void doIt() {
        System.out.println("B is doing it");
    
    }

}