import java.util.Arrays;

public class StringPracSheet {
    public static void Q1(String s){
        int lowerCase = 0;
        int upperCase = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)<'a'){
              upperCase++;
            }
            if(s.charAt(i)>'Z'){
                lowerCase++;
            }
        }
        System.out.println("UpperCase letter count :" + upperCase);
        System.out.println("LowerCase letter count:"+ lowerCase);
    }
 public static boolean anagrams(String s1, String s2){
  
    // this is code will fail in the testcase -> "aacc" & "ccac" o/p will be true but it is not correct
    // NOTE 
    // to convert string to char array function
    // char s1Arr[] = s1.toCharArray(); -> ['e','a','t']
   boolean l1[] = new boolean[26];
   if(s1.length() == s2.length()){
    for(int i = 0; i<s1.length();i++){
        char c1 = s1.charAt(i);
        int index1 = c1- 'a';
        l1[index1] = true;
    }
    
    // check at each unique index of character  of string 2 
    for(int i=0; i<s2.length(); i++){
        char c2= s2.charAt(i);
        // index for 2nd string character 
        int index2 = c2-'a';
    // if at any point there is no match for particular 
    //charater of string 2 in array of string 1 then return false
       if( l1[index2] != true){
        return false;
       }
    }
    return true;
}
    return false;
    /*
   * note this code can be converted to this for all testcases solve it later
   static {
        for (int i = 0; i < 1000; i++) {
            isAnagram("", "");
        }
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }

        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
   */
 }

 // OR 
 public static void anagramspar2() {
    String s1 = "eat";
    String s2 = "tea";
    char[] s1Arr = s1.toCharArray();
    char[] s2Arr = s2.toCharArray();

    Arrays.sort(s1Arr);
    Arrays.sort(s2Arr);
    System.out.println(Arrays.equals(s1Arr,s2Arr));
    
 }
    public static void main(String args[]){
    //   String s = "SHIIIiiiiiii";
    //  Q1(s);
   System.out.println( anagrams("tea", "eap"));
    }
}
