public class app {

    //  * main class requeired public and static 
    public static void main(String[] args) {
        // Creating object of class
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.roll_no = 101;
        s1.marks = 90;
        s1.display();

        // ? bank acc
        BankAccount user1 = new BankAccount();
        user1.username = "kese ho";
        // user1.password = "1234"; // this is a private access 
        //  ? inseted we use settter method to set the pass 
        user1.setPass("hello");
        

    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPass(String pass){
        password = pass ;
    }
}

// ? when we create a class , it doesn't reserve the memeory , but we are creating the instance of that class , the the instance resever the memeory 

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