package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.readTextDocxFromPath;

public class DocxFileTest {
    @Test
    void docxTest() throws IOException {
        String docxFilePath = "./src/test/resources/text.docx";
        String expectedData = "Word";
        String actualData = readTextDocxFromPath(docxFilePath);
        assertThat(actualData, containsString(expectedData));
    }


}
