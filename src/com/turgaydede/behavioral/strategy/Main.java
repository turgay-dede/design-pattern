package com.turgaydede.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor(new ImageFileProcessing());
        processor.processFile("resim.jpg");

        processor.setStrategy(new TextFileProcessing());
        processor.processFile("dosya.txt");
    }
}