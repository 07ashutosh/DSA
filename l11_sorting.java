
public class l11_sorting {

    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
    
        //bubble sort

        // int a[] = {7,8,3,2,1};

        // for(int i=0; i<a.length-1; i++){
        //     for(int j=0; j< a.length-i-1; j++){
        //         if(a[j] > a[j+1]){
        //             //swap
        //             int temp = a[j];
        //             a[j] = a[j+1];
        //             a[j+1] = temp;
        //         }
        //     }
        // }
        // printArray(a);


        //selection sort

        // int a[] = {7,8,3,2,1};

        // for(int i=0;i<a.length-1;i++){
        //     int smallest = i;
        //     for (int j = i+1; j<a.length;j++){
        //         if(a[smallest]>a[j]){
        //             smallest = j;
        //         }
        //     } 
        //     int temp = a[smallest];
        //     a[smallest] = a[i];
        //     a[i]=temp;

        // }
        // printArray(a);


        // insertion sort

        int a[] = {7,8,3,2,1};

        for(int i=1;i<a.length;i++){
            int current = i;
            int j = i-1;
            while(j>=0 && current<a[j]){
                a[j+1] = a[j];
                j--;
            }
            //placement
            a[j+1] = current;
        }


        printArray(a);

    }
    
}
