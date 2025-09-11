// class Student{
//     String name;
//     int age;

//     // public void printinfo(){
//     //     System.out.println(this.name);
//     //     System.out.println(this.age);
//     // }

//     //non peramertized constructor

//     // Student(){
//     //     System.out.println("constructoe is called");
//     // }
//     //perameterized constructor

//     // Student(String name, int age){
    
//     //     this.name = name;
//     //     this.age = age;
//     // }

//     //polimorfismo
//     public void printinfo(String name){
//         System.out.println(name);
//     }

//     public void printinfo(int age){
//         System.out.println(age);
//     }

//     public void printinfo(String name,int age){
//         System.out.println(name + " " + age);
//     }

// }
// public class l17_oops {
//     public static void main(String[] args){
//         Student stud1 = new Student();
//         stud1.name = "nancy";
//         stud1.age = 22;
        
//         stud1.printinfo(stud1.name);
//         stud1.printinfo(stud1.age);
//         stud1.printinfo(stud1.name,stud1.age);
        
//     }
    
// }

// inheritance

public class l17_oops{
    // single level inheritance
    class Shapes{
        public void area(){
            System.out.println("print area");
        }
    }
    class Triangle extends Shapes{
        public void area(int l, int h){
            System.out.println(1/2*l*h);
        }
    }

    //start of multilevel inheritance
    class EquilateralTriangle extends Triangle{
        public void area(int l, int h){
            System.out.println(1/2*l*h);
        }
    }

    //hierarchial inhritence (when a single parent class is inherit by multiple child)
    class Circle extends Shapes{
        public void area(int r){
            System.out.println((3.14)*r*r);
        }
    }
    public static void main(String [] args){

    }
}


