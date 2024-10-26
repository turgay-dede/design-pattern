package com.turgaydede.behavioral.strategy;

public class TextFileProcessing implements FileProcessingStrategy {
    @Override
    public void process(String file) {
        System.out.println("Metin dosyası işleniyor: " + file);
    }
}