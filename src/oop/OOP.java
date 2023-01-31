package oop;
/**
 * @author Shadman Shariar
 * @Email shadmanshariar007@gmail.com
 */
public class OOP { // Class

    public static void main(String[] args) { // Method
        
       Person p1 = new Person(); // Creating Person class object name as p1
                                 // Calling 
       p1.name = "Shadman Shariar";
       p1.age = 24; // Setting value using object
       System.out.println("Name : "+p1.name);
       System.out.println("Age : "+p1.age);
       
       Person p2 = new Person(); // Creating Another Person class object name as p1
       p2.name = "Anik";
       p2.age = 25; // Setting Another value using object
       System.out.println("Name : "+p2.name);
       System.out.println("Age : "+p2.age);
       p1.walk();
       p2.eat();
       p1.walk(20);
       System.out.println("Total : "+Person.count); // access Class properties directly can use class name
   
       Person p3 = new Person("Shadman",24);
       System.out.println("From direct : "+p3.name+" and "+p3.age);
    
       Developer dv = new Developer("Boss",29);
       System.out.println("Dev name : "+dv.name);
       dv.walk();
       
//       Encapsulation ec = new Encapsulation();
//       ec.doWalk();
       
    }
    
}

class Person{

String name ; // Properties
int age;
static int count; // using static it will be class properties not object properties
public Person(){ // Constructor same name as Class name
count++;
    System.out.println("Count : "+count);
}

public Person(String newname, int newage){ // Constructor overloading, direct set in new object
    
    this(); // using "this" we can use another constructor
    name = newname;
    age = newage;
    
//    this.name = newname;  // if same name variable
//    this.age = newage;
}

public void walk(){ // behaviour / method / return type void / public
System.out.println(name+" is walking");

}

public void walk(int steps){ // perameter - steps is argument
System.out.println(name+" is walking "+steps+" steps");

}
public void walk(double steps){ // Method Overloading only can use or different argument
System.out.println(name+" is walking "+steps+" steps");

}

public void eat(){ // behaviour / method / /return type void / public
System.out.println(name+" is eating");

}
}
class Developer extends Person{ // Inheritance // Parent class Person Child class Developer

    public Developer(String newname, int newage) {
        super(newname, newage); // calling Parent Class (Person) constructor using super
    }   
    public void walk(){ // behaviour / method / return type void / public
    System.out.println("Dev "+name+" is walking");

    }
}