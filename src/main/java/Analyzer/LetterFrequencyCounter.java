package Analyzer;


import java.util.HashMap;
import java.util.Map;

public class LetterFrequencyCounter implements Analyzer {

    @Override
    public Map<Character, Double> analyzer(String text) {

        Map<Character, Double> letterFrequency = new HashMap<>();
        String textToLowerCase = text.toLowerCase().replaceAll("[^a-z]+", "");
        for (char c : textToLowerCase.toCharArray()) {
            letterFrequency.merge(c,1.0/text.length(),Double::sum);
        }
        return letterFrequency;

    }

}
