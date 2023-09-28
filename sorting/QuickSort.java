public class QuickSort {
    public static void main(String[] args) {
        int arr[]= {1,4,6,4,8,210,3,678};
        System.out.println("Before sorting");
        printArr(arr);
        System.out.println("After sorting");
        quickSort(arr, 0, arr.length-1);
        printArr(arr);

    }
    // for Sorting
    public static void quickSort(int arr[],int si, int ei) {
        if(si>=ei){
            return;
        }
        // pivot as last index
        int pivotIndex = partition(arr,si,ei);
        quickSort(arr, si, pivotIndex-1);
        quickSort(arr, pivotIndex+1, ei);
    }


    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i=si-1;

        for(int j=si;j<ei;j++){
            if(arr[j]<= pivot){
                i++;
                // swap
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
                // swap
                int temp = pivot;
                arr[ei]=arr[i];
                arr[i]=temp;
                return i;

    }
    // for Printing
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       System.out.println();
    }
}
