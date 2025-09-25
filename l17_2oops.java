//abstraction

// abstract class Animal {
//     abstract void walk();
//     Animal(){
//         System.out.println("i am god ,and i'm are creating a new animal");
//     }
// }
// class Horse extends Animal{
//     Horse(){
//         System.out.println("creating ghoda");
//     }
//     public void walk(){
//         System.out.println("walks on 4 legs");
//     }
// }
// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("walks on 2 legs");
//     }
// }

// interface
interface Animal{
    public void walks();
    public void eats();
}

class Horse implements Animal{
    public void walks(){
        System.out.println("walks on 4 legs");
    }

    public void eats(){
        System.out.println("eats chana and grass");
    }
}

public class l17_2oops {
    public static void main(String [] args){
        // abstraction
        
        Horse horse = new Horse();
        horse.walks();
        horse.eats();
        
       

        
    }
    
}
