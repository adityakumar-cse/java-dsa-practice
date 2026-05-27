import java.util.HashSet;

public class CountTheNumberofSpecialCharacters_I {

    public static int numberOfSpecialChars(String word){
        HashSet<Character> lower = new HashSet<>();
        HashSet<Character> upper = new HashSet<>();

        for ( char ch : word.toCharArray()){
            if(Character.isLowerCase(ch)){
                lower.add(ch);
            }
            else {
                upper.add(Character.toLowerCase(ch));
            }}
            int count = 0;

            for(char ch : lower){
                if(upper.contains(ch)){
                    count++;
                }
            }
        return count;
    }
    public static void main(String args[]){
        String word = "aaAAbBBbcc";
        System.out.println("Special characters count: " + numberOfSpecialChars(word));
    }
}
