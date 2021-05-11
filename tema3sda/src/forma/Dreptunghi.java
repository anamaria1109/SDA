package forma;

public class Dreptunghi implements Forma{
	
	private String fillColor;
	private int borderWidth, height, width;
	private HexColorValidation val;
	private static final String Dreptunghi = "Dreptunghi";

	public Dreptunghi(String fillColor, int borderWidth, int height, int width) throws IllegalArgumentException {
		this.val = new HexColorValidation();
		if (val.validate(fillColor))
			this.fillColor = fillColor;
		else
			throw new IllegalArgumentException(Dreptunghi + " : invalid color");

		if (borderWidth > 0)
			this.borderWidth = borderWidth;
		else
			throw new IllegalArgumentException(Dreptunghi + " : invalid border width");

		if (height > 0)
			this.height = height;
		else
			throw new IllegalArgumentException(Dreptunghi + " : invalid height");

		if (width > 0)
			this.width = width;
		else
			throw new IllegalArgumentException(Dreptunghi + ": invalid width");
	}

	public String getHexFillColor() {
		return fillColor;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public double getArea() {
		return height * width;
	}

	@Override
	public String getName() {
		return Dreptunghi;
	}

	@Override
	public void draw() {
		int i, j;
		for (i = 0; i < height; i++) {
			for (j = 0; j < width; j++) {
				if (i == 0 || i == height - 1 || j == 0 || j == width - 1)
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}


}
