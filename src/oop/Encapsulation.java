package oop;

/**
 * @author Shadman Shariar
 * @Email shadmanshariar007@gmail.com
 */
public class Encapsulation {
    
    public static void main(String[] args) {
      
        Laptop a1 = new Laptop();
        
        a1.setPrice(10000);
        a1.setName("Asus");
        System.out.println(a1.getPrice());
        System.out.println(a1.getName());
    }
    
//    public void doWalk(){
//    
//        System.out.println("Walking from Encapsulation Class Public");
//    
//    }
//    private void doWalk(){ // Access for this class only for "private"
//    
//        System.out.println("Walking from Encapsulation Class Private");
//    
//    }
    
}
class Laptop{ // Encapsulation

    private int price;
    private String name;

    public void setName(String name) { // set private value using public setter
        this.name = name;
    }

    public void setPrice(int price){ // set private value using public method
    this.price = price;
    }

    public String getName() { // getter to get name
        return name;
    }
    
    public int getPrice() { // getter to get price
        return price;
    }
    

}