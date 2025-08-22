public class l4_patterns {
    public static void main(String[] args){

        //printing rectangle star pattern
        
        // for(int i=1;i<=4;i++){
        //     for (int j=1;j<=5;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // printing inverted right angle triangle

        // for(int i=1;i<=4;i++){
        //     for (int j=1;j<=5-i;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
            
        // }

        // print a hollow rectangle star pattern

        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //         if(i==1 || i==4 || j==1 || j==5){
        //             System.out.print(" * ");
        //         }else{
        //             System.out.print("   ");
        //         }
        //     }
        //     System.out.println();
        // }
        
        //right angle triangle star pattern

        // for(int i=1;i<=4;i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }
        
        // printing inverted right angle triangle(method 2)

        // for(int i=4;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // printing right side right angle triangle

            // for(int i=1;i<=4;i++){
            //     for(int j=1;j<=4-i;j++){
            //         System.out.print("   ");
            //     }
            //     for(int j=1;j<=i;j++){
            //         System.out.print(" * ");
            //     }
            //     System.out.println();
            // }

         // printing number right angle triangle

        //  for (int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        //  }
            
        // reverse right angle triangle

        // for(int i=5;i>=1;i--){
        //     for (int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // } 
        // method two

        // for (int i=1;i<=5;i++){
        //     for(int j=1;j<=5-i+1;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // floyds triangle patern 
        // int n = 5;
        // int num = 1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println();
        // }

        // 0-1 triangle pattern
        
        // int n = 5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         if((i+j)%2==0){
        //             System.out.print("1 ");
        //         }else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Print a solid rhombus.

        for(int i=1;i<=4;i++){
                for(int j=1;j<=4-i;j++){
                    System.out.print("   ");
                }
                for(int j=1;j<=4;j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }

        // primid

        // for(int i=1;i<=4;i++){
        //         for(int j=1;j<=4-i;j++){
        //             System.out.print("   ");
        //         }
        //         for(int j=1;j<=i;j++){
        //             System.out.print(" * ");
        //         }
        //         for(int j=1;j<=i-1;j++){
        //             System.out.print(" * ");
        //         }
        //         System.out.println();
        //     }

        //Print a number pyramid

        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     for(int j=i-1;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //Print a palindromic number pyramid.
        





    }
}
