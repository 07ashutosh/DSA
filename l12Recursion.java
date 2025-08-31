public class l12Recursion {

    // public static void printNumbers(int n){
    //     if(n==0){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumbers(n-1);
    //     ;
    // }


    // public static void printNumbers(int n){
    //     if(n==6){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumbers(n+1);
    //     ;
    // }

    public static void sumNumbers(int i ,int n , int sum){
        if(i==n){
            sum +=i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        sumNumbers(i+1, n, sum);

    }

    public static void main(String[] args){

        //print numbers from n to 1
        // int n = 5;
        // printNumbers(n);

        
        // print number from 1 to 5 
        // int n = 1;
        // printNumbers(n);


        //Q: print sum of n natural no(s)
        sumNumbers(1,5,0);

    }
}
