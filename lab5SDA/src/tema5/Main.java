package tema5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private static Scanner sc;
	public static void main(String[] args) {

		Map<String, StudentDetails> students = new HashMap<String,StudentDetails>();
		insertStudents(students);
		System.out.println("Introduce-ti cnp-ul: ");
		sc = new Scanner(System.in);
		String cnp = sc.nextLine();
		StudentDetails sd = students.get(cnp);
		printStudentDetails(sd);
		Map<String,StudentDetails> linkedStudents = new LinkedHashMap<String,StudentDetails>();
		insertStudents(linkedStudents);
		
		boolean ok = true;
		String lastKey = "begin";
		for(String key : linkedStudents.keySet())
		{
			
			if(lastKey != "begin" && lastKey.compareTo(key) >= 0)
			{
				ok = false;
			}
			lastKey = key;
			System.out.println(key);
		}
		if(ok)
			System.out.println("Is the same order");
		else System.out.println("Is not the same order");
		cnp = "5000000123456";

		linkedStudents.put(cnp,new StudentDetails("Diana","Popa",
									new ArrayList<Double>(Arrays.asList(8.0,10.0,8.0)),
									new ArrayList<Double>(Arrays.asList(5.0,9.0,7.0))));
		printStudentDetails(linkedStudents.get(cnp));
						
}
	
private static void printStudentDetails(StudentDetails sd)
{
	System.out.println("Nume complet: " + sd.getNume() + " " + sd.getPrenume());
	System.out.print("Note matematica : ");
	for(Double d : sd.getNoteMatematica())
		System.out.print(d + " ");
	System.out.println();
	System.out.print("Note romana : ");
	for(Double d : sd.getNoteLimbRomana())
		System.out.print(d + " ");
	System.out.println();
}
private static void insertStudents(Map<String,StudentDetails>students)
{
	students.put("5000000123456",new StudentDetails("Iulia","Hurloi",
								new ArrayList<Double>(Arrays.asList(9.0,10.0,8.0)),
								new ArrayList<Double>(Arrays.asList(5.0,10.0,7.0))));

	students.put("5000000123457",new StudentDetails("Stefania","Maracine",
								new ArrayList<Double>(Arrays.asList(7.0,7.0,8.0)),
								new ArrayList<Double>(Arrays.asList(6.0,9.0,7.0))));
	students.put("5000000123458",new StudentDetails("Tiberiu","Balint",
			new ArrayList<Double>(Arrays.asList(7.0,7.0,8.0)),
			new ArrayList<Double>(Arrays.asList(6.0,9.0,7.0))));
	students.put("5000000123459",new StudentDetails("Monalisa","Chirila",
			new ArrayList<Double>(Arrays.asList(7.0,8.0,9.0)),
			new ArrayList<Double>(Arrays.asList(6.0,9.0,7.0))));
	students.put("5000000123460",new StudentDetails("Sebastian","Ciotirca",
			new ArrayList<Double>(Arrays.asList(7.0,7.0,8.0)),
			new ArrayList<Double>(Arrays.asList(6.0,9.0,7.0))));
	students.put("5000000123461",new StudentDetails("Adrian","Ciotirca",
			new ArrayList<Double>(Arrays.asList(9.0,2.0,6.0)),
			new ArrayList<Double>(Arrays.asList(7.0,3.0,4.0))));
	students.put("5000000123462",new StudentDetails("Anca","Barbu",
			new ArrayList<Double>(Arrays.asList(7.0,7.0,8.0)),
			new ArrayList<Double>(Arrays.asList(6.0,9.0,7.0))));
	students.put("5000000123463",new StudentDetails("Catalina","Proteasa",
			new ArrayList<Double>(Arrays.asList(7.0,10.0,8.0)),
			new ArrayList<Double>(Arrays.asList(6.0,9.0,10.0))));
	students.put("5000000123464",new StudentDetails("Nicolae","Parascan",
			new ArrayList<Double>(Arrays.asList(7.0,10.0,8.0)),
			new ArrayList<Double>(Arrays.asList(10.0,9.0,7.0))));
	students.put("5000000123465",new StudentDetails("Alexandra","Rusu",
			new ArrayList<Double>(Arrays.asList(7.0,7.0,8.0)),
			new ArrayList<Double>(Arrays.asList(6.0,9.0,7.0))));
}
}
