import java.util.*;

//colection framework
public class l19_LinkedList2 {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("List");   // if by chance we missed and write add() then it will add element at last 
        System.out.println(list);
        System.out.println(list.size());

        for(int i = 0; i <list.size(); i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        //removing value on some index
        list.remove(3);
        System.out.println(list);
    }
}
