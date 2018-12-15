import Analyzer.Analyzer;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import Analyzer.WordCounter;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class WordCounterTest {

    @Test
    @Parameters(method = "wordCounter")
    public void wordCounterTest(String text, Integer counter){
        Analyzer wordCounter = new WordCounter();
        assertEquals(counter,((WordCounter) wordCounter).analyzer(text));


    }

    private Object[] wordCounter(){
        return new Object[]{
                new Object[]{"Ala ma kota",3},
                new Object[]{"Ala ma kota i psa",5},
                new Object[]{"Ala ma kota i psa a do tego je sałatkę",10},

        };
    }

}
