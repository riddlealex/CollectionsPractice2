package collections.practice.Task1;

/**Задача 1
 * Задан текст на английском языке.
 * Выделить все различные слова.
 * Для каждого слова подсчитать частоту его встречаемости.
 * Слова, отличающиеся регистром букв, считать различными.**/

public class WordRunner {

    public static void main(String[] args) {
        String text = "The wise man smiled and said: " +
                "You can’t laugh at the same joke over and over. " +
                "So why are you always crying about the same problem?";

        System.out.println(WordUtil.calcWordFrequency(text));

    }
}
