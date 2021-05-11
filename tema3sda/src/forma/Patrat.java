package forma;

public class Patrat implements Forma {
	
	private String fillColor;
	private int borderWidth;
	private int size;
	private HexColorValidation val;
	private static final String Patrat = "Patrat";

	public Patrat(String fillColor, int borderWidth, int size) throws IllegalArgumentException {
		this.val = new HexColorValidation();

		if (val.validate(fillColor))
			this.fillColor = fillColor;
		else
			throw new IllegalArgumentException(Patrat + " : invalid color");
		if (borderWidth > 0)
			this.borderWidth = borderWidth;
		else
			throw new IllegalArgumentException(Patrat + " : invalid border width");

		if (size > 0)
			this.size = size;
		else
			throw new IllegalArgumentException(Patrat + " : invalid size");

	}

	

	public String getHexFillColor() {
		return fillColor;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public int getSize() {
		return size;
	}

	@Override
	public double getArea() {
		return size * size;
	}

	@Override
	public String getName() {
		return Patrat;
	}

	@Override
	public void draw() {
		int i, j;
		for (i = 0; i < size; i++) {
			for (j = 0; j < size; j++) {
				if (i == 0 || i == size - 1 || j == 0 || j == size - 1)
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}


