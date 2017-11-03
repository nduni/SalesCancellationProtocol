package ui.panels;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPanel extends JPanel {
	public MenuPanel() {
		super();
		createComponents();
	}

	private void createComponents() {
		setLayout(null);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 160, 20);
		add(menuBar);
		JMenu mnNewMenu = new JMenu("Plik");
		menuBar.add(mnNewMenu);

		JMenuItem newProtocol = new JMenuItem("Nowy");
		mnNewMenu.add(newProtocol);

		JMenuItem open = new JMenuItem("Otw\u00F3rz");
		mnNewMenu.add(open);

		JMenuItem close = new JMenuItem("Zamknij");
		mnNewMenu.add(close);
		

		JMenu settings = new JMenu("Ustawienia");
		menuBar.add(settings);

		JMenuItem productsSource = new JMenuItem("Baza produkt\u00F3w");
		settings.add(productsSource);

		JMenuItem mntmKasjerzy = new JMenuItem("Kasjerzy");
		mntmKasjerzy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				manageCashierFrame();
			}
		});
		settings.add(mntmKasjerzy);

		JMenuItem mntmEdycjaKasFiskalnych = new JMenuItem("Kasy fiskalne");
		settings.add(mntmEdycjaKasFiskalnych);

		JMenu mnPomoc = new JMenu("Pomoc");
		menuBar.add(mnPomoc);
	}

	protected void manageCashierFrame() {
		CashierManager manager = new CashierManager();
	}

}
