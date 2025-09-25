import java.util.*;

public class l18_arrayList {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();

        //add
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get element
        int elem = list.get(2);
        System.out.println(elem);

        //adding element at any index
        list.add(0,9);
        System.out.println(list);

        //set element (replacing existing element)
        list.set(1,8);
        System.out.println(list);

        //delete element
        list.remove(4);
        System.out.println(list);

        //size 
        int size = list.size();
        System.out.println(size);

        //loop
        for(int i=0;i< list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);

    }

    
}
