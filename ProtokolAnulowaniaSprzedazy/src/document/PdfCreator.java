package document;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import ui.MainFrame;
import ui.panels.CommentsPanel;
import ui.panels.InWordsPanel;
import ui.panels.MainInfoPanel;
import ui.panels.ProductPanelLabels;
import ui.panels.ReciepeAndTillPanel;
import ui.panels.TotalSummaryPanel;
import ui.panels.VatSummaryPanel;
import ui.panels.ProductPanel.ProductPanel;
import ui.panels.ReasonInfoPanel.ReasonInfoPanel;

public class PdfCreator {

	public static ArrayList<ProductPanel> panels;

	public static final String DEST = "results/tables/simple_table.pdf";
	private MainInfoPanel infoPanel;
	private ReasonInfoPanel reasonPanel;
	private CommentsPanel commentsPanel;
	private ProductPanelLabels productPanelLabels;
	private TotalSummaryPanel totalSummary;
	private VatSummaryPanel vatSummaryPanel;
	private ReciepeAndTillPanel reciepeAndTillPanel;
	private InWordsPanel inWordsPanel;

	public PdfCreator(MainInfoPanel infoPanel, ReasonInfoPanel reasonPanel, CommentsPanel commentsPanel,
			ProductPanelLabels productPanelLabels, TotalSummaryPanel totalSummary, VatSummaryPanel vatSummaryPanel,
			ReciepeAndTillPanel reciepeAndTillPanel, InWordsPanel inWordsPanel) throws IOException, DocumentException {
		this.infoPanel = infoPanel;
		this.reasonPanel = reasonPanel;
		this.commentsPanel = commentsPanel;
		this.productPanelLabels = productPanelLabels;
		this.totalSummary = totalSummary;
		this.vatSummaryPanel = vatSummaryPanel;
		this.reciepeAndTillPanel = reciepeAndTillPanel;
		this.inWordsPanel = inWordsPanel;
		// panels = new ArrayList<ProductPanel>();
		panels = MainFrame.getProductPanels();
		File file = new File(DEST);
		file.getParentFile().mkdirs();
		createPdf(DEST);
	}

	public void createPdf(String dest) throws IOException, DocumentException {
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(dest));
		document.open();
		Font polishFont = FontFactory.getFont(BaseFont.HELVETICA, BaseFont.CP1250, BaseFont.EMBEDDED, 12);
		Font polishFont2 = FontFactory.getFont(BaseFont.HELVETICA, BaseFont.CP1250, BaseFont.EMBEDDED, 7, Font.BOLD);
		Font polishFont3 = FontFactory.getFont(BaseFont.HELVETICA, BaseFont.CP1250, BaseFont.EMBEDDED, 10, Font.BOLD);
		Font polishFont4 = FontFactory.getFont(BaseFont.HELVETICA, BaseFont.CP1250, BaseFont.EMBEDDED, 8);

		float[] f = { 1, 3 };
		PdfPTable t = new PdfPTable(f);
		t.setWidthPercentage(100);

		PdfPCell cell1 = new PdfPCell();
		cell1.setVerticalAlignment(Element.ALIGN_BOTTOM);
		Paragraph p = new Paragraph("mp.", new Font(FontFamily.HELVETICA, 4));
		p.setAlignment(Element.ALIGN_RIGHT);
		cell1.addElement(p);
		cell1.setFixedHeight(75);

		PdfPTable t2 = new PdfPTable(1);
		PdfPCell cell2 = new PdfPCell(t2);
		PdfPCell cell3 = new PdfPCell(new Phrase(
				infoPanel.getCity() + "                                                                                  " + infoPanel.getTimeSpinner(), polishFont3));
		PdfPCell cell4 = new PdfPCell(
				new Phrase(infoPanel.getLblProtocol() + "                            " + infoPanel.getProtocolNumber(),polishFont3));
		PdfPCell cell5 = new PdfPCell(
				new Phrase(reasonPanel.getLblReason() + " : " + reasonPanel.getReasonComboBox(), polishFont3));
		t2.addCell(cell4);
		t2.addCell(cell3);
		t2.addCell(cell5);
		t.addCell(cell1);
		t.addCell(cell2);

