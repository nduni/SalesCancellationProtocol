package document;

import java.awt.print.PrinterJob;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.SimpleDoc;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;

import model.FrameReferences;
import ui.MainFrame;
import ui.panels.ProductPanel.ProductPanel;

public class PdfCreator {

	public static ArrayList<ProductPanel> panels;
	
	private FrameReferences pdf;
	

	public PdfCreator(FrameReferences pdf) throws DocumentException, PrintException {
		
		panels = MainFrame.getProductPanels();
		this.pdf=pdf;
		printDocument();
	}
	public PdfCreator(String filePath, FrameReferences pdf) throws FileNotFoundException, DocumentException {
		panels = MainFrame.getProductPanels();
		this.pdf=pdf;
		createPdf(filePath);
		}

	public void printDocument() throws DocumentException, PrintException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		Document document = new Document();
		document.open();
		DocumentPainter documentPainter = new DocumentPainter(pdf, document);
		document.close();
		byte[] pdf = baos.toByteArray();
		DocFlavor docFlavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;  
		PrinterJob printerJob = PrinterJob.getPrinterJob();
	    PrintService printService = null;
	    if(printerJob.printDialog())
	    {
	        printService = printerJob.getPrintService();
	    }
		Doc pdfDoc = new SimpleDoc(pdf, docFlavor, null);
		DocPrintJob printJob = printService.createPrintJob();
		printJob.print(pdfDoc, null);		
		
	}

	public void createPdf(String dest) throws FileNotFoundException, DocumentException {
		
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(dest));
		document.open();
		DocumentPainter documentPainter = new DocumentPainter(pdf, document);
		document.close();
	}

	
}
