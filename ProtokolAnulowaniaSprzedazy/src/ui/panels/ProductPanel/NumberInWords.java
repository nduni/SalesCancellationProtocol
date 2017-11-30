package ui.panels.ProductPanel;
import java.text.NumberFormat;

public class NumberInWords {

	public static final String[] units = { "", "jeden", "dwa", "trzy", "cztery", "pi��", "sze��", "siedem", "osiem",
			"dziewi��", "dziesi��", "jedena�cie", "dwana�ce", "trzyna�cie", "czterna�cie", "pi�tna�cie", "szesna�cie",
			"siedemna�cie", "osiemna�cie", "dziewi�tna�cie" };

	public static final String[] tens = { "", "", "dwadzie�cia", "trzydzie�ci", "czterdzie�ci", "pi��dziesi�t",
			"sze��dziesi�t", "siedemdziesi�t", "osiemdziesi�t", "dziewi��dziesi�t" };

	public static final String[] hundreds = { "", "sto", "dwie�cie ", "trzysta ", "czterysta ", "pi��set ", "sze��set ",
			"siedemset ", "osiemset ", "dziewi��set ", };

	public static String convert(final int n) {
		if (n < 0) {
			return "Minus " + convert(-n);
		}

		if (n < 20) {
			return units[n];
		}

		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}

		if (n < 1000) {
			return hundreds[n / 100] + ((n % 100 != 0) ? " " : "") + convert(n % 100);
		}
		if (n < 10000) {
			return convert(n / 1000) + thousandChecking(n) + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
		}
		return "";
	}

	//
	public static String thousandChecking(final int n) {
		if ((n / 1000) == 1) {
			return " tysi�c";
		} else if ((n / 1000) < 5) {
			return " tysi�ce";
		} else {
			return " tysi�cy";
		}
	}

}