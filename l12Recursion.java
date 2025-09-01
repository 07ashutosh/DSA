public class l12Recursion {

    // public static void printNumbers(int n){
    // if(n==0){
    // return;
    // }
    // System.out.println(n);
    // printNumbers(n-1);
    // ;
    // }

    // public static void printNumbers(int n){
    // if(n==6){
    // return;
    // }
    // System.out.println(n);
    // printNumbers(n+1);
    // ;
    // }

    // public static void sumNumbers(int i ,int n , int sum){
    // if(i==n){
    // sum +=i;
    // System.out.println(sum);
    // return;
    // }
    // sum +=i;
    // sumNumbers(i+1, n, sum);
    // }

    public static int calcFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int nm1 = calcFactorial(n - 1);
        int fact = n * nm1;
        return fact;
    }

    public static void main(String[] args) {

        // print numbers from n to 1
        // int n = 5;
        // printNumbers(n);

        // print number from 1 to 5
        // int n = 1;
        // printNumbers(n);

        // Q: print sum of n natural no(s)
        // sumNumbers(1,5,0);

        // Q: calculating factorial of n
        int n=5;
        System.out.println(calcFactorial(n));

    }
}
