package org.example.reader;

import org.example.exception.CustomException;

import java.nio.file.Path;
import java.util.List;

public interface DataReader {
    public List<String> readDataLines(Path filePath) throws CustomException;
}
