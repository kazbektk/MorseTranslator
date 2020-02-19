package com.javalab.morseTranslator;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

abstract class MorseTranslator {
    protected String textToTranslate;
    abstract String translate();
}
