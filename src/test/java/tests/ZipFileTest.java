package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.readTextFromPath;
import static utils.Zip.unzip;

public class ZipFileTest {
    @Test
    void zipWithPasswordTest() throws IOException, net.lingala.zip4j.exception.ZipException {
        String zipFilePath = "./src/test/resources/text.zip";
        String unzipFolderPath = "./src/test/resources/files/unzip";
        String zipPassword = "1111";
        String unzipTxtFilePath = "./src/test/resources/files/unzip/text.txt";
        String expectedData = "Привет учитель!";
        unzip(zipFilePath, unzipFolderPath, zipPassword);
        String actualData = readTextFromPath(unzipTxtFilePath);
        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void zipTest() throws IOException, net.lingala.zip4j.exception.ZipException {
        String zipFilePath = "./src/test/resources/text.zip";
        String unzipFolderPath = "./src/test/resources/files/unzip";
        String unzipTxtFilePath = "./src/test/resources/files/unzip/text.txt";
        String expectedData = "Привет учитель!";

        unzip(zipFilePath, unzipFolderPath);

        String actualData = readTextFromPath(unzipTxtFilePath);

        assertThat(actualData, containsString(expectedData));
    }
}
