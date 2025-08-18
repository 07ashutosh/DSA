import java.util.*;
class firstClass{
    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();  
        //next sirph ek he word store karta hai jaise "ashutosh" or agr me "ashutosh tiwari" likhta hu to sirf "ashutosh" hi store hoga iss liya hum nextLine() use karte hain jo ki puri line ko store karta hai. 
        System.out.println("Hello " + name + ", welcome to the world of Java!");


    }
}