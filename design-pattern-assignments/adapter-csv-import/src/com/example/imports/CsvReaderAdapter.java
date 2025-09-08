package com.example.imports;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class CsvReaderAdapter implements DataReader {
    private final NaiveCsvReader naiveCsvReader = new NaiveCsvReader();

    @Override
    public List<String[]> read(Path path) {
        return naiveCsvReader.read(path);
    }
}
