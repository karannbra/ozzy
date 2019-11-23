package collection.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> wordCount = new HashMap<>();

        wordCount.put("quick", 2);
        wordCount.put("brown", 4);
        wordCount.put("fox", 1);


        for (String word : wordCount.keySet()) {
            System.out.printf("Słowo %s wystąpiło %d razy.\n", word, wordCount.get(word));
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.printf("Słowo %s wystąpiło %d razy.\n", entry.getKey(), entry.getValue());
        }

    }


    private void moveForward(int a) throws Exception {
        if (a < 0) throw new Exception("a should be positive");
        // ...
    }
}