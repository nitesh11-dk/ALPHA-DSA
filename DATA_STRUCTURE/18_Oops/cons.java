public class cons {

    public static void main(String[] args) {
        // * constructor overloading , matlb kii based on the arguments passed to the
        // constructor, the suitable constuctor is caleed , is overloading of
        // constructor
        Student s1 = new Student("ayush");
        Student s2 = new Student(12121);
        System.out.println(s1.name);
        System.out.println(s2.roll);
        // * type of constructor
        // ? parameterisized
        // ? non-parameterisized
        // ? constructor overloading , polymorphism

        // ? copy constructor , bydeafult we dont get in java , but in c++ we get
        
        // ! yak obj ki sare property ko dusare obj me copy kar lena
        Student clv = new Student("niteh");
        clv.roll = 101;
        clv.marks[0] =12 ;
        clv.marks[1] =54 ;
        clv.marks[2] =34 ;

        Student clv2 = new Student(clv);
        clv2.password = "xyz";
        clv.marks[1] =55 ; // array ka refernce jara hai , but obj hoga to yuska vhi hoga  ;

        //  for(int i = 0 ; i < clv2.marks.length;i++){
        //     System.out.println(clv.marks[i]);
        //  }

        // ! inheritance 
        //? single level inheritance 
        //? Multi level inheritance
        // ? Hirerarchial inheritance
        // ? hybrid inheritance 
        //  * Multiple inhertiaance , 2 class se yak single class bana -- ( Interface)
        // ! Polymorishm 
        // ? Compile time polymorphism - method overloading
        // ? run time  polymorphism - method overriding

//  !  method overrloading or function overloading 
//  multiple  function having the same name but differernt paramter is called  function overloading

//  !  method overriding 
//  * parant and child clasees both contain the same function with a different definition 

// ! Packgages in java 
//  * packgae is  a group of similar types of classes , interfaces  , and sub-packages





    Fish fsh = new Fish();
    fsh.eat(); // this is called inehritance 
     
    
    }
    

}

//  * Java handles destructing automatically 


class Student {
    String name;
    int roll;
    String password;
   int marks[];
    // ?copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks; // marks array hai so referrence copy hoga 
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
        // system out println();
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
        // system out println();
    }

}

// Inheritance 

class Animal{
String color ;

void eat(){
    System.out.println("easts");
}

}

class Fish extends Animal{
    int fins ;
    void swim(){
        System.out.println("swims in water");
    }


}