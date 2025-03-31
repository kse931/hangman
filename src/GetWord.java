import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GetWord {
    static String[] arrayOfWords = {
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

    static String getRandomWord() {
        List<String> dictionary = Arrays.asList(arrayOfWords);
        int wordIndex = new Random().nextInt(dictionary.size());
        return dictionary.get(wordIndex);
    }

}
