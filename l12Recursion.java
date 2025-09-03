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

    // public static int calcFactorial(int n) {
    //     if (n == 1 || n == 0) {
    //         return 1;
    //     }

    //     int nm1 = calcFactorial(n - 1);
    //     int fact = n * nm1;
    //     return fact;
    // }


    // public static void fibonacci(int a, int b, int n){
    //     if(n==0){
    //         return;
    //     }
    //     int c= a+b;
    //     System.out.println(c);
    //     fibonacci(b, c, n-1);

    // }

    // public static int calPower(int x, int n){
    //     if(n==0){
    //         return 1;
    //     }

    //     if(x==0){
    //         return 0;
    //     }
    //     int calnm1 = calPower(x, n-1);
    //     int xpowr = x*calnm1;
    //     return xpowr;
    // }

    public static int calPowerHlogn(int x, int n){
        if(n==0){
            return 1;
        }

        if(x==0){
            return 0;
        }
        if(n%2==0){
            return calPowerHlogn(x, n/2) * calPowerHlogn(x, n/2);
        }else{
            return calPowerHlogn(x, n/2) * calPowerHlogn(x, n/2) * x;

        }
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
        // int n=5;
        // System.out.println(calcFactorial(n));


        //Q: printing fibonacci series
        // int a=0;
        // int b= 1;
        // System.out.println(a);
        // System.out.println(b);
        // int n=7;
        // fibonacci(a, b, n-2);
        

        //Q: print X^n (stack height =n)
        // int x = 2;
        // int n = 5;
        // int sol = calPower(x, n);
        // System.out.println(sol);


        //Q: print X^n (stack height = log n)
        int x = 2;
        int n = 5;
        int sol = calPowerHlogn(x, n);
        System.out.println(sol);
    }
}