		PdfPTable t3 = new PdfPTable(10);
		t3.setWidths(new float[] { 6, 50, 8, 8, 8, 25, 25, 8, 25, 25 });
		t3.setWidthPercentage(100);
		PdfPCell pdfPCell1 = new PdfPCell(new Phrase(productPanelLabels.getOrdinalNumber(), polishFont2));
		pdfPCell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
		t3.addCell(pdfPCell1);
		PdfPCell pdfPCell2 = new PdfPCell(new Phrase(productPanelLabels.getProductName(), polishFont2));
		pdfPCell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
		t3.addCell(pdfPCell2);
		PdfPCell pdfPCell3 = new PdfPCell(new Phrase("Nr PLU", polishFont2));
		pdfPCell3.setVerticalAlignment(Element.ALIGN_MIDDLE);
		t3.addCell(pdfPCell3);
		PdfPCell pdfPCell4 = new PdfPCell(new Phrase(productPanelLabels.getUnitOfMeasure(), polishFont2));
		pdfPCell4.setVerticalAlignment(Element.ALIGN_MIDDLE);
		t3.addCell(pdfPCell4);
		PdfPCell pdfPCell5 = new PdfPCell(new Phrase(productPanelLabels.getQuantity(), polishFont2));
		pdfPCell5.setVerticalAlignment(Element.ALIGN_MIDDLE);
		t3.addCell(pdfPCell5);
		PdfPCell pdfPCell6 = new PdfPCell(new Phrase(productPanelLabels.getPricePerUnit(), polishFont2));
		pdfPCell6.setVerticalAlignment(Element.ALIGN_MIDDLE);
		t3.addCell(pdfPCell6);
		PdfPCell pdfPCell7 = new PdfPCell(new Phrase(productPanelLabels.getValueWithTax(), polishFont2));
		pdfPCell7.setVerticalAlignment(Element.ALIGN_MIDDLE);
		t3.addCell(pdfPCell7);
		PdfPCell pdfPCell8 = new PdfPCell(new Phrase(productPanelLabels.getTaxPercent(), polishFont2));
		pdfPCell8.setVerticalAlignment(Element.ALIGN_MIDDLE);
		t3.addCell(pdfPCell8);
		PdfPCell pdfPCell9 = new PdfPCell(new Phrase(productPanelLabels.getAmountOfTax(), polishFont2));
		pdfPCell9.setVerticalAlignment(Element.ALIGN_MIDDLE);
		t3.addCell(pdfPCell9);
		PdfPCell pdfPCell10 = new PdfPCell(new Phrase(productPanelLabels.getValueWithoutTax(), polishFont2));
		pdfPCell10.setVerticalAlignment(Element.ALIGN_MIDDLE);
		t3.addCell(pdfPCell10);

		PdfPTable t4 = new PdfPTable(10);
		t4.setWidths(new float[] { 6, 50, 8, 8, 8, 25, 25, 8, 25, 25 });
		t4.setWidthPercentage(100);
		for (int a = 0; a < 7; a++) {
			t4.addCell(panels.get(a).getOrdinalNumber().getText());
			t4.addCell(new Phrase(panels.get(a).getProductName().getText(),polishFont4));
			t4.addCell("   ");
			t4.addCell(panels.get(a).getUnitOfMeasure().getText());
			t4.addCell(panels.get(a).getQuantity().getText());
			t4.addCell(panels.get(a).getPricePerUnit().getText());
			t4.addCell(String.valueOf(panels.get(a).getValueWithTax()));
			t4.addCell(panels.get(a).getTaxPercent());
			t4.addCell(String.valueOf(panels.get(a).getAmountOfTax()));
			t4.addCell(panels.get(a).getValueWithoutTax().getText());
		}
		for (int a = 0; a < 5; a++) {
			t4.addCell(" ");
			t4.addCell(" ");
			t4.addCell(" ");
			t4.addCell(" ");
			t4.addCell(" ");
			t4.addCell(" ");
			t4.addCell(" ");
			t4.addCell(" ");
			t4.addCell(" ");
			t4.addCell(" ");
		}

		PdfPTable t5 = new PdfPTable(3);
		t5.setWidths(new float[] { 80, 25, 83 });
		t5.setWidthPercentage(100);

		PdfPTable t51 = new PdfPTable(1);
		PdfPCell cell51a = new PdfPCell(
				new Phrase(commentsPanel.getTxtpnComments() + " " + commentsPanel.getComments(), polishFont3));
		cell51a.setFixedHeight(55);
		// t51.addCell(commentsPanel.getTxtpnComments() + " " +
		// commentsPanel.getComments());
		PdfPCell cell51b = new PdfPCell();
		cell51b.setVerticalAlignment(Element.ALIGN_MIDDLE);

