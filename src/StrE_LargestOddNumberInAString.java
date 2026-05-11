public class StrE_LargestOddNumberInAString {
    public static String largestOddNumberInAString(String num){
        for (int i = num.length()-1; i>=0; i--) {
            char ch = num.charAt(i);
            if((ch-'0') % 2 != 0){
                return num.substring(0, i+1);
            }
        }
        return "";
    }
    public static void main (String[] args){
        String num = "549385793476932648248248244";
        System.out.println(largestOddNumberInAString(num));
    }
}
