public class Strings {
    public static float getShortest(String path){
        int x=0,y=0;
        for(int i=0 ;i<path.length();i++){

            char dir = path.charAt(i);
            if(dir=='E'){
                x++;
            }
            else if(dir=='W'){
                x--;
            }
            else if(dir=='N'){
                y++;
            }
            else{
                y--;
            }
           
            
        }
        int X= x*x;
        int Y = y*y;
        return (float)Math.sqrt(X+Y);
    }
    public static String subString(String str, int si, int ei){
        String sub = "";
        for(int i= si;i<ei;i++){
           sub+= str.charAt(i);  //concatnation
        }
        return sub;
    }

    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(getShortest(path));
        String str = "Govind";
        System.out.println(subString(str,2,5));
       //inbuilt function for substring
        System.out.println(str.substring(2,5));
    }
}
