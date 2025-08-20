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

            for(int i=1;i<=4;i++){
                for(int j=1;j<=4-i;j++){
                    System.out.print("   ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
            
    }
}
