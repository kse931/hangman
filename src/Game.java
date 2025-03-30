import java.util.*;

public class Game {

    static String[] strs = {
            "стол", // это потом будет сосаться из txt файла
            "книга",
            "машина",
            "человек",
            "дерево",
            "солнце",
            "ветер",
            "город",
            "река",
            "улица",
            "квартира",
            "телефон",
            "компьютер",
            "карандаш",
            "животное",
            "настроение",
            "путешествие",
            "возможность",
            "решение"};

    static List<String> dict = Arrays.asList(strs);

    static void gameStart() {

        Scanner in = new Scanner(System.in);
        int wordIndex = new Random().nextInt(dict.size()); // можно сделать отдельный
        String word = dict.get(wordIndex);

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
            //System.out.print("\033[H\033[2J");
            System.out.println(GallowsState.showState(mistakes));
            System.out.println(GuessWordState.getState(word, guessWord));
            System.out.println("MISS: " + mistakes + " " + guessMistakes);
            //System.out.println(guessMistakes);
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
