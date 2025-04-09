import java.util.Scanner;

import static java.lang.System.exit;

class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            System.out.println("Начать новую игру?(д/н)");
            char answer = inputScanner.next().charAt(0);
            switch (answer) {
                case 'д':
                    Game.gameStart(GetWord.getRandomWord());
                    break;
                case 'н':
                    exit(0);
            }
        }
    }
}