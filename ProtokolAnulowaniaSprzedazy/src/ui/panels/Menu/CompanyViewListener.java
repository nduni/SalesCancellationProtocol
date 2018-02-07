package ui.panels.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CompanyViewListener implements WindowListener, ActionListener {
	private CompanyView companyView;
		
	public CompanyViewListener(CompanyView companyView) {
		this.companyView = companyView;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		companyView.getCompanyDataController().saveFile();
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		companyView.getFrame().setDefaultCloseOperation(companyView.getFrame().DISPOSE_ON_CLOSE);
		companyView.getMainFrame().setEnabled(true);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
	}

}
