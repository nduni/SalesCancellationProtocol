package controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JTextField;
import ui.MainFrame;
import ui.panels.ProductPanel.NumberInWords;
import ui.panels.ProductPanel.ProductPanel;

public class ProductPanelController {
	private ProductPanel productPanel;
	
	public ProductPanelController(ProductPanel productPanel) {
		this.productPanel = productPanel;
	}

	

	public void calculateAndFillTheWholeFrame() {
		if (hasDouble(productPanel.getPricePerUnit()) && hasDouble(productPanel.getQuantity())) {
			multiplication(productPanel.getQuantity(), productPanel.getPricePerUnit());
		} else {
			leaveEmptyFields();
		}
		summingupProductPanel();
		summurizingVatInVatSummaryPanel();
		amountInWords();
	}

	public boolean hasDouble(JTextField jT) {
		try {
			double d = Double.parseDouble(jT.getText());
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	public void multiplication(JTextField jTF1, JTextField jTF2) {
		BigDecimal d1 = new BigDecimal(jTF1.getText());
		BigDecimal d2 = new BigDecimal(jTF2.getText());
		BigDecimal value = d1.multiply(d2);
		BigDecimal tax = new BigDecimal(1.23);
		productPanel.setValueWithTax(value.setScale(2, BigDecimal.ROUND_HALF_UP).toString());
		productPanel.setTaxPercent("23");
		productPanel.setValueWithoutTax(value.divide(tax, 2, BigDecimal.ROUND_HALF_UP).toString());
		productPanel.setAmountOfTax(value.subtract(value.divide(tax, 2, BigDecimal.ROUND_HALF_UP)).toString());
	}

	void leaveEmptyFields() {
		productPanel.setValueWithoutTax("");
		productPanel.setAmountOfTax("");
		productPanel.setValueWithoutTax("");
	}

	public void summingupProductPanel() {
		ArrayList<ProductPanel> productPanels = new ArrayList<ProductPanel>();
		productPanels = MainFrame.getProductPanels();
		BigDecimal value = new BigDecimal(0.0);
		BigDecimal tax = new BigDecimal(0.0);
		BigDecimal net = new BigDecimal(0.0);
		for (ProductPanel p : productPanels) {
			try {
				value = value.add(new BigDecimal(notNull(p.getValueWithTax())));
				tax = tax.add(new BigDecimal(notNull(p.getAmountOfTax())));
				net = net.add(p.valueWithoutTax());
			} catch (NullPointerException e) {
	
			}
		}
		setValuesInVatSummaryPanel(value, tax, net);
		productPanel.setValueToWord(value);
	}
	public void amountInWords() {
		String s = NumberInWords.convert(productPanel.getValueToWord());
		productPanel.getInWordsPanel().setInWords(s);
		productPanel.getInWordsPanel().setAmount(productPanel.getValueToWord().toString());
	
	}
	public void setValuesInVatSummaryPanel(BigDecimal value, BigDecimal tax, BigDecimal net) {
		productPanel.getVatSummaryPanel().setValueSummary(String.valueOf(value));
		productPanel.getVatSummaryPanel().setTaxSummary(String.valueOf(tax));
		productPanel.getVatSummaryPanel().setValueWithoutTaxSummary(String.valueOf(net));
		productPanel.getVatSummaryPanel().setTaxPercent(productPanel.getTaxPercent());
	}
	
	String notNull(String valueWithTax2) {
		if (valueWithTax2.equals("")) {
			return "0";
		} else {
			return valueWithTax2;
		}
	}
	private void summurizingVatInVatSummaryPanel() {
		productPanel.getTotalSummaryPanel().summarizeVat();
		
	}
}
