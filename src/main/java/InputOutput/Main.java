package InputOutput;

import Analyzer.*;
//import com.detectlanguage.errors.APIError;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<Analyzer> analyzers = new ArrayList<>();
        analyzers.add(new LetterFrequencyCounter());
        analyzers.add(new TenMostPopularWords());
        analyzers.add(new WordCounter());
        analyzers.add(new TenLongestWords());

        MultiAnalyzer multiAnalyzer = new MultiAnalyzer(analyzers);
        multiAnalyzer.perform();
    }
}