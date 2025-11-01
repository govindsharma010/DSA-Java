public class ArraysPractsheet16 {
    public static boolean pQ1(int num[]){
        for(int i=0;i<num.length-1;i++){ // note i<num.length-1
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                return true;
                }
            }
        
        }
       return false;
    }

    //PQ2
    public static int pQ2(int num[], int key){
        int keyindx;
        for(int i=0; i<num.length;i++){
            if(num[i]==key){
                keyindx = i; 
                for(int j=0; j<num.length; j++){
                    int temp = num[j];
                    num[j] = key;
                    num[keyindx] = temp;
                    keyindx++;
                }
            }
            else{
                return -1;
            }
        }
       
       
    }
    public static void main(String args[]){
        int num[] = {1, 2, 3, 4, 5,5};
        System.out.println(pQ1(num));
    }
    
}

