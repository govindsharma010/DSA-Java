// sorting in descending order
import java.util.*;
public class practice17 {
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("bubble sorting");
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int largestPos= i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[largestPos]<arr[j]){
                    largestPos = j;
                }
             }
            //swap
            int temp = arr[i];
            arr[i] = arr[largestPos];
            arr[largestPos] = temp; 

        }
        System.out.println("Selection sorting");
    }
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]<curr ){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //put the number at right position
            arr[prev+1] = curr;
        }
        System.out.println("Insertion sorting");
    }
    public static void countingSorting(int arr[]){
       int largest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int j=0;
      for(int i=count.length-1; i>=0;i--){
        while(count[i]>0){
            arr[j] = i;
            j++;
            count[i]--;
        }
    }
    System.out.println("counting sorting :");
}

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String [] args){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSorting(arr);
        printArr(arr);
    }
    
}
