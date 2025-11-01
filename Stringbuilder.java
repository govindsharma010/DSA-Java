
public class Stringbuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder();
        for(char ch='a';ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb.length());
        System.out.println(sb.toString().toUpperCase());
        // System.out.println(sb.toUpperCase());//wrong!!!!!
    }
}
