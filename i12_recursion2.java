
public class i12_recursion2 {

    // hainoi tower
    // public static void hanoiTower(int n,String src, String hlpr, String dest ){
    //     if(n==1){
    //         System.out.println("transfer disk "+ n + " from "+ src +" to " + dest);
    //         return;
    //     }
    //     hanoiTower(n-1, src, dest,hlpr);
    //     System.out.println("transfer disk "+ n + " from "+ src +" to " + dest);
    //     hanoiTower(n-1, hlpr,src, dest);
    // }


    //rev string
    // public static void revString(String str, int idx){
    //     if(idx == 0){
    //         System.out.println(str.charAt(idx));
    //         return;
    //     }
    //     System.out.println(str.charAt(idx));
    //     revString(str, idx-1);
    // }


    //Q: finding the 1st and last occurence of an element in a string

    public static int first = -1;
    public static int last = -1;
    public static void findOccurence(String str, int idx ,char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = str.charAt(idx);
        if(currentChar == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }

        findOccurence(str, idx+1, element);

    }

    public static void main(){

        //Q: hanoi tower
        // int n=5;
        // hanoiTower(n, "S", "H", "D");


        //Q: printing reverse string 
        // String str = "Ashutosh";
        // revString(str,str.length()-1);


        //Q: finding the 1st and last occurence of an element in a string
        String str = "abccddaachaah";
        findOccurence(str, 0, 'a');
    }
}
