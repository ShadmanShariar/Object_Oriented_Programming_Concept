package oop;

/**
 * @author Shadman Shariar
 * @Email shadmanshariar007@gmail.com
 */
public class Abstraction {
    
    public static void main(String[] args) {
        
        Audi a1 = new Audi();
        a1.start();
        Bmw b1 = new Bmw();
        b1.start();
    }  
}

class Audi extends CarSet{
    // Method override
    @Override
    void start() {
        
        System.out.println("Audi is starting");
    }

}
class Bmw extends CarSet{
    // Method override
    @Override
    void start() {
        System.out.println("BMW is starting");
    }

}
abstract class CarSet{

int price;
abstract void start();
}