		Paragraph p1 = new Paragraph(inWordsPanel.getValue() + "  " + inWordsPanel.getAmount(), polishFont3);
		Paragraph p2 = new Paragraph(inWordsPanel.getInWordsLabel(), polishFont3);
		Paragraph p3 = new Paragraph(inWordsPanel.getInWords(), polishFont3);
		Paragraph p4 = new Paragraph(inWordsPanel.getLblCashier(), polishFont3);
		Paragraph p5 = new Paragraph(inWordsPanel.getCashier(), polishFont3);
		cell51b.addElement(p1);
		cell51b.addElement(p2);
		cell51b.addElement(p3);
		cell51b.addElement(p4);
		cell51b.addElement(p5);
		t51.addCell(cell51a);
		t51.addCell(cell51b);
		t5.addCell(t51);

		PdfPCell cell52 = new PdfPCell(new Phrase(commentsPanel.getTxtpnTaxSummary(), polishFont3));
		cell52.setVerticalAlignment(Element.ALIGN_MIDDLE);
		t5.addCell(cell52);
		PdfPTable t52 = new PdfPTable(1);
		PdfPTable t521 = new PdfPTable(4);
		t521.setWidths(new float[] { 25, 8, 25, 25 });
		t521.addCell(vatSummaryPanel.getValueSummary().getText() + " ");
		t521.addCell(vatSummaryPanel.getTaxPercent().getText() + " ");
		t521.addCell(vatSummaryPanel.getTaxSummary().getText() + " ");
		t521.addCell(vatSummaryPanel.getValueWithoutTaxSummary().getText() + " ");
		for (int a = 0; a < 4; a++) {
			t521.addCell(" ");
			t521.addCell(" ");
			t521.addCell(" ");
			t521.addCell(" ");
		}
		PdfPTable t522 = new PdfPTable(1);
		PdfPTable t5221 = new PdfPTable(4);
		t5221.setWidths(new float[] { 25, 8, 25, 25 });
		t5221.addCell(vatSummaryPanel.getValueSummary().getText()+" ");
		t5221.addCell(" ");
		t5221.addCell(vatSummaryPanel.getTaxSummary().getText()+" ");
		t5221.addCell(vatSummaryPanel.getValueWithoutTaxSummary().getText()+" ");
		t522.addCell(t5221);
		Paragraph p5221 = new Paragraph("£¹czna wartoœæ protoko³u", polishFont3);
		//doesn't work aligment to center/middle
		p5221.setAlignment(Element.ALIGN_MIDDLE);
		
		t522.addCell(p5221);
		t52.addCell(t521);
		t52.addCell(t522);
		t5.addCell(t52);
		
		PdfPTable t6 = new PdfPTable(2);
		t6.setWidths(new float [] {2,1});
		t6.setWidthPercentage(60);
		t6.setHorizontalAlignment(Element.ALIGN_LEFT);
		t6.addCell(new Phrase(totalSummary.getTxtpnDecreasingGrossSales(), polishFont3));
		t6.addCell(new Phrase("kwota z³  "+totalSummary.getTotalValue(),polishFont3));
		t6.addCell(new Phrase(totalSummary.getTxtpnDecreasingTax(),polishFont3));
		t6.addCell(new Phrase("kwota z³  "+totalSummary.getTax(),polishFont3));
		t6.addCell(new Phrase(totalSummary.getTxtpnDecreasingNetSales(),polishFont3));
		t6.addCell(new Phrase("kwota z³  "+totalSummary.getNetValue(),polishFont3));
		Paragraph br = new Paragraph(" ");
		
		PdfPTable t7 = new PdfPTable(2);
		t7.setWidthPercentage(60);
		t7.setHorizontalAlignment(Element.ALIGN_LEFT);
		t7.addCell(new Phrase(reciepeAndTillPanel.getTxtpnReciepeAdded(), polishFont3));
		t7.addCell(new Phrase(" "+reciepeAndTillPanel.getReciepeNr(), polishFont3));
		t7.addCell(new Phrase(reciepeAndTillPanel.getTxtpnTillNr(), polishFont3));
		t7.addCell(new Phrase(" "+reciepeAndTillPanel.getTillNr(), polishFont3));

		Paragraph postedBy = new Paragraph ("Wystawi³:    ..........................................................      \n\nZatwierdzi³: ..........................................................",polishFont3);
		document.add(t);
		document.add(t3);
		document.add(t4);
		document.add(t5);
		document.add(br);
		document.add(br);
		document.add(t6);
		document.add(br);
		document.add(br);
		document.add(t7);
		document.add(br);
		document.add(br);
		document.add(br);
		document.add(br);
		document.add(postedBy);
		document.close();
	}
}
