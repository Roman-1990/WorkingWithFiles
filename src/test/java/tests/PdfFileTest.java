package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getPdf;

public class PdfFileTest {
    @Test
    void pdfTest() throws IOException {
        String pdfFilePath = "./src/test/resources/Java_from_EPAM_Blinov_2020.pdf";
        String expectedText = "ОГЛАВЛЕНИЕ";

        PDF pdf = getPdf(pdfFilePath);
        assertThat(pdf, PDF.containsText(expectedText));
    }

}
