class Student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //non peramertized constructor

    // Student(){
    //     System.out.println("constructoe is called");
    // }

    //perameterized constructor

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class l17_oops {
    public static void main(String[] args){
        Student stud1 = new Student("bhawna",21);
        stud1.printinfo();
    }
    
}
