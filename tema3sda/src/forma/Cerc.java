package forma;

public class Cerc implements Forma{
	
	private String fillColor;
	private int borderWidth, radius;
	private HexColorValidation val;
	private static final String Cerc = "Cerc";

	public Cerc(String fillColor, int borderWidth, int radius) throws IllegalArgumentException {

		this.val = new HexColorValidation();
		if (val.validate(fillColor))
			this.fillColor = fillColor;
		else
			throw new IllegalArgumentException(Cerc + " : invalid color");

		if (borderWidth > 0)
			this.borderWidth = borderWidth;
		else
			throw new IllegalArgumentException(Cerc + " : invalid border width");

		if (radius > 0)
			this.radius = radius;
		else
			throw new IllegalArgumentException(Cerc + " : invalid radius");
	}

	public String getHexFillColor() {
		return fillColor;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public double getArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public String getName() {
		return "Cerc";
	}

	@Override
	public void draw() {
		double dist;
		for (int i = 0; i <= 2 * radius; i++) {
			for (int j = 0; j <= 2 * radius; j++) {
				dist = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));

				if (dist > radius - 0.5 && dist < radius + 0.5)
					System.out.print("# ");
				else
					System.out.print("  ");
			}

			System.out.print("\n");
		}

	}

}
