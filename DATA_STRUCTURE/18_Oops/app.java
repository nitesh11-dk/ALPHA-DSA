public class app {

    public static void main(String[] args) {
        // Creating object of class
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.roll_no = 101;
        s1.marks = 90;
        s1.display();
    }
}

class Student {
    String name;
    int roll_no;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks: " + marks);
    }
}