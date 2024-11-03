package com.turgaydede.behavioral.strategy.file;

public class ImageFileProcessing implements FileProcessingStrategy {
    @Override
    public void process(String file) {
        System.out.println("Resim dosyası işleniyor: " + file);
    }
}