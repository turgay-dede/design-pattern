package com.turgaydede.behavioral.strategy.file;

public class TextFileProcessing implements FileProcessingStrategy {
    @Override
    public void process(String file) {
        System.out.println("Metin dosyası işleniyor: " + file);
    }
}