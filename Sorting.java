public class Sorting {
    public static void bubbleSort(int arr[]){
        int swap = 0;
        for(int turn=0; turn<arr.length-1;turn++){
            for(int j=0;j<=arr.length-2-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
               

            }
            if(swap==0){
                System.out.println("Array is already sorted!");
                System.out.println("Number of swaps are:" + swap);
                break;
            }                        
        }
        System.out.println("swaps"+swap);

    }

// Selection sort
public static void selectionSort(int arr[]){
    for(int i=0;i<arr.length-1;i++){
        int minPos = i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[minPos]> arr[j]){
                minPos = j;
            }
        }
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
    }
}

// Insertion sort 
//{12, 5, 6, 18, 3, 24}
public static void insertionSort(int arr[]){
    for(int i=1;i<arr.length;i++){
        int curr = arr[i];
        int prev = i-1;
        //finding position for insertion by checking 
        while(prev>=0 && arr[prev]>curr){
            arr[prev+1] = arr[prev];
            prev--;
        }
        //insertion 
        arr[prev+1] = curr;
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }

}
public static void countingSort(int arr[]){
    int largest = Integer.MIN_VALUE;
    //finding range of number
    for(int i=0; i<arr.length;i++){
        largest = Math.max(largest,arr[i]);
    }
    // count array
    int count[] = new int[largest+1];
    for(int i=0;i<arr.length;i++){
        count[arr[i]]++;
    }
    //Sorting
    int j=0;
    for(int i=0; i<count.length; i++){
        while(count[i]>0){
            arr[j] = i;
            j++;
            count[i]--;

        }
       
    }
    
}
    public static void printArray(int arr[]){
        for( int i= 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        } 
    }
    public static void main(String args[]){
        int arr[] = {12, 5, 6, 18, 3, 24};
         
        insertionSort(arr);
        // printArray(arr);

        /*here in bubble sort the arr which is passed as argument is the array which is
         already sorted by insertion sort as array get originally change to the main 
        function also unlike string you can this by checking num of swaps in bubble sort
        */

        // bubbleSort(arr);
        // selectionSort(arr);
        // int arr[]= {1, 4, 1, 3, 2, 4, 3, 7};
        // countingSort(arr);

    //    printArray(arr);
    }
}
