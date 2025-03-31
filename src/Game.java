import java.util.*;

public class Game {

    static void gameStart(String word) {

        Scanner in = new Scanner(System.in);

        int mistakes = 0;
        boolean victory_condition = false;

        //System.out.println(word);

        Set<Character> initialWord = new HashSet<>();
        Set<Character> guessWord = new HashSet<>();
        Set<Character> guessMistakes = new HashSet<>();

        char[] letters_in_initial_word = word.toCharArray();

        for (char c : letters_in_initial_word) {
            initialWord.add(c);
        }

        while (true) {

            System.out.println(GallowsProgress.showState(mistakes));
            System.out.println(WordProgress.getState(word, guessWord));
            System.out.println("MISS: " + mistakes + " " + guessMistakes);
            System.out.println("INSERT LETTER: ");

            char letter = in.next().charAt(0);
            int letterIndex = word.indexOf(letter);

            guessWord.add(letter);

            if (letterIndex == -1) {
                mistakes++;
                guessMistakes.add(letter);
            }

            if (mistakes == 6) {
                //victory_condition = false;
                break;
            }

            if (guessWord.containsAll(initialWord)) {
                victory_condition = true;
                break;
            }

        }
        System.out.println(word);
        gameEnd(victory_condition);
    }

    static void gameEnd(boolean victory) {
        if (victory){
            System.out.println("VICTORY");
        }
        else{
            System.out.println("WASTED");
        }
    }
}
