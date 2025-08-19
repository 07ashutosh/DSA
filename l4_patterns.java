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

        for(int i=1;i<=4;i++){
            for (int j=1;j<=5-i;j++){
                System.out.print(" * ");
            }
            System.out.println();
            
        }
        
    }
}
