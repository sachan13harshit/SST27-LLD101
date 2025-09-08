package com.example.report;

import java.nio.file.Path;
import java.util.Map;
import java.util.Objects;

public class ReportBundleFacade {
    private final JsonWriter writer = new JsonWriter();
    private final Zipper zipper = new Zipper();
    private final AuditLog log = new AuditLog();

    public Path export(Map<String,Object> data, Path outDir, String baseName) {
        Objects.requireNonNull(data, "data");
        Objects.requireNonNull(outDir, "outDir");
        Objects.requireNonNull(baseName, "baseName");

        Path json = writer.write(data, outDir, baseName);

        Path zip = zipper.zip(json, outDir.resolve(baseName + ".zip"));

        log.log("exported " + zip);

        return zip;
    }
}