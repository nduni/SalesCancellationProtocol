package ui.panels.ProductPanel;

import java.math.BigDecimal;
import javax.swing.JPanel;
import javax.swing.JTextField;
import controller.ProductPanelController;
import controller.ProductPanelListener;
import ui.panels.InWordsPanel;
import ui.panels.TotalSummaryPanel;
import ui.panels.VatSummaryPanel;

public class ProductPanel extends JPanel {
	private JTextField ordinalNumber;
	private JTextField productName;
	private JTextField unitOfMeasure;
	private JTextField quantity;
	private JTextField pricePerUnit;
	private JTextField valueWithTax;
	private JTextField taxPercent;
	private JTextField amountOfTax;
	private JTextField valueWithoutTax;
	private VatSummaryPanel vatSummaryPanel;
	private InWordsPanel inWordsPanel;
	private TotalSummaryPanel totalSummaryPanel;
	private BigDecimal valueToWord;
	private ProductPanelController productPanelController; 
	
	public ProductPanel(VatSummaryPanel vatSummaryPanel, InWordsPanel inWordsPanel,
			TotalSummaryPanel totalSummaryPanel) {
		super();
		this.vatSummaryPanel = vatSummaryPanel;
		this.inWordsPanel = inWordsPanel;
		this.totalSummaryPanel = totalSummaryPanel;
		createComponents();
	}

	private void createComponents() {
		setLayout(null);
		
		this.productPanelController = new ProductPanelController(this);
		ordinalNumber = new JTextField();
		ordinalNumber.setBounds(10, 0, 25, 20);
		ordinalNumber.setColumns(10);

		productName = new JTextField();
		productName.setBounds(35, 0, 180, 20);
		productName.setColumns(10);

		unitOfMeasure = new JTextField();
		unitOfMeasure.setBounds(215, 0, 25, 20);
		unitOfMeasure.setColumns(10);

		quantity = new JTextField();
		ProductPanelListener textFieldListener = new ProductPanelListener(this);
		
		quantity.addFocusListener(textFieldListener);
		quantity.addKeyListener(textFieldListener);
		quantity.setBounds(240, 0, 25, 20);
		quantity.setColumns(10);
		pricePerUnit = new JTextField();
		pricePerUnit.addFocusListener(textFieldListener);
		pricePerUnit.addKeyListener(textFieldListener);

		pricePerUnit.setBounds(265, 0, 60, 20);
		pricePerUnit.setColumns(10);

		valueWithTax = new JTextField();
		valueWithTax.setBounds(325, 0, 60, 20);
		valueWithTax.setColumns(10);

		taxPercent = new JTextField();
		taxPercent.setBounds(385, 0, 25, 20);
		taxPercent.setColumns(10);

		amountOfTax = new JTextField();
		amountOfTax.setBounds(410, 0, 60, 20);
		amountOfTax.setColumns(10);

		valueWithoutTax = new JTextField();
		valueWithoutTax.setBounds(470, 0, 60, 20);
		valueWithoutTax.setColumns(10);
		add(ordinalNumber);
		add(productName);
		add(unitOfMeasure);
		add(quantity);
		add(pricePerUnit);
		add(valueWithTax);
		add(taxPercent);
		add(amountOfTax);
		add(valueWithoutTax);

	}
	
	public String getValueWithTax() {
		if (productPanelController.hasDouble(valueWithTax)) {
			return valueWithTax.getText();
		} else {
			return "";
		}
	}

	public String getTaxPercent() {
		if (productPanelController.hasDouble(taxPercent)) {
			return taxPercent.getText();
		} else {
			return "";
		}
	}

	public String getAmountOfTax() {
		if (productPanelController.hasDouble(amountOfTax)) {
			return amountOfTax.getText();
		} else {
			return "";
		}
	}

	public JTextField getOrdinalNumber() {
		return ordinalNumber;
	}

	public JTextField getProductName() {
		return productName;
	}

	public JTextField getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public JTextField getQuantity() {
		return quantity;
	}

	public JTextField getPricePerUnit() {
		return pricePerUnit;
	}

	public JTextField getValueWithoutTax() {
		return valueWithoutTax;
	}

	public VatSummaryPanel getVatSummaryPanel() {
		return vatSummaryPanel;
	}

	public InWordsPanel getInWordsPanel() {
		return inWordsPanel;
	}

	public TotalSummaryPanel getTotalSummaryPanel() {
		return totalSummaryPanel;
	}

	public BigDecimal getValue() {
		return getValueToWord();
	}

	public BigDecimal valueWithoutTax() {
		if (productPanelController.hasDouble(valueWithoutTax)) {
			return new BigDecimal(valueWithoutTax.getText());
		} else {
			return new BigDecimal(0.0);
		}
	}

	public void setQuantity(String quantity) {
		this.quantity.setText(quantity);
	}

	public void setPricePerUnit(String pricePerUnit) {
		this.pricePerUnit.setText(pricePerUnit);
	}

	public void setValueWithTax(String valueWithTax) {
		this.valueWithTax.setText(valueWithTax);
	}

	public void setTaxPercent(String taxPercent) {
		this.taxPercent.setText(taxPercent);
	}

	public void setAmountOfTax(String amountOfTax) {
		this.amountOfTax.setText(amountOfTax);
	}

	public void setValueWithoutTax(String valueWithoutTax) {
		this.valueWithoutTax.setText(valueWithoutTax);
	}

	public BigDecimal getValueToWord() {
		return valueToWord;
	}

	public void setValueToWord(BigDecimal valueToWord) {
		this.valueToWord = valueToWord;
	}

	public ProductPanelController getProductPanelController() {
		return productPanelController;
	}

	public void setProductPanelController(ProductPanelController productPanelController) {
		this.productPanelController = productPanelController;
	}
}
