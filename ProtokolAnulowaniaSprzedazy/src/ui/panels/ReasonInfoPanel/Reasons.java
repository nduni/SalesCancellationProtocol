package ui.panels.ReasonInfoPanel;

public class Reasons {
	private String key;
	private String value;

	public Reasons(String key, String value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}
}
