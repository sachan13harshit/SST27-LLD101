package com.example.imports;

import java.nio.file.Path;
import java.util.List;

public interface DataReader {
    List<String[]> read(Path path);
}