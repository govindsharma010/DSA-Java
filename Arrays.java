import java.util.*;
public class Arrays {
    public static int getLargest(int numbers[]){
        int largest= Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int  i=0;i<numbers.length;i++){
            if(largest<=numbers[i]){
                largest = numbers[i];
            }

            if(smallest>=numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number of array is" +smallest);

        return largest;
    }

    // Binary Search
    public static int  BinarySearch(int num[],int key){
        int start = 0;  int end = num.length-1;
        while(start<=end){
           int mid= (start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            else if(num[mid]<key){
               start = mid+1;
            }
            else{
              end = mid-1; 
            }
           
        }
        return -1;
    }


    public static void main( String args[]){
        // int numbers[]= {1,2,3,4,7,6,3,9};
        // System.out.println("Largest number in array is " + getLargest(numbers));
        int num[] = {2,4,6,8,10,12,14};
        int key = 4;

        System.out.println("Index number of given key is "+BinarySearch(num, key));

        }


    }
    

