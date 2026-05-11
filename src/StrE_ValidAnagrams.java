//=======================Brute Force Approach=================================
import java.util.Arrays;
public class StrE_ValidAnagrams {

    public static boolean checkAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }


        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);


        for (int i = 0; i < str1.length(); i++) {
            if (charArray1[i] != charArray2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String Str1 = "INTEGER";
        String Str2 = "TEGERNI";


        if (checkAnagrams(Str1, Str2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}



//======================= Optimized Approach=================================

//public class StrE_ValidAnagrams {
//    public static boolean validAnagram(String s, String t){
//        if(s.length()!=t.length()){
//            return false;
//        }
//        int count [] = new int[26];
//        for (int i = 0; i <s.length(); i++) {
//            char ch = s.charAt(i);
//            count[ch - 'a']++;
//        }
//        for (int i = 0; i <t.length(); i++) {
//            char ch = t.charAt(i);
//            count[ch - 'a']--;
//        }
//        for(int i = 0; i < count.length; i++) {
//            if(count[i] != 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//
//    public static void main (String[] args){
//        String str1 = "cat";
//        String str2 = "tac";
//        if (validAnagram(str1, str2)){
//            System.out.println("Anagram");
//        }
//        else {
//            System.out.println("Not Anagram");
//        }
//    }
//}
