package DDT;

import java.io.File;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class FetchingDataFromPDF {

	public static void main(String[] args) throws Throwable
	{
		File fis = new File("./src/test/resources/multipage-pdf.pdf");
		PDDocument doc = PDDocument.load(fis);
		
		int pages = doc.getNumberOfPages();  //for displaying total number of pages
		System.out.println(pages);
		
		PDFTextStripper pdfData = new PDFTextStripper();  // for displaying content of all the pages
//		String readData = pdfData.getText(doc);
//		System.out.println(readData);
		
//		pdfData.setStartPage(3);               //for displaying from particular page to end page
//		String readData = pdfData.getText(doc);
//		System.out.println(readData);
		
		pdfData.setStartPage(3);    //for displaying same page which is given
		pdfData.setEndPage(3);
		String readData = pdfData.getText(doc);
		System.out.println(readData);
	}

}
