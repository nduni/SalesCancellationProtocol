package controller;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import ui.panels.ProductPanel.ProductPanel;

public class ProductPanelListener implements KeyListener, FocusListener{
	
	private ProductPanel productPanel;
	
	public ProductPanelListener(ProductPanel productPanel) {
		this.productPanel= productPanel;
	}

	@Override
	public void focusGained(FocusEvent e) {
		productPanel.getProductPanelController().calculateAndFillTheWholeFrame();		
	}

	@Override
	public void focusLost(FocusEvent e) {
		productPanel.getProductPanelController().calculateAndFillTheWholeFrame();		
	}

	@Override
	public void keyPressed(KeyEvent e) {		
	}

	@Override
	public void keyReleased(KeyEvent e) {		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		productPanel.getProductPanelController().calculateAndFillTheWholeFrame();		
	}
}