package Analyzer;

import java.util.stream.Stream;

public class WordCounter implements Analyzer {


    public Integer analyzer(String text) {
        if (text.equals("")){return 0;}
        else {
            long sum = Stream.of(text.split(" ")).parallel().count();
            return (int)sum;
        }


    }

}
