package tests;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.readXlsxFromPath;

public class XlsxFileTest {
    @Test
    void xlsxTest() {
        String xlsxFilePath = "./src/test/resources/Text.xlsx";
        String expectedText = "Победить!";
        String actualData = readXlsxFromPath(xlsxFilePath);
        assertThat(actualData, containsString(expectedText));
    }
}
