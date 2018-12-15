import Analyzer.LetterFrequencyCounter;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class LetterFrequencyCounterTest {
    private LetterFrequencyCounter letterFrequencyCounter;

    @Before
    public void setUp() {
        letterFrequencyCounter = new LetterFrequencyCounter();
    }

    @Test
    public void letterFrequencyPositiveTest() {

        Map<Character, Double> letterMap = new HashMap<>();
        {
            letterMap.put('i', 0.25);
            letterMap.put('g', 0.25);
            letterMap.put('o', 0.25);
            letterMap.put('r', 0.25);
        }
        Map actual = letterFrequencyCounter.analyzer("Igor");
        assertEquals(letterMap, actual);

    }


}

