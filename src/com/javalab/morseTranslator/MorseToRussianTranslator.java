package com.javalab.morseTranslator;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class MorseToRussianTranslator extends MorseTranslator {
    private static Map<Character, String> russianMorseAlphabet;

    static{
        russianMorseAlphabet = new HashMap<>();
        russianMorseAlphabet.put('а', ".-");
        russianMorseAlphabet.put('б', "-...");
        russianMorseAlphabet.put('в', ".--");
        russianMorseAlphabet.put('г', "--.");
        russianMorseAlphabet.put('д', "-..");
        russianMorseAlphabet.put('е', ".");
        russianMorseAlphabet.put('ж', "...-");
        russianMorseAlphabet.put('з', "--..");
        russianMorseAlphabet.put('и', "..");
        russianMorseAlphabet.put('й', ".---");
        russianMorseAlphabet.put('к', "-.-");
        russianMorseAlphabet.put('л', ".-..");
        russianMorseAlphabet.put('м', "--");
        russianMorseAlphabet.put('н', "-.");
        russianMorseAlphabet.put('о', "---");
        russianMorseAlphabet.put('п', ".--.");
        russianMorseAlphabet.put('р', ".-.");
        russianMorseAlphabet.put('с', "...");
        russianMorseAlphabet.put('т', "-");
        russianMorseAlphabet.put('у', "..-");
        russianMorseAlphabet.put('х', "....");
        russianMorseAlphabet.put('ц', "-.-.");
        russianMorseAlphabet.put('ч', "---.");
        russianMorseAlphabet.put('ш', "----");
        russianMorseAlphabet.put('щ', "--.-");
        russianMorseAlphabet.put('ъ', "--.--");
        russianMorseAlphabet.put('ы', "-.--");
        russianMorseAlphabet.put('ь', "-..-");
        russianMorseAlphabet.put('э', "..-..");
        russianMorseAlphabet.put('ю', "..--");
        russianMorseAlphabet.put('я', ".-.-");
    }

    private  MorseToRussianTranslator(){}
    public MorseToRussianTranslator(String textToTranslate){
        this.textToTranslate = textToTranslate;
    }

    @Override
    public String translate() {
        char[] textChar = this.textToTranslate.toLowerCase().toCharArray();
        //System.out.println(textChar);
        String translatedText = new String();
        for (char c: textChar) {
            if(russianMorseAlphabet.containsKey(c)){
                translatedText += russianMorseAlphabet.get(c) + " ";
            }
        }
        return translatedText;
    }
}