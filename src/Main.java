import java.util.Scanner;

import static java.lang.System.exit;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Start a new game?(y/n)");
            char answer = sc.next().charAt(0);
            switch (answer) {
                case 'y':
                    Game.gameStart();
                    break;
                case 'n':
                    exit(0);
            }
        }
    }
}