public class leetSubstringProb {
    public static int lengthOfLongestSubstring(String s){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<s.length(); i++){
            int count = 1; int j=i+1;
            while(i<s.length()-1 && j<s.length() && s.charAt(i) != s.charAt(j)){
                count++;
                j++;

            }
            int index = count;
            System.out.println(s.substring(i,index));
            int l = s.substring(i,index).length();
            if(l>max){
                max= l;
            }
        }

        return max;
    }
    public static void main(String args[]){
        String s = "abcadb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}