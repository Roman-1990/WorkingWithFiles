package tests;


import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.readTextDocFromPath;

public class DocFileTest {
    @Test
    void docTest() throws IOException {
        String docFilePath = "./src/test/resources/text.doc";
        String expectedData = "Word";
        String actualData = readTextDocFromPath(docFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}
