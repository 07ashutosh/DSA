class Student{
    String name;
    int age;

    // public void printinfo(){
    //     System.out.println(this.name);
    //     System.out.println(this.age);
    // }

    //non peramertized constructor

    // Student(){
    //     System.out.println("constructoe is called");
    // }
    //perameterized constructor

    // Student(String name, int age){
    
    //     this.name = name;
    //     this.age = age;
    // }

    //polimorfismo
    public void printinfo(String name){
        System.out.println(name);
    }

    public void printinfo(int age){
        System.out.println(age);
    }

    public void printinfo(String name,int age){
        System.out.println(name + " " + age);
    }

}
public class l17_oops {
    public static void main(String[] args){
        Student stud1 = new Student();
        stud1.name = "nancy";
        stud1.age = 22;
        
        stud1.printinfo(stud1.name);
        stud1.printinfo(stud1.age);
        stud1.printinfo(stud1.name,stud1.age);
        
    }
    
}
