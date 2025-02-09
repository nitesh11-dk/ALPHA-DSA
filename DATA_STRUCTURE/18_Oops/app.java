
public class app {
    //  * main class requeired public and static 
    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.name = "Rahul";
        // s1.roll_no = 101;
        // s1.marks = 90;
        // s1.display();

        BankAccount user1 = new BankAccount();
        user1.username = "kese ho";
        // user1.password = "1234"; // this is a private access 
        //  ? inseted we use settter method to set the pass 
        user1.setPass("hello");
        System.out.println(user1.getId());
    }
}

class BankAccount{
    public String username;
    private String password;
    private String id="Nite1109";
    public void setPass(String pass){
        password = pass ;
    }
    String getId(){
        return this.id;
    }
}

// ? when we create a class , it doesn't reserve the memeory , but we are creating the instance of that class , the the instance resever the memeory 

// ? Encapsulation : - is defiend as the wrapping up of data and methods under a single unit. It also implements data hiding .interface



