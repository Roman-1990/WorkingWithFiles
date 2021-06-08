package tests;


import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getXls;

public class XlsFileTest {
    @Test
    void xlsTest() throws IOException {
        String xlsFilePath = "./src/test/resources/Text.xls";
        String expectedText = "Победить!";
        XLS xls = getXls(xlsFilePath);
        assertThat(xls, XLS.containsText(expectedText));
    }

    @Test
    void xlsCellTest() throws IOException {
        String xlsFilePath = "./src/test/resources/Text.xls";
        String expectedText = "Победить!";

        XLS xls = getXls(xlsFilePath);
        String actualData = xls.excel.getSheetAt(0).getRow(2).getCell(1).toString();
        assertThat(actualData, containsString(expectedText));
    }

}
