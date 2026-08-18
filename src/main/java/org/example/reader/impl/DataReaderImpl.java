package org.example.reader.impl;

import org.example.exception.CustomException;
import org.example.reader.DataReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class DataReaderImpl implements DataReader {
    @Override
    public List<String> readDataLines(Path filePath) throws CustomException {
        try {
            return Files.readAllLines(filePath);
        } catch (IOException e) {
            throw new CustomException("Failed to read data from " + filePath, e);
        }
    }
}
