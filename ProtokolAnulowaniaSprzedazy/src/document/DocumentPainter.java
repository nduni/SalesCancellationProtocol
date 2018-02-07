package document;

import java.util.ArrayList;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

import controller.CompanyDataController;
import model.Company;
import model.FrameReferences;
import ui.MainFrame;
import ui.panels.ProductPanel.ProductPanel;

public class DocumentPainter {

	public static ArrayList<ProductPanel> panels;
	private FrameReferences frameReferences;
	
	public DocumentPainter(FrameReferences pdf, Document document) throws DocumentException {
		this.frameReferences = pdf;
		paintDocument(document);

	}

	public void paintDocument(Document document) throws DocumentException {
		Font microFont = FontFactory.getFont(BaseFont.HELVETICA, BaseFont.CP1250, BaseFont.EMBEDDED, 4); 
		Font baseFont = FontFactory.getFont(BaseFont.HELVETICA, BaseFont.CP1250, BaseFont.EMBEDDED, 7, Font.BOLD);
		Font fontUsedByWidgets = FontFactory.getFont(BaseFont.HELVETICA, BaseFont.CP1250, BaseFont.EMBEDDED, 10,
				Font.BOLD);
		Font fontWithPolishCharacters4 = FontFactory.getFont(BaseFont.HELVETICA, BaseFont.CP1250, BaseFont.EMBEDDED, 8);

		float[] f = { 1, 3 };
		PdfPTable companyDataMainInfoAndReason = new PdfPTable(f);
		companyDataMainInfoAndReason.setWidthPercentage(100);

		PdfPCell companyInfo = new PdfPCell();
		companyInfo.setVerticalAlignment(Element.ALIGN_BOTTOM);
		Paragraph p = new Paragraph("mp.", microFont);
		p.setAlignment(Element.ALIGN_RIGHT);
		
		CompanyDataController companyDataController = new CompanyDataController();
		Company company = companyDataController.readCompanyData();
		Paragraph companyNameParagraph = new Paragraph(company.getName(), baseFont);
		Paragraph companyStreetParagraph = new Paragraph(company.getAddress().getStreet(), baseFont);
		Paragraph companyPostalCodeParagraph = new Paragraph(company.getAddress().getPostalCode(), baseFont);
		Paragraph companyCityParagraph = new Paragraph(company.getAddress().getCity(), baseFont);
		Paragraph companyNipParagraph = new Paragraph(company.getNip(), baseFont);
		companyNameParagraph.setAlignment(Element.ALIGN_CENTER);
		companyStreetParagraph.setAlignment(Element.ALIGN_CENTER);
		companyPostalCodeParagraph.setAlignment(Element.ALIGN_CENTER);
		companyCityParagraph.setAlignment(Element.ALIGN_CENTER);
		companyNipParagraph.setAlignment(Element.ALIGN_CENTER);
		
		companyInfo.addElement(companyNameParagraph);
		companyInfo.addElement(companyStreetParagraph);
		companyInfo.addElement(companyPostalCodeParagraph);
		companyInfo.addElement(companyCityParagraph);
		companyInfo.addElement(companyNipParagraph);

		companyInfo.addElement(p);
		companyInfo.setFixedHeight(75);

		PdfPTable mainInfoAndReasonTable = new PdfPTable(1);
		PdfPCell mainInfoAndReason = new PdfPCell(mainInfoAndReasonTable);
		PdfPCell mainInfo = new PdfPCell(new Phrase(frameReferences.getInfoPanel().getCity()
				+ "                                                                                  "
				+ frameReferences.getInfoPanel().getTimeSpinner(), fontUsedByWidgets));
		PdfPCell protocolNr = new PdfPCell(
				new Phrase(frameReferences.getInfoPanel().getLblProtocol() + "                            "
						+ frameReferences.getInfoPanel().getProtocolNumber(), fontUsedByWidgets));
		PdfPCell reason = new PdfPCell(new Phrase(frameReferences.getReasonPanel().getLblReason() + " : "
				+ frameReferences.getReasonPanel().getReasonComboBox(), fontUsedByWidgets));
		mainInfoAndReasonTable.addCell(protocolNr);
		mainInfoAndReasonTable.addCell(mainInfo);
		mainInfoAndReasonTable.addCell(reason);
		companyDataMainInfoAndReason.addCell(companyInfo);
		companyDataMainInfoAndReason.addCell(mainInfoAndReason);
		PdfPTable productPanelLabels = new PdfPTable(10);

		productPanelLabels.setWidths(new int[] { 6, 50, 8, 8, 8, 25, 25, 8, 25, 25 });
		productPanelLabels.setWidthPercentage(100);
		PdfPCell ordinalNrLabel = new PdfPCell(
				new Phrase(frameReferences.getProductPanelLabels().getOrdinalNumber(), baseFont));
		ordinalNrLabel.setVerticalAlignment(Element.ALIGN_MIDDLE);
		productPanelLabels.addCell(ordinalNrLabel);
		PdfPCell productNameLabel = new PdfPCell(
				new Phrase(frameReferences.getProductPanelLabels().getProductName(), baseFont));
		productNameLabel.setVerticalAlignment(Element.ALIGN_MIDDLE);
		productPanelLabels.addCell(productNameLabel);
		PdfPCell pluNrLabel = new PdfPCell(new Phrase("Nr PLU", baseFont));
		pluNrLabel.setVerticalAlignment(Element.ALIGN_MIDDLE);
		productPanelLabels.addCell(pluNrLabel);
		PdfPCell unitOfMeasureLabel = new PdfPCell(
				new Phrase(frameReferences.getProductPanelLabels().getUnitOfMeasure(), baseFont));
		unitOfMeasureLabel.setVerticalAlignment(Element.ALIGN_MIDDLE);
		productPanelLabels.addCell(unitOfMeasureLabel);
		PdfPCell quantityLabel = new PdfPCell(new Phrase(frameReferences.getProductPanelLabels().getQuantity(), baseFont));
		quantityLabel.setVerticalAlignment(Element.ALIGN_MIDDLE);
		productPanelLabels.addCell(quantityLabel);
		PdfPCell pricePerUnitLabel = new PdfPCell(
				new Phrase(frameReferences.getProductPanelLabels().getPricePerUnit(), baseFont));
		pricePerUnitLabel.setVerticalAlignment(Element.ALIGN_MIDDLE);
		productPanelLabels.addCell(pricePerUnitLabel);
		PdfPCell valueWithTaxLabel = new PdfPCell(
				new Phrase(frameReferences.getProductPanelLabels().getValueWithTax(), baseFont));
		valueWithTaxLabel.setVerticalAlignment(Element.ALIGN_MIDDLE);
		productPanelLabels.addCell(valueWithTaxLabel);
		PdfPCell taxPercentLabel = new PdfPCell(
				new Phrase(frameReferences.getProductPanelLabels().getTaxPercent(), baseFont));
		taxPercentLabel.setVerticalAlignment(Element.ALIGN_MIDDLE);
		productPanelLabels.addCell(taxPercentLabel);
		PdfPCell amountOfTaxLabel = new PdfPCell(
				new Phrase(frameReferences.getProductPanelLabels().getAmountOfTax(), baseFont));
		amountOfTaxLabel.setVerticalAlignment(Element.ALIGN_MIDDLE);
		productPanelLabels.addCell(amountOfTaxLabel);
		PdfPCell valueWithoutTaxLAbel = new PdfPCell(
				new Phrase(frameReferences.getProductPanelLabels().getValueWithoutTax(), baseFont));
		valueWithoutTaxLAbel.setVerticalAlignment(Element.ALIGN_MIDDLE);
		productPanelLabels.addCell(valueWithoutTaxLAbel);

		PdfPTable productsPanels = new PdfPTable(10);
		productsPanels.setWidths(new int[] { 6, 50, 8, 8, 8, 25, 25, 8, 25, 25 });
		productsPanels.setWidthPercentage(100);
		for (int a = 0; a < 7; a++) {
			productsPanels.addCell(new Phrase(MainFrame.getProductPanels().get(a).getOrdinalNumber().getText(),
					fontWithPolishCharacters4));
			productsPanels.addCell(new Phrase(MainFrame.getProductPanels().get(a).getProductName().getText(),
					fontWithPolishCharacters4));
			productsPanels.addCell("   ");
			productsPanels.addCell(new Phrase(MainFrame.getProductPanels().get(a).getUnitOfMeasure().getText(),
					fontWithPolishCharacters4));
			productsPanels.addCell(
					new Phrase(MainFrame.getProductPanels().get(a).getQuantity().getText(), fontWithPolishCharacters4));
			productsPanels.addCell(new Phrase(MainFrame.getProductPanels().get(a).getPricePerUnit().getText(),
					fontWithPolishCharacters4));
			productsPanels.addCell(new Phrase(String.valueOf(MainFrame.getProductPanels().get(a).getValueWithTax()),
					fontWithPolishCharacters4));
			productsPanels.addCell(new Phrase(MainFrame.getProductPanels().get(a).getTaxPercent(), fontWithPolishCharacters4));
			productsPanels.addCell(new Phrase(String.valueOf(MainFrame.getProductPanels().get(a).getAmountOfTax()),
					fontWithPolishCharacters4));
			productsPanels.addCell(new Phrase(MainFrame.getProductPanels().get(a).getValueWithoutTax().getText(),
					fontWithPolishCharacters4));
		}
		for (int a = 0; a < 5; a++) {
			productsPanels.addCell(" ");
			productsPanels.addCell(" ");
			productsPanels.addCell(" ");
			productsPanels.addCell(" ");
			productsPanels.addCell(" ");
			productsPanels.addCell(" ");
			productsPanels.addCell(" ");
			productsPanels.addCell(" ");
			productsPanels.addCell(" ");
			productsPanels.addCell(" ");
		}

		PdfPTable commentsInWordsAndVatSummaryPanel = new PdfPTable(3);
		commentsInWordsAndVatSummaryPanel.setWidths(new int[] { 80, 25, 83 });
		commentsInWordsAndVatSummaryPanel.setWidthPercentage(100);

		PdfPTable commentsPanel = new PdfPTable(1);
		PdfPCell comments = new PdfPCell();
		comments.setFixedHeight(55); 
		commentsPanel.addCell(frameReferences.getCommentsPanel().getTxtpnComments() + " " + 
				frameReferences.getCommentsPanel().getComments());
		PdfPCell valueInWordsFrame = new PdfPCell();
		valueInWordsFrame.setVerticalAlignment(Element.ALIGN_MIDDLE);

		Paragraph pTotalValue = new Paragraph(
				frameReferences.getInWordsPanel().getValue() + "  " + frameReferences.getInWordsPanel().getAmount(),
				fontUsedByWidgets);
		Paragraph pInWordsLabel = new Paragraph(frameReferences.getInWordsPanel().getInWordsLabel(), fontUsedByWidgets);
		Paragraph pTotalValueInWords = new Paragraph(frameReferences.getInWordsPanel().getInWords(), fontUsedByWidgets);
		Paragraph pCashierLabel = new Paragraph(frameReferences.getInWordsPanel().getLblCashier(), fontUsedByWidgets);
		Paragraph pCashuer = new Paragraph(frameReferences.getInWordsPanel().getCashier(), fontUsedByWidgets);
		valueInWordsFrame.addElement(pTotalValue);
		valueInWordsFrame.addElement(pInWordsLabel);
		valueInWordsFrame.addElement(pTotalValueInWords);
		valueInWordsFrame.addElement(pCashierLabel);
		valueInWordsFrame.addElement(pCashuer);
		commentsPanel.addCell(comments);
		commentsPanel.addCell(valueInWordsFrame);
		commentsInWordsAndVatSummaryPanel.addCell(commentsPanel);

		PdfPCell taxSummaryLabel = new PdfPCell(
				new Phrase(frameReferences.getCommentsPanel().getTxtpnTaxSummary(), fontUsedByWidgets));
		commentsInWordsAndVatSummaryPanel.addCell(taxSummaryLabel);
		PdfPTable vatSummaryFrame = new PdfPTable(1);
		PdfPTable taxRates = new PdfPTable(4);
		taxRates.setWidths(new int[] { 25, 8, 25, 25 });
		taxRates.addCell(frameReferences.getVatSummaryPanel().getValueSummary().getText() + " ");
		taxRates.addCell(frameReferences.getVatSummaryPanel().getTaxPercent().getText() + " ");
		taxRates.addCell(frameReferences.getVatSummaryPanel().getTaxSummary().getText() + " ");
		taxRates.addCell(frameReferences.getVatSummaryPanel().getValueWithoutTaxSummary().getText() + " ");
		for (int a = 0; a < 4; a++) {
			taxRates.addCell(" ");
			taxRates.addCell(" ");
			taxRates.addCell(" ");
			taxRates.addCell(" ");
		}
		PdfPTable vatSummaryInnerFrame = new PdfPTable(1);
		PdfPTable vatSummaryValues = new PdfPTable(4);
		vatSummaryValues.setWidths(new int[] { 25, 8, 25, 25 });
		vatSummaryValues.addCell(frameReferences.getVatSummaryPanel().getValueSummary().getText() + " ");
		vatSummaryValues.addCell(" ");
		vatSummaryValues.addCell(frameReferences.getVatSummaryPanel().getTaxSummary().getText() + " ");
		vatSummaryValues.addCell(frameReferences.getVatSummaryPanel().getValueWithoutTaxSummary().getText() + " ");
		vatSummaryInnerFrame.addCell(vatSummaryValues);
		Paragraph vatSummaryLabel = new Paragraph("£¹czna wartoœæ protoko³u", fontUsedByWidgets);
		// doesn't work aligment to center/middle
		vatSummaryLabel.setAlignment(Element.ALIGN_MIDDLE);

		vatSummaryInnerFrame.addCell(vatSummaryLabel);
		vatSummaryFrame.addCell(taxRates);
		vatSummaryFrame.addCell(vatSummaryInnerFrame);
		commentsInWordsAndVatSummaryPanel.addCell(vatSummaryFrame);

		PdfPTable totalSummary = new PdfPTable(2);
		totalSummary.setWidths(new int[] { 2, 1 });
		totalSummary.setWidthPercentage(60);
		totalSummary.setHorizontalAlignment(Element.ALIGN_LEFT);
		totalSummary.addCell(new Phrase(frameReferences.getTotalSummary().getTxtpnDecreasingGrossSales(), fontUsedByWidgets));
		totalSummary.addCell(new Phrase("kwota z³  " + frameReferences.getTotalSummary().getTotalValue(), fontUsedByWidgets));
		totalSummary.addCell(new Phrase(frameReferences.getTotalSummary().getTxtpnDecreasingTax(), fontUsedByWidgets));
		totalSummary.addCell(new Phrase("kwota z³  " + frameReferences.getTotalSummary().getTax(), fontUsedByWidgets));
		totalSummary.addCell(new Phrase(frameReferences.getTotalSummary().getTxtpnDecreasingNetSales(), fontUsedByWidgets));
		totalSummary.addCell(new Phrase("kwota z³  " + frameReferences.getTotalSummary().getNetValue(), fontUsedByWidgets));

		Paragraph br = new Paragraph(" ");

		PdfPTable reciepeAndTill = new PdfPTable(2);
		reciepeAndTill.setWidthPercentage(60);
		reciepeAndTill.setHorizontalAlignment(Element.ALIGN_LEFT);
		reciepeAndTill.addCell(new Phrase(frameReferences.getReciepeAndTillPanel().getTxtpnReciepeAdded(), fontUsedByWidgets));
		reciepeAndTill.addCell(new Phrase(" " + frameReferences.getReciepeAndTillPanel().getReciepeNr(), fontUsedByWidgets));
		reciepeAndTill.addCell(new Phrase(frameReferences.getReciepeAndTillPanel().getTxtpnTillNr(), fontUsedByWidgets));
		reciepeAndTill.addCell(new Phrase(" " + frameReferences.getReciepeAndTillPanel().getTillNr(), fontUsedByWidgets));

		Paragraph postedBy = new Paragraph("Zatwierdzi³:    "+ frameReferences.getInWordsPanel().getCashier(),
				fontUsedByWidgets);

		document.add(companyDataMainInfoAndReason);
		document.add(productPanelLabels);
		document.add(productsPanels);

		document.add(commentsInWordsAndVatSummaryPanel);
		document.add(br);
		document.add(br);
		document.add(totalSummary);
		document.add(br);
		document.add(br);
		document.add(reciepeAndTill);
		document.add(br);
		document.add(br);
		document.add(br);
		document.add(br);
		document.add(postedBy);
	}
}
