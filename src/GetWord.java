import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class GetWord {

    static String filePath = "src/words.txt";

    static public String getRandomWordFromFile() throws IOException {
        String result = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int count = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                count++;
                if (ThreadLocalRandom.current().nextInt(count) == 0) {
                    result = line;
                }
            }
        }
        return result;
    }

}
