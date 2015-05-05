public class Employee {

    private String name;
    private int age;
    
    Employee() {
        this("Shreya", 10);
    }
    
    Employee(String newName, int newAge) {
        this();
        this.name = newName;
        this.age = newAge;
    }


}