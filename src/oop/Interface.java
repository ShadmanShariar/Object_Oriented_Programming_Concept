package oop;

/**
 * @author Shadman Shariar
 * @Email shadmanshariar007@gmail.com
 */
public class Interface implements Teacher,Student  {
    
    public static void main(String[] args) {
        Interface im = new Interface();
        im.start();
        im.walk();
    }

    @Override
    public void start() {
        System.out.println("Starting "); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void walk() {
        System.out.println("Walking "); //To change body of generated methods, choose Tools | Templates.
    }
    
}
interface Teacher{
void start();
}
interface Student{
void walk();
}