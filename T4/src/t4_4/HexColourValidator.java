package t4_4;
import java.util.regex.*;

public class HexColourValidator {
	

	private Pattern pattern;
	private Matcher matcher;
	private static final String HEX_PATTERN = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";

	public HexColourValidator() 
	{
		pattern = Pattern.compile(HEX_PATTERN);
	}

	public boolean validate(final String hexColorCode)
	{

		matcher = pattern.matcher(hexColorCode);
		return matcher.matches();
	}


}
