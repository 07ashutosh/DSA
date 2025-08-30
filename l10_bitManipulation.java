public class l10_bitManipulation {
    public static void main(String[] args){
        // get bit

        // Q: get the 3rd bit (positin = 2) of the number n.(n=0101)

        // bit mask = 1<<i;
        // operation = AND

        // int n=5 ;
        // int pos = 2;
        // int BitMask = 1<<pos;

        // if((BitMask & n)== 0){
        //     System.out.println("bit was zero");
        // }else{
        //     System.out.println("bit was one");
        // }


        // set bit
        // Q: set the second bit (position = 1) of the number n.(n=0101)
        // bit mask = 1<<i;
        // operation = OR

        // int n=5;
        // int pos = 1;
        // int bitMask = 1<<pos;

        // if((bitMask | n)==n){
        //     System.out.println("bit was alredy one");
        // }else{
        //     int newNumber = bitMask | n;
        //     System.out.println("the new number is: "+newNumber);
        // }


        // clear bit

        // Q: clear the 3rd bit (position = 3) of the number n.(n=0101)
        // bit mask = 1<<i;
        // operation = AND with NOT
        int n=5;
        int pos = 2;
        int bitMask = 1<<pos;

        int notbitmask = ~(bitMask);
        int newNumber = notbitmask & n;

        System.out.println("the new number is :"+ newNumber);


        


    }

}