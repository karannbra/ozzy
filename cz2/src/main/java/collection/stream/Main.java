package collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Ala");
        words.add("i");
        words.add("Basia");
        words.add("oraz");
        words.add("Zenek");

        List<Integer> wordLengths =
                words.stream()
                .filter(word -> !word.equals("i") && !word.equals("oraz"))
                .map(word -> word.length())
                .collect(Collectors.toList());

        System.out.println(wordLengths);

    }
}
