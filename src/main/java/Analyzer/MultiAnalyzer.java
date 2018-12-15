package Analyzer;


import java.util.ArrayList;

public class MultiAnalyzer {

    private final ArrayList<Analyzer> analyzers;

    MultiAnalyzer(ArrayList<Analyzer> analyzers) {
        this.analyzers = analyzers;
    }

    public void performAnalyzis(String text) {
        for (Analyzer analyzer : analyzers) {
            analyzer.analyzer(text);
        }
    }

}