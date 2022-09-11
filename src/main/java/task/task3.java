package task;

import java.util.*;

public class task3 {
    public static void main(String[] args) {
        Map<String, String> word = new HashMap<>();
        word.put("car", "ca6$$#_rtwheel");
        word.put("cwhl", "cartwheel");
        word.put("cwhee", "cartwheel");
        word.put("cartwheel", "cartwheel");
        word.put("cwheeel", "cartwheel");
        word.put("lw", "cartwheel");
        for (Map.Entry<String, String> entry : word.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.equalsIgnoreCase(value)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
/*
Set<String> set = new TreeSet<>();
            for (int i = 0; i < word.size(); i += Character.charCount(i)) {
                int cp= 0;
                cp = word.(i);
                set.add(String.valueOf(cp));
            }
*/
            /*char[] chars1 = word.toCharArray();
            char[] chars2 = word.toCharArray();
            Arrays.sort(chars1);
            Arrays.sort(chars2);

            return Arrays.equals(chars1, chars2);
        }*/
    }
    }}




