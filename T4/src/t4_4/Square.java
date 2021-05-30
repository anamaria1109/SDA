package t4_4;

public class Square implements Shape {

	private String fillColor;
	private int borderWidth, size;
	private HexColourValidator val;
	private static final String Square = "Square";

	public Square(String fillColor, int borderWidth, int size) throws IllegalArgumentException 
	{
		this.val = new HexColourValidator();

		if (val.validate(fillColor))
			this.fillColor = fillColor;
		else
			throw new IllegalArgumentException(Square + " : invalid color");
		if (borderWidth > 0)
			this.borderWidth = borderWidth;
		else
			throw new IllegalArgumentException(Square + " : border width invalid");

		if (size > 0)
			this.size = size;
		else
			throw new IllegalArgumentException(Square + " : size invalid");

	}

	

	public String getHexFillColor()
	{
		return fillColor;
	}

	public int getBorderWidth() 
	{
		return borderWidth;
	}

	public int getSize() 
	{
		return size;
	}

	@Override
	public double getArea() 
	{
		return size * size;
	}

	@Override
	public String getName()
	{
		return Square;
	}

	@Override
	public void draw() 
	{
		int i, j;
		for (i = 0; i < size; i++) 
		{
			for (j = 0; j < size; j++) 
			{
				if (i == 0 || i == size - 1 || j == 0 || j == size - 1)
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
