import java.util.LinkedList;
public class UseDeque {


    public static void main(String[] args) {
        UseDeque instance = new UseDeque();
        instance.queueOps();
    }
    
    public void queueOps() {
        LinkedList<Person> asQueue = new LinkedList<>();
        asQueue.add(new Person("Dave"));
        asQueue.add(new Person("Jim"));
        asQueue.offerFirst(new Person("Fred"));
        // Peek at person at front of asQueue - informs who is but leaves them there
        assert(asQueue.peek().getName().equals("Fred")) : "Fred is not at the front";
        // Pop the person off the front of the asQueue - head of asQueue becomes next person in asQueue
        assert(asQueue.pop().getName().equals("Fred")) : "Unexpected person at front of asQueue";
        assert(asQueue.size() == 2) : "incorrect number: "+asQueue.size();
        assert(asQueue.peek().getName().equals("Dave")) : "Unexpected person at front of asQueue";
        
        LinkedList<Person> asStack = new LinkedList<>();
        asStack.push(new Person("Rebecca"));
        asStack.push(new Person("Sally"));
        assert(asStack.pop().getName().equals("Sally")) : "Unexpected person on top of stack";
        assert(asStack.size() == 1) : "Incorrect number of elements on stack";
        assert(asStack.pop().getName().equals("Rebecca")) : "Unexpected person on top of stack";
        
    
    
    }
    
    private class Person {
        private String name;
        
        public Person() {
            
        }
        
        public Person(String name) {
            this.name = name;
        }
        
        public String getName() {
            return name;
        }
        
        public boolean equals(Object obj) {
            if(obj instanceof Person) {
                Person p = (Person)obj;
                if(this.getName().equals(p.getName())) {
                    return true;
                }
            }
            return false;
        }
    }


}