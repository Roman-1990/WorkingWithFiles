package Tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.readTextFromPath;


public class TxtFileTest {
    @Test
    void txtTest () throws IOException {
        String txtFilePath = "./src/test/resources/text.txt";
        String expectedData = "Привет учитель!";

        String actualData = readTextFromPath (txtFilePath);
        assertThat (actualData, containsString (expectedData));
    }
}
