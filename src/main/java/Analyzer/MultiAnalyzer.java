package Analyzer;
import InputOutput.InputFromFile;
import com.detectlanguage.DetectLanguage;
import com.detectlanguage.errors.APIError;


import java.util.ArrayList;

public class MultiAnalyzer {

    private final ArrayList<Analyzer> analyzers;

    public MultiAnalyzer(ArrayList<Analyzer> analyzers) {
        this.analyzers = analyzers;
    }

    public void performAnalyzis(String text) {
        for (Analyzer analyzer : analyzers) {
            analyzer.analyzer(text);
        }
    }

    private TenMostPopularWords tenMostPopularWords = new TenMostPopularWords();
    private WordCounter wordCounter  = new WordCounter();
    private TenLongestWords tenLongestWords = new TenLongestWords();
    private LetterFrequencyCounter letterFrequencyCounter = new LetterFrequencyCounter();

    public void perform(){
//        DetectLanguage.apiKey = "aa87b41910ef4f3bb955c4a5ade38d03";
        String text = InputFromFile.readTextFromFile("C:\\Users\\Igor\\Desktop\\TextStatistic.txt");
//        String language = DetectLanguage.simpleDetect(text);
//        System.out.println("Frequency of each letter " + letterFrequencyCounter.analyzer(text));
//        System.out.println("The longest words are " + tenLongestWords.analyzer(text));
        System.out.println("The most popular words are " + tenMostPopularWords.analyzer(text));
//        System.out.println("Number of words in the text " + wordCounter.analyzer(text));
//        System.out.println("Language used in the text: " + language);

    }

}