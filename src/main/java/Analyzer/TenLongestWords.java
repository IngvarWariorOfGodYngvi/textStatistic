package Analyzer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TenLongestWords implements Analyzer {
    @Override
    public List<String> analyzer(String text) {
        String regexPattern = "[\n?!/,;: .-]+";
//        List<String> stringList;
//        stringList = Arrays.asList(text.split("[ .]"));
//        return stringList.stream().distinct().sorted(Comparator.comparing(String::length).reversed()).limit(10).collect(Collectors.toList());

        List<String> stringList = Arrays.asList(text.toLowerCase().split(regexPattern));
        return stringList.stream()
                .distinct()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(10)
                .collect(Collectors.toList());
    }
}
