public class check {
    public static void main(String[] args) {
        int [][] arr = new int[][]{{50,10},{5,500},{0,20}};
        int min = arr[0][0];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                 if(arr[i][j]< min){
                    min = arr[i][j];
                 }
            }
        }
        System.out.println(min);
    }
}
