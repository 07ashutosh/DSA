class Student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class l17_oops {
    public static void main(String[] args){
        Student stud1 = new Student();

        stud1.name="ashutosh";
        stud1.age = 22;

        stud1.printinfo();
    }
    
}
