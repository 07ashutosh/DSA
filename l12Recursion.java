public class l12Recursion {

    public static void printNumbers(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
        ;
    }

    public static void main(String[] args){

        //print numbers from n to 1
        int n = 5;
        printNumbers(n);

    }
}
