package com.proxy;

import java.util.Random;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class TextDocument implements Document {
    @Override
    public int getWordCount(String word) {
        return new Random().nextInt();
    }
}
