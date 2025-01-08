package collections.practice.Task1;

import java.util.HashMap;
import java.util.Map;

public final class WordUtil {

    private static final String EMPTY = "";
    private static final String SPACE = " ";

    private WordUtil() {
    }

    public static Map<String, Integer> calcWordFrequency(String text) {
        Map<String, Integer> result = new HashMap<>();
        String[] words = text.replace("?", EMPTY)
                .replace(":", EMPTY)
                .replace(".", EMPTY)
                .replace(":", EMPTY)
                .split(SPACE);
        for (String word : words) {
            Integer oldCount = result.get(word);
            Integer newCount = oldCount == null ? 1 : oldCount + 1;
            result.put(word, newCount);
        }
        return result;
    }

}
