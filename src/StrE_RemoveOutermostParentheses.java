public class StrE_RemoveOutermostParentheses {
    public static String removeOuterParentheses(String s){
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for(int i =0; i< s.length(); i++){
            if(s.charAt(i)==')'){
                count --;
            }
            if(count != 0){
                ans.append(s.charAt(i));
            }
            if(s.charAt(i)=='('){
                count ++;
            }
        }
        return ans.toString();
    }


    public static void main(String arr[]){
         String s = "(()())(())";
        String ans = removeOuterParentheses(s);
        System.out.println("The result is: " + ans);
    }
}
