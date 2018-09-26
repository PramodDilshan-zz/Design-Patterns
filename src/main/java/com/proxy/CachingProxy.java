package com.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class CachingProxy implements Document{

    private Map<String,Integer> wordCount = new HashMap<>();

    private final Document document;

    private int wordCountEx;

    public CachingProxy(Document document) {
        this.document = document;
    }

    @Override
    public int getWordCount(String word) {
        if (wordCount.get(word) != null){
            return wordCount.get(word);
        }
        else{
            wordCountEx = document.getWordCount(word);
            wordCount.put(word,wordCountEx);
            return wordCountEx;
        }
    }
}
