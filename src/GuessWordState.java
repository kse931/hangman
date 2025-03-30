import java.util.HashMap;
import java.util.Set;

public class GuessWordState {
    static String getState(String word, Set<Character> guessWord) {
        String empty = "_".repeat(word.length());
        char[] emptyarray = empty.toCharArray();
        char[] wordarray = word.toCharArray();
        for (int i = 0; i < wordarray.length; i++) {
            if (guessWord.contains(wordarray[i])) {
                emptyarray[i] = wordarray[i];
            }
        }
        return new String(emptyarray);
    }
}
