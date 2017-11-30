package ui.panels.ProductPanel;
import java.text.NumberFormat;

public class NumberInWords {

	public static final String[] units = { "", "jeden", "dwa", "trzy", "cztery", "piêæ", "szeœæ", "siedem", "osiem",
			"dziewiêæ", "dziesiêæ", "jedenaœcie", "dwanaœce", "trzynaœcie", "czternaœcie", "piêtnaœcie", "szesnaœcie",
			"siedemnaœcie", "osiemnaœcie", "dziewiêtnaœcie" };

	public static final String[] tens = { "", "", "dwadzieœcia", "trzydzieœci", "czterdzieœci", "piêædziesi¹t",
			"szeœædziesi¹t", "siedemdziesi¹t", "osiemdziesi¹t", "dziewiêædziesi¹t" };

	public static final String[] hundreds = { "", "sto", "dwieœcie ", "trzysta ", "czterysta ", "piêæset ", "szeœæset ",
			"siedemset ", "osiemset ", "dziewiêæset ", };

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
			return " tysi¹c";
		} else if ((n / 1000) < 5) {
			return " tysi¹ce";
		} else {
			return " tysiêcy";
		}
	}

}