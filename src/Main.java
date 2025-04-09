import java.util.Scanner;

import static java.lang.System.exit;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Начать новую игру?(д/н)");
            char answer = scanner.next().charAt(0);
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