public class l15_mergeSort {
    public static void conquer(int arr[],int si,int mid,int ei){
        int merged[]= new int[ei-si+1]; //declaring an array of given size
        
        int indx1 = si;
        int indx2 = mid+1;
        int x = 0;

        while(indx1 <= mid && indx2 <= ei){
            if(arr[indx1] <= arr[indx2]){
                merged[x] = arr[indx1];
                x++; 
                indx1++;
            }else{
                merged[x] = arr[indx2];
                x++; 
                indx2++;
            }
        }
        
        // for other extra elements
        while(indx1 <= mid ){
             merged[x++] = arr[indx1++];
        }

        while(indx2 <= ei){
            merged[x++] = arr[indx2++];
        }

        //for coppying all the element in the merged array
        for(int i =0, j=si;i<merged.length;i++,j++){
            arr[j]= merged[i];
        }
    }
    public static void divide(int arr[],int si,int ei){
        //si = starting index   ,   ei = ending index
        //basecase
        if(si>=ei){
            return ;
        }
       int mid = si + (ei-si)/2; 
       //for first part
       divide(arr, si, mid);
       //for next part
       divide(arr, mid+1, ei);

       conquer(arr,si,mid,ei);
    }
    public static void main(String[] args){
        //time complexcity = nlogn 
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        divide(arr, 0, n-1);
        //print
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    
}
