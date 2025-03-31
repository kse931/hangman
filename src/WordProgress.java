import java.util.Arrays;
import java.util.Set;

public class WordProgress {
    static String getState(String word, Set<Character> guessWord) {

        char[] emptyarray = new char[word.length()];
        Arrays.fill(emptyarray, '_');

        char[] wordarray = word.toCharArray();

        for (int i = 0; i < wordarray.length; i++) {
            if (guessWord.contains(wordarray[i])) {
                emptyarray[i] = wordarray[i];
            }
        }
        return new String(emptyarray);
    }
}
