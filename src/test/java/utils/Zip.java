package utils;

import net.lingala.zip4j.exception.ZipException;


public class Zip {
    public static void unzip(String path, String unzipPath, String password) throws ZipException {
        net.lingala.zip4j.core.ZipFile zipFile = new net.lingala.zip4j.core.ZipFile(path);
        if (zipFile.isEncrypted ()) {
            zipFile.setPassword (password);
        }
        zipFile.extractAll(unzipPath);
    }

    public static void unzip(String path, String unzipPath) throws ZipException {
        unzip(path, unzipPath, "");
    }
}
