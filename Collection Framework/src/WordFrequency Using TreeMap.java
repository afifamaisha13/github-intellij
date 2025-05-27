// Counts word frequency using TreeMap
import java.util.*;

public class WordFrequencyTreeMap {
    public static void main(String[] args) {
        String text = "I am Afifa Tahsin Haq";
        String[] words = text.split(" ");
        TreeMap<String, Integer> map = new TreeMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
