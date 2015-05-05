class Super {}
class Sub extends Super {}
public class TestClass  {
	
	public static void main(String[] args) {
		Super s1 = new Super();
		Sub s2 = new Sub();
		s2 = (Sub)s1;
	}
}