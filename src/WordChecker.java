import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class WordChecker {
    protected String text;

    public WordChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        String[] parts = text.split("\\P{IsAlphabetic}+");
        Set<String> words = new HashSet<>();
        for (int i = 0; i < parts.length; i++) {
            String wordInText = parts[i].toLowerCase();
            words.add(wordInText);
        }
        return words.contains(word.toLowerCase()); // надо ли учитывать регистр??Сделаю как будто надо
    }

}
