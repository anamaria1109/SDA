package tema5;

import java.util.ArrayList;

public class StudentDetails {

	private String nume;
	private String prenume;
	private ArrayList<Double> noteLimbRomana;
	private ArrayList<Double> noteMatematica;
	
	
	public StudentDetails() {
	
	}
	public StudentDetails(String nume, String prenume, ArrayList<Double> noteLimbRomana,
			ArrayList<Double> noteMatematica) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.noteLimbRomana = noteLimbRomana;
		this.noteMatematica = noteMatematica;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public ArrayList<Double> getNoteLimbRomana() {
		return noteLimbRomana;
	}
	public void setNoteLimbRomana(ArrayList<Double> noteLimbRomana) {
		this.noteLimbRomana = noteLimbRomana;
	}
	public ArrayList<Double> getNoteMatematica() {
		return noteMatematica;
	}
	public void setNoteMatematica(ArrayList<Double> noteMatematica) {
		this.noteMatematica = noteMatematica;
	}
	
	

}
