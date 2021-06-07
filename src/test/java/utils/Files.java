package utils;


import org.apache.commons.io.FileUtils;


import java.io.File;

import java.io.IOException;

import java.nio.charset.StandardCharsets;


public class Files {
    public static String readTextFromFile(File file) throws IOException {
        return FileUtils.readFileToString(file, StandardCharsets.UTF_8);
    }
    public static String readTextFromPath(String path) throws IOException {
        File file = new File(path);
        return readTextFromFile(file);
    }



}
