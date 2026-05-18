import java.util.Arrays;

public class CharExercises{

    public static void main(String[] args){
    System.out.println(Arrays.toString(letterHist("hello my name is braeden")));
    System.out.println(isAnagram("stop","pots"));
    System.out.println(canSpell("quijibo","jib"));
    
    }

    public static int[] letterHist(String input){
        int[] count = new int[26];
        String lower = input.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char letter = lower.charAt(i);
            // if statement when a space is present or special character
            if (letter >= 'a' && letter <= 'z') {
                int index = letter - 'a';
                count[index]++;
            }
        }
        return count;



    } 

    public static boolean isAnagram(String word1, String word2){
        int[] check1 = letterHist(word1);
        int[] check2 = letterHist(word2);
        for (int i = 0; i < check1.length; i++){
            if (check1[i] != check2[i]){
                return false;
            }
        } 
        return true;
    }

    public static boolean canSpell(String letters, String word){
        int[] collection = letterHist(letters);
        int [] collection2 = letterHist(word);
        for (int i = 0; i < collection.length; i++){
            if (collection2[i] > collection[i]){
                return false;
            }
        }
        return true;

    } 
        

} 

