import java.util.*;

public class Game {

    static final int LAST_MISTAKE = 6;
    static final String ENTER = "\n";

    static void gameStart(String word) {

        Scanner inputScanner = new Scanner(System.in);

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
            System.out.println(ENTER);
            System.out.println(GallowsProgress.showState(mistakes));
            System.out.println(WordProgress.getState(word, guessWord));
            System.out.println("Ошибки: " + mistakes + " " + guessMistakes);
            System.out.print("Введите букву: ");

            char letter = inputScanner.next().charAt(0);
            int letterIndex = word.indexOf(letter);

            guessWord.add(letter);

            if (letterIndex == -1) {
                mistakes++;
                guessMistakes.add(letter);
            }

            if (mistakes == LAST_MISTAKE) {
                break;
            }

            if (guessWord.containsAll(initialWord)) {
                victoryCondition = true;
                break;
            }

        }
        gameEnd(victoryCondition, word);
    }

    static private void gameEnd(boolean victory, String word) {
        if (victory){
            System.out.println(ENTER);
            System.out.println("Слово: " + word.toUpperCase());
            System.out.println("Победа:D Поздравляем!!");
            System.out.println(ENTER);
        }
        else{
            System.out.println(ENTER);
            System.out.println(GallowsProgress.showState(LAST_MISTAKE));
            System.out.println("           П О М Е Р");
            System.out.println("Слово: " + word.toUpperCase());
            System.out.println(ENTER);

        }
    }
}
