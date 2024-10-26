package com.turgaydede.behavioral.strategy;

public class FileProcessor {

    private FileProcessingStrategy strategy;

    public FileProcessor(FileProcessingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(FileProcessingStrategy strategy) {
        this.strategy = strategy;
    }

    public void processFile(String file) {
        strategy.process(file);
    }
}