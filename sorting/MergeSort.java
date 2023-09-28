public class MergeSort {


    public static void main(String[] args) {
        int arr[]= {1,4,6,4,8,210,3,678};
        System.out.println("Before Sorting");
        printArr(arr);
        System.out.println("after sorting");
        mergeAlgo(arr, 0, arr.length-1);
        printArr(arr);
      }
    public static void mergeAlgo(int arr[],int si, int ei){
        
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeAlgo(arr,si,mid);//for left sorting
        mergeAlgo(arr, mid+1, ei);//for right sorting
        merge(arr, si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i=si;// iterater for left side array sorting
        int j=mid+1;//iterater for right side sorting
        int k=0;// iterator for temp0 array

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]= arr[j];
                j++;
            }
            k++;
        }

        //for left side
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //for right side
        while (j<=ei) {
            temp[k++]=arr[j++];
        }

        // copy the sorted arry in original array from temp array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];

        }
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       System.out.println();
      //System.out.println(arr.length);

    }
   
}
