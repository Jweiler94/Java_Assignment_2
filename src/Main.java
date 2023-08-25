
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String sampleString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = sampleString.toCharArray();
        HashMap<Character, Integer> countCharacters = new HashMap<>();
        for (char c : charactersInString) {
            if (countCharacters.containsKey(c)) {
                countCharacters.put(c, countCharacters.get(c) + 1);
            } else {
                countCharacters.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : countCharacters.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
    }
