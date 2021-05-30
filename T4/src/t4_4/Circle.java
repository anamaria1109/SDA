package t4_4;

public class Circle implements Shape {

	private String fillColor;
	private int borderWidth, radius;
	private HexColourValidator val;
	private static final String Circle = "Circle";

	public Circle(String fillColor, int borderWidth, int radius) throws IllegalArgumentException 
	{

		this.val = new HexColourValidator();
		if (val.validate(fillColor))
			this.fillColor = fillColor;
		else
			throw new IllegalArgumentException(Circle + " : invalid color");

		if (borderWidth > 0)
			this.borderWidth = borderWidth;
		else
			throw new IllegalArgumentException(Circle + " : invalid border width");

		if (radius > 0)
			this.radius = radius;
		else
			throw new IllegalArgumentException(Circle + " : invalid radius");
	}

	public String getHexFillColor() 
	{
		return fillColor;
	}

	public int getBorderWidth()
	{
		return borderWidth;
	}

	public int getRadius() 
	{
		return radius;
	}

	@Override
	public double getArea() 
	{
		return 3.14 * radius * radius;
	}

	@Override
	public String getName() 
	{
		return "Circle";
	}

	@Override
	public void draw() 
	{
		double dist;
		for (int i = 0; i <= 2 * radius; i++) 
		{
			for (int j = 0; j <= 2 * radius; j++) 
			{
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
