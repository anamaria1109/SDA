package forma;

import java.util.regex.*;


public class HexColorValidation {
	
	private Pattern pattern;
	private Matcher matcher;
	private static final String HEX_PATTERN = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";

	public HexColorValidation() {
		pattern = Pattern.compile(HEX_PATTERN);
	}

	public boolean validate(final String hexColorCode) {

		matcher = pattern.matcher(hexColorCode);
		return matcher.matches();
	}


}
