public class DividenConquer {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void mergeSort (int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei- si)/2;
        mergeSort(arr, si, mid); 
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);  
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1]; //as 0 array are having 0 based indeixng so we have to add 1 to set length acc to no of element
        int i = si;
        int j= mid+1;
        int k = 0;
        while(i<=mid && j<=ei){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
 z 
                // or temp[k++] = arr[i++];
                // as at the end we have to increment both i and k after assigning the values
                // so by unary operator first we set the value to the current i, and k the they incremented
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //what if  i > leftarray ki length and there is element left in right array (and vice versa for right array)
        //so for that 
        // for leftover element for the 1st sorted part or left part
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        // for leftover element for the 2nd sorted part or right part
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        // copy temp array to the original array 
        for(k=0, i=si; k<temp.length; i++,k++){
            arr[i] = temp[k];
        }

    }

    //QUICK SORT
    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        // last element
        int pIdx = partition(arr,si,ei); 
        quickSort(arr, si, pIdx-1); // left
        quickSort(arr, pIdx+1, ei); // right
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; // to make place for element smaller that pivot 
        for(int j =si; j<ei; j++){
            if(arr[j] <= pivot){
            i++;
            //swap
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            }
        }   
    i++;
    int temp = pivot;
    arr[ei] = arr[i]; // remember cant do this-> pivot = arr[i]
    arr[i] = temp;
    return i;
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        // mergeSort(arr, 0, arr.length-1);
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
       }
}
