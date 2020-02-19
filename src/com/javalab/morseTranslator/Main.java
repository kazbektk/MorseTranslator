package com.javalab.morseTranslator;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Reader fileToTranslate = new FileReader("exampleFile.txt");
        Scanner scan = new Scanner(fileToTranslate);
        String textToTranslate = new String();
        while(scan.hasNextLine())
            textToTranslate += scan.nextLine();
        System.out.println(textToTranslate);
        MorseTranslator translator = new MorseToRussianTranslator(textToTranslate);
        String translatedText = translator.translate();
        System.out.println(translatedText);
        Writer translatedFile = new FileWriter("translatedFile.txt");
        translatedFile.write(translatedText);
        fileToTranslate.close();
        translatedFile.close();
    }
}
