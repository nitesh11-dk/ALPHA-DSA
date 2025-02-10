public class abs {
    public static void main(String[] args) {
        
        //  ? Abstration 
//  Hiding all the unnecessary details and showing only the important parts  to the users 

// ? abstract class 
// cannot create a instance of abstract class 
// can have abstraction / non abstract methods 
//  can have constructors 

//   ? abstact method is the method , in which there is no implementation 

 Horse h = new Horse();
//  h.walk();
// Animal  a = new Animal() ; // error  ayega 
//  agar class abstatract nahi hai to app yuske yander ke methods ko abstarct nahi baana satke hai 

//!   can have constructors  , jab instance bana nahi satke hai to conscturcor ka payeda kya hoga 
// h.changeColor();
// System.out.println(h.color);


// ! INterfaces  ( Multiple inhertiance )
//  class is the blueprint for creating objects 
//  interface is the blueprint for creating classes 
//  100% abstraction and multiple inheritaance 
//   - all methods are public , abstract and without implementation 
//  - used to achieve toatl abstraction 
//  _ variables in the interface are final , public and static 


    }
}
abstract class Animal {
    String color ;
    Animal(){
        color = "red" ;
    }
    void eat (){
        System.err.println("kayo kayo ");
    }
    abstract void walk();
}
// ? now abb jab abstract class me abstract method bana hi liya hai , to jab ye class ko koi parent class bananta hai tab yusme walk function ka defineiton bata na padega
class Horse extends Animal{
  @Override
  void walk(){
    System.err.println("chal chal");
  }
  void changeColor(){
    color = "brown";
  }
}
