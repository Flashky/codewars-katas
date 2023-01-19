package com.codewars.katas.kyu4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class TopWords {
	
	private static final String WORD_APOSTROPHE_REGEX = "([a-z']*)";
	private static final String SIMPLE_WORD_REGEX = "\\w";
	private static final Pattern PATTERN_WORD = Pattern.compile(WORD_APOSTROPHE_REGEX);
	
    public static List<String> top3(String s) {

    	Map<String, Integer> wordOccurences = new HashMap<>();
    	
    	Matcher matcher = PATTERN_WORD.matcher(s.toLowerCase());
    	
    	while(matcher.find()) {
    		String word = matcher.group(1);	
    		String testWord = word.replaceAll(SIMPLE_WORD_REGEX,"x");
    		if(StringUtils.isNotBlank(word) && testWord.contains("x")) {
    				int occurences = wordOccurences.getOrDefault(word, 0) + 1;
    				wordOccurences.put(word, occurences);
    		}
    	}
    	
        return wordOccurences.entrySet().stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).limit(3).map(Entry::getKey).toList();
    }
}
