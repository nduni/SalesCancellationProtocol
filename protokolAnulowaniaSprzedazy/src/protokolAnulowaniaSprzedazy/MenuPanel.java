package protokolAnulowaniaSprzedazy;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

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

		JMenuItem mntmNowy = new JMenuItem("Nowy");
		mnNewMenu.add(mntmNowy);

		JMenuItem mntmOtwrz = new JMenuItem("Otw\u00F3rz");
		mnNewMenu.add(mntmOtwrz);

		JMenuItem mntmZamknij = new JMenuItem("Zamknij");
		mnNewMenu.add(mntmZamknij);

		JMenu mnNewMenu_1 = new JMenu("Ustawienia");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmBazaProduktw = new JMenuItem("Baza produkt\u00F3w");
		mnNewMenu_1.add(mntmBazaProduktw);

		JMenuItem mntmKasjerzy = new JMenuItem("Kasjerzy");
		mnNewMenu_1.add(mntmKasjerzy);

		JMenuItem mntmEdycjaKasFiskalnych = new JMenuItem("Kasy fiskalne");
		mnNewMenu_1.add(mntmEdycjaKasFiskalnych);

		JMenu mnPomoc = new JMenu("Pomoc");
		menuBar.add(mnPomoc);
	}

}
