package t4_4;

import java.util.HashMap;
import java.util.Map;

public class main {

	public static void main(String[] args)
	{
		Shape[] sir = new Shape[4];
		sir[0] = new Rectangle("#010101",1,1,1);
		sir[1] = new Square("#010101",1,1);
		sir[2] = new Circle("#022010",1,1);
		sir[3] = new Rectangle("#010321",1,1,1);
		
		HashMap<String, Integer> m = new HashMap<String,Integer>();
		for(int i = 0; i < 4; i++)
		{
			if(!m.containsKey(sir[i].getHexFillColor()) )
			{
				m.put(sir[i].getHexFillColor(), 1);
			}
			else m.put(sir[i].getHexFillColor(),m.get(sir[i].getHexFillColor()) + 1);
		}
		
		for(Map.Entry<String, Integer> set : m.entrySet())
		{
			System.out.println(set.getKey() + " - " + set.getValue());
		}
	}

	
}
