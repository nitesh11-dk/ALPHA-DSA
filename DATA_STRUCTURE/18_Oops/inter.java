public class inter {
    public static void main(String[] args) {
        

// ! INterfaces  ( Multiple inhertiance )
//  class is the blueprint for creating objects 
//  interface is the blueprint for creating classes 
//  100% abstraction and multiple inheritaance 
//   - all methods are public , abstract and without implementation 
//  - used to achieve toatl abstraction 
//  _ variables in the interface are final , public and static 

Queen  q = new Queen();
// q.moves();

// ! multiple inheritance using interface 
Child child = new Child();
        // child.showFatherTraits();  // Inherited from Father
        // child.showMotherTraits();  // Inherited from Mother
        // child.showChildTraits();   // Child's own method


//  ? Static keyword 
// static keyword  in java is used to share the same variable or method of a given class 
// Student s1= new Student();
// s1.setName("ayush");
// s1.getName();
// s1.schoolName = "lions clubb" ; // ye static hoga yani ki same reference hoga sare object jo studnet class se bani hai 
Student s2 = new Student();
// System.out.println(s2.schoolName); // name same hai school ka 
// System.out.println(s1.returnPercentage(2,40, 50));

//  ? we can aslo make block and nested classes , but it is not asked in interview so , ... 

//  ! Super , is used to refer immediate parent class object 
//  - to access parent properties , function and constrctor 
 Teacher t1 = new Teacher("Tushar");
//  System.out.println(t1.name);


    }
}

interface ChessPlayer{
    void  moves(); //  by def it is public and abbstract 
}

class Queen implements ChessPlayer{
    @Override
    public void moves(){
        System.out.println("up down left down,diagonal in all four direction");
    }
}

class Rook implements ChessPlayer{
    @Override
    public void moves(){
        System.out.println("up down left down");
    }
}

class King implements ChessPlayer{
    @Override
    public void moves(){
        System.out.println("up down left down,diagonal by one step");
    }
}

// Father interface
interface Father {
    void showFatherTraits();
}

// Mother interface
interface Mother {
    void showMotherTraits();
}

// Child class implementing both Father and Mother interfaces
class Child implements Father, Mother {
    @Override
    public void showFatherTraits() {
        System.out.println("Child has Father’s traits: Strong and Disciplined.");
    }

    @Override
    public void showMotherTraits() {
        System.out.println("Child has Mother’s traits: Caring and Intelligent.");
    }

    public void showChildTraits() {
        System.out.println("Child has unique traits: Creative and Curious.");
    }

}

//  ++++++++++++++++++++++++++
class Student {
    String name ;
    int roll ;
    static String schoolName;
    void setName(String name){
        this.name = name ;
    }
     void getName(){
        System.out.println(this.name);
    }
    static int returnPercentage(int m , int s , int e){
        return (m + s+e)/3;
    } 
}

class User{
    String name ;
    User(String name){
     this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Teacher extends User {

    Boolean canTeach ;
    Teacher(String name){
        super(name);
        this.canTeach = true ;
    }

}


