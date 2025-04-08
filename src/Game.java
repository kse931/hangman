import java.util.*;

public class Game {

    static void gameStart(String word) {

        Scanner in = new Scanner(System.in);

        int mistakes = 0;
        boolean victoryCondition = false;

        Set<Character> initialWord = new HashSet<>();
        Set<Character> guessWord = new HashSet<>();
        Set<Character> guessMistakes = new HashSet<>();

        char[] lettersInInitialWord = word.toCharArray();

        for (char c : lettersInInitialWord) {
            initialWord.add(c);
        }

        while (true) {
            System.out.println("\n");
            System.out.println(GallowsProgress.showState(mistakes));
            System.out.println(WordProgress.getState(word, guessWord));
            System.out.println("MISS: " + mistakes + " " + guessMistakes);
            System.out.print("INSERT LETTER: ");

            char letter = in.next().charAt(0);
            int letterIndex = word.indexOf(letter);

            guessWord.add(letter);

            if (letterIndex == -1) {
                mistakes++;
                guessMistakes.add(letter);
            }

            if (mistakes == 6) {
                break;
            }

            if (guessWord.containsAll(initialWord)) {
                victoryCondition = true;
                break;
            }

        }
        gameEnd(victoryCondition, word);
    }

    static void gameEnd(boolean victory, String word) {
        if (victory){
            System.out.println("\n");
            System.out.println("SECRET WORD: " + word.toUpperCase());
            System.out.println("VICTORY:D Congrats!!");
            System.out.println("\n");
        }
        else{
            System.out.println("\n");
            System.out.println(GallowsProgress.showState(6));
            System.out.println("           W A S T E D");
            System.out.println("SECRET WORD: " + word.toUpperCase());
            System.out.println("\n");

        }
    }
}
