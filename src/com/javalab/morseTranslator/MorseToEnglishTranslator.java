package com.javalab.morseTranslator;

import java.util.HashMap;
import java.util.Map;

public class MorseToEnglishTranslator extends MorseTranslator {
    private static Map<Character, String> englishMorseAlphabet;

    static{
        englishMorseAlphabet = new HashMap<>();
        englishMorseAlphabet.put('a', ".-");
        englishMorseAlphabet.put('b', "-...");
        englishMorseAlphabet.put('c', "-.-.");
        englishMorseAlphabet.put('d', "-..");
        englishMorseAlphabet.put('e', ".");
        englishMorseAlphabet.put('f', "..-.");
        englishMorseAlphabet.put('g', "--.");
        englishMorseAlphabet.put('h', "....");
        englishMorseAlphabet.put('i', "..");
        englishMorseAlphabet.put('j', ".---");
        englishMorseAlphabet.put('k', "-.-");
        englishMorseAlphabet.put('l', ".-..");
        englishMorseAlphabet.put('m', "--");
        englishMorseAlphabet.put('n', "-.");
        englishMorseAlphabet.put('o', "---");
        englishMorseAlphabet.put('p', ".--.");
        englishMorseAlphabet.put('q', "--.-");
        englishMorseAlphabet.put('r', ".-.");
        englishMorseAlphabet.put('s', "...");
        englishMorseAlphabet.put('t', "-");
        englishMorseAlphabet.put('u', "..-");
        englishMorseAlphabet.put('v', "...-");
        englishMorseAlphabet.put('w', ".--");
        englishMorseAlphabet.put('x', "-..-");
        englishMorseAlphabet.put('y', "-.--");
        englishMorseAlphabet.put('z', "--..");
    }

    private  MorseToEnglishTranslator(){}
    public MorseToEnglishTranslator(String textToTranslate){
        this.textToTranslate = textToTranslate;
    }

    @Override
    public String translate() {
        char[] textChar = this.textToTranslate.toLowerCase().toCharArray();
        //System.out.println(textChar);
        String translatedText = new String();
        for (char c: textChar) {
            if(englishMorseAlphabet.containsKey(c)){
                translatedText += englishMorseAlphabet.get(c) + " ";
            }
        }
        return translatedText;
    }
}
