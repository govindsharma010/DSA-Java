import java.util.*;
public class HeapSort {
    public static void heapify(int arr[], int i, int size){
        // building maxHeap
        int left = 2*i + 1;
        int right = 2*i + 2;
        int maxIdx = i;

        if(left < size && arr[left] > arr[maxIdx]){
            maxIdx =  left;
        }
        if(right < size && arr[right] > arr[maxIdx]){
            maxIdx =  right;
        }

        if(maxIdx != i){ // if heap is not a max heap at curr node then only fix it
           // swap
           int temp  = arr[i];
           arr[i] = arr[maxIdx];
           arr[maxIdx] = temp;

           //fix till last level
           heapify(arr, maxIdx, size);

        }
    }

    public static void heapSort(int arr[]){
        // form max heap // overall nlogn + nlogn =  nlogn 
        int n = arr.length;
        for(int i = n/2; i>=0; i--){ // O(n)
            heapify(arr,i,n); // O(logn)
        }

        //step 2 push largest to end
        for(int i=n-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i]; 
            arr[i] = temp;
            heapify(arr, 0, i); // size decreases as i decreases and fix remaining heap
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};
        heapSort(arr);

        //print
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
