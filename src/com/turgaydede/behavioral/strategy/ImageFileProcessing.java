package com.turgaydede.behavioral.strategy;

public class ImageFileProcessing implements FileProcessingStrategy {
    @Override
    public void process(String file) {
        System.out.println("Resim dosyası işleniyor: " + file);
    }
}