public class ImpLearnings {
    public static void main(String args[]){
        int ft;
        int i = 0;
        int st = 0;
        do{
            ft = st;
            st = i; //st will be 0 after 1 loop not 1;/
            System.out.println(ft + st);
            i++;
            
        }while(i!=2);
    } 
}
