package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;


import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.readTextCsvFromPath;

public class CsvFileTest {

    @Test
    void csvTest() throws IOException {
        String csvFilePath = "./src/test/resources/Text.csv";
        String expectedData = "Win!";
        String actualData = readTextCsvFromPath(csvFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}
