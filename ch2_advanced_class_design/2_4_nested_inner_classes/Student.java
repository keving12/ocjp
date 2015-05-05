public class Student {

    void attendLectures() {
       int value = 10;
       Lecture lecture = new Lecture();
       lecture.notes(new Pen() {
           public void write() {
               value = 12;
               System.out.println("I am writing");
           }
                
       });
    }
}

class Lecture {
    
    public void notes(Pen pen) {
        pen.write();
    }
    
    
}

class Pen {
    
    public void write() {
        System.out.println("Pen-writing");
        
    }
    
}