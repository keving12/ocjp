class BaseWithProtected {

    protected int i = 10;
    protected String name = "Kevin";


}

public class ProtectedMember extends BaseWithProtected {

    public void doStuff(BaseWithProtected bwp) {
        bwp.name = "John";
    }

    public static void main(String[] args) {
        BaseWithProtected b = new BaseWithProtected();
        ProtectedMember pm = new ProtectedMember();
        pm.doStuff(b);
        System.out.println(b.name);
    
    }


}